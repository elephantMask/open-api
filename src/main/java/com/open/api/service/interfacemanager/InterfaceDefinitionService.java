package com.open.api.service.interfacemanager;

import com.open.api.module.domain.InterfaceDefinition;
import com.open.api.service.IService;

/**
 * <p>Title: InterfaceDefinitionService . </p>
 * <p>接口定义  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-04-29 下午2:16
 */
public interface InterfaceDefinitionService extends IService<InterfaceDefinition> {

    int insertInterface(InterfaceDefinition interfaceDefinition);

    int updateInterface(InterfaceDefinition interfaceDefinition);

    int deleteInterface(InterfaceDefinition interfaceDefinition);


}
