package com.open.api.module.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>Title: InterfaceParam . </p>
 * <p>接口参数  </p>
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-08-10 上午12:53
 */
@Data
@Table(name = "open_interface_param")
public class InterfaceParam implements Serializable {

    private static final long serialVersionUID = 2629765783362853936L;
    @Id
    @NotNull
    @ApiModelProperty("主键")
    private String id;


    @Column(name = "param_code")
    @ApiModelProperty("参数编码")
    private String paramCode;


    @Column(name = "interface_code")
    @ApiModelProperty("接口编码")
    private String interfaceCode;


    @Column(name = "param_name")
    @ApiModelProperty("参数名")
    private String paramName;


    @NotNull
    @Column(name = "required")
    @ApiModelProperty("必须的 0 非必须 1 必须 默认 0")
    private Integer required;


    @Column(name = "validate_length")
    @ApiModelProperty("长度限制 默认 999")
    private Integer validateLength;

    @NotNull
    @Column(name = "validate_type")
    @ApiModelProperty("校验类型 通过改类型 匹配到 具体的校验实现")
    private String validateType;


    @Column(name = "validate_content")
    @ApiModelProperty("校验内容")
    private String validateContent;


    @Column(name = "notes")
    @ApiModelProperty("备注")
    private String notes;
}
