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
}