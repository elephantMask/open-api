package com.open.api.service.interfacemanager.impl;

import com.open.api.module.domain.InterfaceResponse;
import com.open.api.service.BaseService;
import com.open.api.service.interfacemanager.InterfaceResponseService;
import com.open.api.util.ObjectId;
import org.springframework.stereotype.Service;

/**
 * <p>Title: InterfaceResponseServiceImpl . </p>
 * <p>api接口响应参数  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-08-11 下午2:35
 */
@Service
public class InterfaceResponseServiceImpl extends BaseService<InterfaceResponse> implements InterfaceResponseService {
    @Override
    public int insertInterfaceResponse(InterfaceResponse interfaceResponse) {
        interfaceResponse.setId(ObjectId.id());
        return save(interfaceResponse);
    }

    @Override
    public int updateInterfaceResponse(InterfaceResponse interfaceResponse) {
        return update(interfaceResponse);
    }
}
