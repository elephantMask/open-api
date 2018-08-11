package com.open.api.service.interfacemanager.impl;

import com.open.api.module.domain.InterfaceParam;
import com.open.api.service.BaseService;
import com.open.api.service.interfacemanager.InterfaceParamService;
import com.open.api.util.ObjectId;
import org.springframework.stereotype.Service;

/**
 * <p>Title: InterfaceParamServiceImpl . </p>
 * <p>api入参实现  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-11 下午2:34
 */
@Service
public class InterfaceParamServiceImpl extends BaseService<InterfaceParam> implements InterfaceParamService {
    @Override
    public int insertInterfaceParam(InterfaceParam interfaceParam) {
        interfaceParam.setId(ObjectId.id());
        return save(interfaceParam);
    }

    @Override
    public int updateInterfaceParam(InterfaceParam interfaceParam) {
        return update(interfaceParam);
    }
}
