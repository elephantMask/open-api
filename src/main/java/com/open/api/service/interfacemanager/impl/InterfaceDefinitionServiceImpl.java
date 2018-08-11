package com.open.api.service.interfacemanager.impl;

import com.open.api.module.domain.InterfaceDefinition;
import com.open.api.service.BaseService;
import com.open.api.service.interfacemanager.InterfaceDefinitionService;
import com.open.api.util.ObjectId;
import com.open.api.util.PubUtils;
import org.springframework.stereotype.Service;

/**
 * <p>Title: InterfaceDefinitionServiceImpl . </p>
 * <p>接口定义  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-04-29 下午2:21
 */
@Service
public class InterfaceDefinitionServiceImpl extends BaseService<InterfaceDefinition> implements InterfaceDefinitionService {


    @Override
    public int insertInterface(InterfaceDefinition interfaceDefinition) {
        interfaceDefinition.setId(ObjectId.id());
        return save(interfaceDefinition);
    }

    @Override
    public int updateInterface(InterfaceDefinition interfaceDefinition) {
        return update(interfaceDefinition);
    }

    @Override
    public int deleteInterface(InterfaceDefinition interfaceDefinition) {
        if (!PubUtils.isNull(interfaceDefinition) && PubUtils.isNull(interfaceDefinition.getId())){
            return 0;
        }
        return deleteByKey(interfaceDefinition.getId());
    }
}
