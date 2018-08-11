package com.open.api.module.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: InterfaceDefinition . </p>
 * <p>接口定义  </p>
 *
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-04-29 下午12:13
 *
 */
@Table(name="open_interface_definition")
@Data
public class InterfaceDefinition implements Serializable {

    private static final long serialVersionUID = 357364012694095112L;
    @Id
    @Column(name = "id")
    @ApiModelProperty("主键")
    private String id;

    @Column(name="interface_code")
    @ApiModelProperty("接口编码 IF+6位流水")
    private String interfaceCode;

    @Column(name="interface_name")
    @ApiModelProperty("接口名称")
    private String interfaceName;

    @Column(name = "interface_method")
    @ApiModelProperty("接口方法名称")
    private String interfaceMethod;

    @Column(name = "interface_mode")
    @ApiModelProperty("接口模式 PUSH:推送 RECEIVE:接收 GRAB:抓取")
    private String interfaceMode;

    @Column(name = "interface_nature")
    @ApiModelProperty("接口性质  定制CUSTOM 标准STANDARD")
    private String interfaceNature;


    @Column(name = "customer_sys_code")
    @ApiModelProperty("客户系统编码 当接口为个性的时候填写")
    private String customerSysCode;


    @Column(name = "customer_sys_name")
    @ApiModelProperty("客户系统名称")
    private String customerSysName;


    @Column(name = "retry_count")
    @ApiModelProperty("重试次数 默认为0")
    private Integer retryCount;

    @Column(name = "state")
    @ApiModelProperty("状态: 0:禁用, 1:启用,默认0")
    private Integer state;

    @Column(name = "operation_time")
    @ApiModelProperty("操作时间")
    private Date operationTime;

    @Column(name = "last_operator")
    @ApiModelProperty("最后操作人")
    private String lastOperator;

    @Column(name = "last_operator_id")
    @ApiModelProperty("最后操作人id")
    private String lastOperatorId;

    @Column(name = "notes")
    @ApiModelProperty("备注")
    private String notes;



}
