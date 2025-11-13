package com.roy.dnafabricate.application.port.output;

import com.roy.dnafabricate.domain.entity.OpenHistory;

import java.util.List;
import java.util.Optional;

/**
 * @Author Roy @DataTime 2025/11/11 19:17 @Mail roooyhe@163.com
 */
public interface OpenHistoryRepositoryPort {

  OpenHistory save(OpenHistory openHistory);

  Optional<OpenHistory> findById(String id);

  List<OpenHistory> findAll();

  void delete(String id);
}