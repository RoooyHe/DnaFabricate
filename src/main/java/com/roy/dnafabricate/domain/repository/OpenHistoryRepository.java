package com.roy.dnafabricate.domain.repository;

import com.roy.dnafabricate.domain.entity.OpenHistory;
import java.util.Optional;

/**
 * @Author Roy @DataTime 2025/11/11 19:12 @Mail roooyhe@163.com
 */
public interface OpenHistoryRepository {
  Optional<OpenHistory> findById(String id);

  OpenHistory save(OpenHistory openHistory);

  void delete(String id);
}