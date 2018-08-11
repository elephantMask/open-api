package com.open.api.service.interfacemanager;

import com.open.api.module.domain.InterfaceResponse;
import com.open.api.service.IService;

/**
 * <p>Title: InterfaceResponseService . </p>
 * <p>api响应  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-11 下午2:27
 */
public interface InterfaceResponseService extends IService<InterfaceResponse> {


    /**
    * <p>Title: . </p>
    * <p>增 </p>
    *
    * @param
    * @author <a href="xmt08sky@126.com"/>mint</a>
    * @CreateDate
    * @return
    */
    int insertInterfaceResponse(InterfaceResponse interfaceResponse);

    /**
    * <p>Title: . </p>
    * <p>改 </p>
    *
    * @param
    * @author <a href="xmt08sky@126.com"/>mint</a>
    * @CreateDate
    * @return
    */
    int updateInterfaceResponse(InterfaceResponse interfaceResponse);
}
