package com.open.api.service.interfacemanager;

import com.open.api.module.domain.InterfaceMonitor;
import com.open.api.service.IService;


/**
 * <p>Title: InterfaceMonitorService . </p>
 * <p>接口监控service  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-05-02 下午4:59
 */
public interface InterfaceMonitorService extends IService<InterfaceMonitor> {

    int saveInterfaceMonitor(InterfaceMonitor interfaceMonitor);

    int updateInterfaceMonitor(InterfaceMonitor interfaceMonitor);


}
