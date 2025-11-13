package com.roy.dnafabricate.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;

/**
 * @Author Roy @DataTime 2025/11/11 19:45 @Mail roooyhe@163.com
 */
@Entity
@Table(name = "plugin_open_history")
public class OpenHistoryEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  @Column(name = "title")
  private String title;

  @Column(name = "url")
  private String url;

  @Column(name = "img_url")
  private String imgUrl;

  public OpenHistoryEntity() {}

  public OpenHistoryEntity(String id, String title, String url, String imgUrl) {
    this.id = id;
    this.title = title;
    this.url = url;
    this.imgUrl = imgUrl;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }
}