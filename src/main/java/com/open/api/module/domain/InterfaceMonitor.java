package com.open.api.module.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Title: InterfaceMonitor . </p>
 * <p>接口监控  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-04-27 上午12:52
 */
@Data
public class InterfaceMonitor implements Serializable {


    private static final long serialVersionUID = -4164276987123292426L;
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    @ApiModelProperty("主键")
    private String id;

    @Column(name = "interface_code")
    @ApiModelProperty("接口编码")
    private String interfaceCode;

    @Column(name = "interface_name")
    @ApiModelProperty("接口编码")
    private String interfaceName;

    @Column(name = "call_count")
    @ApiModelProperty("调用次数")
    private int callCount;

    @Column(name = "success_count")
    @ApiModelProperty("成功次数")
    private int successCount;

    @Column(name = "fail_count")
    @ApiModelProperty("失败次数")
    @NotNull
    private int failCount;

    @Column(name = "success_rate")
    @ApiModelProperty("成功率")
    private BigDecimal successRate;

    @Column(name = "fail_rate")
    @ApiModelProperty("失败率")
    private BigDecimal failRate;

    @Column(name = "state")
    @ApiModelProperty("状态,正常,活跃,异常,休眠,死亡")
    private int state;

    @Column(name = "lately_active_time")
    @ApiModelProperty("最近活跃时间")
    private Date latelyActiveTime;

    @Column(name = "monitor_time")
    @ApiModelProperty("监控时间")
    private Date monitorTime;
}
