package com.github.shoothzj.sb.basic.module;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @author hezhangjian
 */
@Data
@ApiModel(description = "Simple Echo Resp")
public class EchoPostResp {

    String content;

}
