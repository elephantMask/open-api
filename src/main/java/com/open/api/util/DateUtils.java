package com.open.api.util;

import org.apache.commons.lang.time.DateFormatUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * <p>Title: DateUtils . </p>
 * <p>Date工具包,根据commons-lang3进行实现  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-11 下午1:14
 */
public class DateUtils {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    public static final String YYYYMMDD = "yyyyMMdd";

    public static final String YYMMDD = "yyMMdd";

    public static final String YYYY_MM = "yyyy-MM";

    public static final String YYYYMMDDHHMM = "yyyyMMddHHmm";

    public static final String YYYYMMDD_HH = "yyyyMMdd_HH";

    public static final String YYYY_MM_DD_00_00_00 = "yyyy-MM-dd 00:00:00";

    public static final String YYYY_MM_DD_23_59_59 = "yyyy-MM-dd 23:59:59";


    /**
    * <p>Title: . </p>
    * <p>时间转换为String,format为空,默认一个格式 </p>
    *
    * @param date 时间
     * @param  format 格式
    * @author <a href="xmt08sky@126.com"/>mint</a>
    * @CreateDate 2018-08-11 下午1:14
    * @return 转换的时间字符串
    */
    public static String dateToString(Date date, String format) {
        if (PubUtils.isNull(date)) {
            throw new NullPointerException("时间不能为空");
        }
        if (PubUtils.isNull(format)) {
            format = YYYY_MM_DD_HH_MM_SS;
        }
        
        return DateFormatUtils.format(date, format);

    }


    public static Date stringToDate(String date,String... format){
        if (PubUtils.isNull(date,format)) {
            throw new NullPointerException("时间和格式不能为空");
        }
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(date,format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
