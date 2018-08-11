package com.open.api.module.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * <p>Title: InterfaceResponse . </p>
 * <p>接口出参  </p>
 *
 * @author <a href="xmt08sky@126.com"/>mt</a>
 * @CreateDate 2018-08-10 上午12:54
 */
@Data
public class InterfaceResponse implements Serializable {
    private static final long serialVersionUID = 4020275991100024857L;


    @Id
    @NotNull
    @Size(max = 50)
    @ApiModelProperty("主键")
    private String id;


    @NotNull
    @Size(max = 50)
    @Column(name = "interface_code")
    @ApiModelProperty("接口编码")
    private String interfaceCode;


    @NotNull
    @Size(max = 50)
    @Column(name = "return_code")
    @ApiModelProperty("返回参数 编码")
    private String returnCode;


    @Size(max = 50)
    @Column(name = "return_name")
    @ApiModelProperty("返回 参数 名")
    private String returnName;


    @Size(max = 200)
    @Column(name = "notes")
    @ApiModelProperty("备注")
    private String notes;
}
