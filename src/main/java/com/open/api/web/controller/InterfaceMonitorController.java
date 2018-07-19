package com.open.api.web.controller;

import com.open.api.module.domain.InterfaceMonitor;
import com.open.api.service.interfacemanager.InterfaceMonitorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Wrapper;

/**
 * <p>Title: InterfaceMonitorController . </p>
 * <p>接口测试类  </p>
 * <p>Company: http://www.hnxianyi.com </p>
 *
 * @author <a href="xmt@hnxianyi.com"/>mt</a>
 * @CreateDate 2018-05-03 上午11:44
 */
@Controller
@RequestMapping(value = "/open/interface/monitor/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "InterfaceMonitorController", tags = "监控API" ,description = "测试日志接口")
public class InterfaceMonitorController {

    @Resource
    private InterfaceMonitorService interfaceMonitorService;

    @ResponseBody
    @RequestMapping(value = "/insertInterfaceMonitor", method = RequestMethod.POST)
    @ApiOperation(notes = "保存监听", httpMethod = "POST", value = "保存监听")
    public void insertInterfaceMonitor(@RequestBody InterfaceMonitor interfaceMonitor){
        interfaceMonitorService.saveInterfaceMonitor(interfaceMonitor);
    }

    @ResponseBody
    @RequestMapping(value = "/updateInterfaceMonitor", method = RequestMethod.POST)
    @ApiOperation(notes = "修改监听", httpMethod = "POST", value = "修改监听")
    public void updateInterfaceMonitor(@RequestBody InterfaceMonitor interfaceMonitor){
        interfaceMonitorService.updateInterfaceMonitor(interfaceMonitor);
    }
}
