package com.open.api.service.interfacemanager.impl;

import com.mongodb.client.result.UpdateResult;
import com.open.api.module.domain.InterfaceMonitor;
import com.open.api.service.BaseService;
import com.open.api.service.interfacemanager.InterfaceMonitorService;
import com.open.api.util.PubUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Title: InterfaceMonitorServiceImpl . </p>
 * <p>接口监控实现  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-05-02 下午5:00
 */
@Service
public class InterfaceMonitorServiceImpl extends BaseService<InterfaceMonitor> implements InterfaceMonitorService {
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public int saveInterfaceMonitor(InterfaceMonitor interfaceMonitor) {
        mongoTemplate.save(interfaceMonitor);
        return save(interfaceMonitor);
    }

    @Override
    public int updateInterfaceMonitor(InterfaceMonitor interfaceMonitor) {
        Query query = new Query(Criteria.where("id").is(interfaceMonitor.getId()));
        Update update = new Update().set("successCount",interfaceMonitor.getSuccessCount());
        UpdateResult result = mongoTemplate.updateFirst(query,update,InterfaceMonitor.class);
        if (PubUtils.isNull(result)){
            return 0;
        }
        return update(interfaceMonitor);
    }
}
