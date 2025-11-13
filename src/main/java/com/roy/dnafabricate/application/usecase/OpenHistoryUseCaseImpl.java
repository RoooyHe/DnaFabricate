package com.roy.dnafabricate.application.usecase;

import com.roy.dnafabricate.application.command.CreateOpenHistoryCommand;
import com.roy.dnafabricate.application.dto.OpenHistoryDTO;
import com.roy.dnafabricate.application.mapper.OpenHistoryMapper;
import com.roy.dnafabricate.application.port.input.CreateOpenHistoryUseCase;
import com.roy.dnafabricate.application.port.output.OpenHistoryRepositoryPort;
import com.roy.dnafabricate.domain.entity.OpenHistory;
import com.roy.dnafabricate.domain.service.OpenHistoryDomainService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * @Author Roy @DataTime 2025/11/11 19:17 @Mail roooyhe@163.com
 */
@Singleton
public class OpenHistoryUseCaseImpl implements CreateOpenHistoryUseCase {

  private final OpenHistoryDomainService openHistoryDomainService;
  private final OpenHistoryRepositoryPort openHistoryRepositoryPort;

  @Inject
  public OpenHistoryUseCaseImpl(
      OpenHistoryDomainService openHistoryDomainService,
      OpenHistoryRepositoryPort openHistoryRepositoryPort) {
    this.openHistoryDomainService = openHistoryDomainService;
    this.openHistoryRepositoryPort = openHistoryRepositoryPort;
  }

  @Override
  public OpenHistoryDTO execute(CreateOpenHistoryCommand command) {
    OpenHistory openHistory =
        openHistoryDomainService.createOpenHistory(
            command.title(), command.url(), command.imgUrl());
    OpenHistory save = openHistoryRepositoryPort.save(openHistory);
    return OpenHistoryMapper.INSTANCE.convertOpenHistoryToDTO(save);
  }
}