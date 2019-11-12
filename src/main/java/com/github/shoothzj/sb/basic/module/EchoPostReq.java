package com.github.shoothzj.sb.basic.module;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author hezhangjian
 */
@Data
@ApiModel(description = "Simple Echo Req")
public class EchoPostReq {

    @NotNull
    @Size(min = 2, max = 16)
    @ApiModelProperty(notes = "req content")
    String content;

}
