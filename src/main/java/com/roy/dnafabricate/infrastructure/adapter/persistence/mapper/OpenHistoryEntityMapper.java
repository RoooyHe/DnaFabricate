package com.roy.dnafabricate.infrastructure.adapter.persistence.mapper;

import com.roy.dnafabricate.application.dto.OpenHistoryDTO;
import com.roy.dnafabricate.domain.entity.OpenHistory;
import com.roy.dnafabricate.infrastructure.adapter.persistence.entity.OpenHistoryEntity;
import com.roy.dnafabricate.infrastructure.adapter.web.response.OpenHistoryResponse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @Author Roy @DataTime 2025/11/12 13:08 @Mail roooyhe@163.com
 */
@Mapper(
        componentModel = "jsr330",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface OpenHistoryEntityMapper {
  OpenHistoryEntityMapper INSTANCE = Mappers.getMapper(OpenHistoryEntityMapper.class);

  OpenHistoryEntity convertOpenHistoryToEntity(OpenHistory openHistory);

  OpenHistory convertEntityToOpenHistory(OpenHistoryEntity openHistoryEntity);

  OpenHistoryResponse convertOpenHistoryDTOToResponse(OpenHistoryDTO openHistoryDTO);
}