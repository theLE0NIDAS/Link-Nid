package com.url.shortner.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDTO {
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount;
    private LocalDateTime createdAt;
    private String username;

    public Long getId() {
        return id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public int getClickCount() {
        return clickCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
