package com.roy.dnafabricate.domain.entity;

/**
 * @Author Roy @DataTime 2025/11/11 19:09 @Mail roooyhe@163.com
 */
public class OpenHistory {

  private final String id;

  private final String title;

  private final String url;

  private final String imgUrl;

  OpenHistory(String id, String title, String url, String imgUrl) {
    this.id = id;
    this.title = title;
    this.url = url;
    this.imgUrl = imgUrl;
  }
}