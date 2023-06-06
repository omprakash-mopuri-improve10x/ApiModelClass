package com.omprakash.apimodelclass.models;

import com.google.gson.annotations.SerializedName;

public class ClientDetails {

    @SerializedName("accept_language")
    private String acceptLanguage;

    @SerializedName("browser_height")
    private Integer browserHeight;

    @SerializedName("browser_ip")
    private String browserIp;

    @SerializedName("browser_width")
    private Integer browserWidth;

    @SerializedName("session_hash")
    private String sessionHash;

    @SerializedName("user_agent")
    private String userAgent;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public Integer getBrowserHeight() {
        return browserHeight;
    }

    public void setBrowserHeight(Integer browserHeight) {
        this.browserHeight = browserHeight;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public Integer getBrowserWidth() {
        return browserWidth;
    }

    public void setBrowserWidth(Integer browserWidth) {
        this.browserWidth = browserWidth;
    }

    public String getSessionHash() {
        return sessionHash;
    }

    public void setSessionHash(String sessionHash) {
        this.sessionHash = sessionHash;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
