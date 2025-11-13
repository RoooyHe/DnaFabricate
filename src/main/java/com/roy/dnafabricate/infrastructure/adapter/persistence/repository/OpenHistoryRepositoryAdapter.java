package com.roy.dnafabricate.infrastructure.adapter.persistence.repository;

import com.roy.dnafabricate.application.port.output.OpenHistoryRepositoryPort;
import com.roy.dnafabricate.domain.entity.OpenHistory;
import com.roy.dnafabricate.infrastructure.adapter.persistence.entity.OpenHistoryEntity;
import com.roy.dnafabricate.infrastructure.adapter.persistence.mapper.OpenHistoryEntityMapper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.List;
import java.util.Optional;

/**
 * @Author Roy @DataTime 2025/11/12 11:16 @Mail roooyhe@163.com
 */
@Singleton
public class OpenHistoryRepositoryAdapter implements OpenHistoryRepositoryPort {

  private final JpaOpenHistoryRepository jpaOpenHistoryRepository;

  @Inject
  public OpenHistoryRepositoryAdapter(JpaOpenHistoryRepository jpaOpenHistoryRepository) {
    this.jpaOpenHistoryRepository = jpaOpenHistoryRepository;
  }

  @Override
  public OpenHistory save(OpenHistory openHistory) {
    OpenHistoryEntity openHistoryEntity =
        OpenHistoryEntityMapper.INSTANCE.convertOpenHistoryToEntity(openHistory);
    OpenHistoryEntity save = jpaOpenHistoryRepository.save(openHistoryEntity);
    return OpenHistoryEntityMapper.INSTANCE.convertEntityToOpenHistory(save);
  }

  @Override
  public Optional<OpenHistory> findById(String id) {
    return Optional.empty();
  }

  @Override
  public List<OpenHistory> findAll() {
    return List.of();
  }

  @Override
  public void delete(String id) {}
}