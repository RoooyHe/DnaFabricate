package com.roy.dnafabricate.domain.service;

import com.roy.dnafabricate.domain.entity.OpenHistory;
import jakarta.inject.Singleton;
import java.util.UUID;

/**
 * @Author Roy @DataTime 2025/11/11 19:13 @Mail roooyhe@163.com
 */
@Singleton
public class OpenHistoryDomainService {

  public OpenHistory createOpenHistory(String title, String url, String imgUrl) {
    // 业务验证
    if (title == null || title.trim().isEmpty()) {
      throw new IllegalArgumentException("Title cannot be empty");
    }
    if (url == null || url.length() < 10) {
      throw new IllegalArgumentException("URL must be at least 10 characters");
    }

    // 生成领域对象
    return new OpenHistory(UUID.randomUUID().toString(), title, url, imgUrl);
  }
}