package com.open.api.service.interfacemanager;

import com.open.api.module.domain.InterfaceParam;
import com.open.api.service.IService;

/**
 * <p>Title: InterfaceParam . </p>
 * <p>api接口入参  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-11 下午2:31
 */
public interface InterfaceParamService extends IService<InterfaceParam> {

    /**
    * <p>Title: . </p>
    * <p>增 </p>
    *
    * @param
    * @author <a href="xmt08sky@126.com"/>mint</a>
    * @CreateDate
    * @return
    */

    int insertInterfaceParam(InterfaceParam interfaceParam);

    /**
    * <p>Title: . </p>
    * <p>改 </p>
    *
    * @param
    * @author <a href="xmt08sky@126.com"/>mint</a>
    * @CreateDate
    * @return
    */
    int updateInterfaceParam(InterfaceParam interfaceParam);


}
