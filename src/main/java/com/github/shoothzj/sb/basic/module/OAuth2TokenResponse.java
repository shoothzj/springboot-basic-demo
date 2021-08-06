package com.github.shoothzj.sb.basic.module;

import lombok.Data;

/**
 * @author hezhangjian
 */
@Data
public class OAuth2TokenResponse {

    private String appId;

    private String secret;

    private long expiresIn;

    private String refreshToken;

    public OAuth2TokenResponse() {
    }

}
