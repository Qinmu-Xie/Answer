package qmxie.thoughtworks.com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "weixinmp")
public class WeiXinProperties {

    private String appId;

    private String secret;

    private String token;

    public String getAppId() {
        return appId;
    }

    public WeiXinProperties setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public WeiXinProperties setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getToken() {
        return token;
    }

    public WeiXinProperties setToken(String token) {
        this.token = token;
        return this;
    }
}
