package com.open.api.util;



import java.io.Serializable;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Enumeration;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Title: ObjectId . </p>
 * <p>生成分布式ID,模拟mongoDB
 * MongoDB 的ObjectId生成规则为:
 * 时间戳+机器+PID+计数器
 * 为什么要写分布式ID,保证ID的全局唯一,安全,内存小,性能提升
 * 不用自增:虽然有序,切占物理内存小,但多台数据库你是不是就保证不了全局
 * 不用UUID:无序,根据sql索引优化,B+树的原理可知,这样会导致很多次分裂,数据量大了,占物理内存大,效率上有影响
 *
 *
 * </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-10 下午1:16
 */
public class ObjectId implements Comparable<ObjectId>, Serializable {
    private static final long serialVersionUID = 7594598034155775987L;

    private final int time;
    private final int machine;
    private final int inc;
    private static int genMachine;


    private static AtomicInteger nextInc = new AtomicInteger((new Random()).nextInt());

    public ObjectId() {
        this.time = (int) (System.currentTimeMillis() / 1000);
        machine = genMachine;
        inc = nextInc.getAndIncrement();
    }


    public static String id() {
        return get().toHexString();
    }

    public static String getObjectId(Date date){
        int time = (int)(date.getTime()/1000);
        byte[] b = new byte[12];
        ByteBuffer bb = ByteBuffer.wrap(b);
        final StringBuilder buf = new StringBuilder(24);
        bb.putInt(time);
        for (final byte b1 : b) {
            buf.append(String.format("%02x", b1 & 0xff));
        }
        return buf.toString();
    }


    private static ObjectId get() {
        return new ObjectId();
    }


    private String toHexString() {
        final StringBuilder buf = new StringBuilder(24);
        for (final byte b : toByteArray()) {
            buf.append(String.format("%02x", b & 0xff));
        }
        return buf.toString();
    }

    private byte[] toByteArray() {
        byte b[] = new byte[12];
        ByteBuffer bb = ByteBuffer.wrap(b);
        bb.putInt(time);
        bb.putInt(machine);
        bb.putInt(inc);
        return b;
    }

    private int compareUnsigned(int i, int j) {
        long li = 0xFFFFFFFFL;
        li = i & li;
        long lj = 0xFFFFFFFFL;
        lj = j & lj;
        long diff = li - lj;
        if (diff < Integer.MIN_VALUE) {

            return Integer.MIN_VALUE;
        }
        if (diff > Integer.MAX_VALUE) {

            return Integer.MAX_VALUE;
        }
        return (int) diff;
    }

    @Override
    public int compareTo(ObjectId id) {
        if (id == null) {

            return -1;
        }

        int x = compareUnsigned(time, id.time);
        if (x != 0) {
            return x;

        }

        x = compareUnsigned(machine, id.machine);
        if (x != 0) {

            return x;
        }

        return compareUnsigned(inc, id.inc);
    }


    static {
        try {
            int machinePiece;
            {
                try {
                    StringBuilder sb = new StringBuilder();
                    Enumeration<NetworkInterface> e = NetworkInterface.getNetworkInterfaces();
                    while (e.hasMoreElements()) {
                        NetworkInterface ni = e.nextElement();
                        sb.append(ni.toString());
                    }
                    machinePiece = sb.toString().hashCode() << 16;
                } catch (Throwable e) {
                    machinePiece = (new Random().nextInt()) << 16;
                }
            }
            final int processPiece;
            {
                int processId = new Random().nextInt();
                try {
                    processId = java.lang.management.ManagementFactory.getRuntimeMXBean().getName().hashCode();
                } catch (Throwable t) {
                }

                ClassLoader loader = ObjectId.class.getClassLoader();
                int loaderId = loader != null ? System.identityHashCode(loader) : 0;

                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toHexString(processId));
                sb.append(Integer.toHexString(loaderId));
                processPiece = sb.toString().hashCode() & 0xFFFF;
            }

            genMachine = machinePiece | processPiece;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
