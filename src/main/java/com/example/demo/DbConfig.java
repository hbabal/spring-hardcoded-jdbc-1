package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

    private String url = "jdbc:oracle:thin:@oracle_db:1521/test";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
