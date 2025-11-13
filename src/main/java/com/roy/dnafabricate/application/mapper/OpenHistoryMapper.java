package com.roy.dnafabricate.application.mapper;

import com.roy.dnafabricate.application.dto.OpenHistoryDTO;
import com.roy.dnafabricate.domain.entity.OpenHistory;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * @Author Roy @DataTime 2025/11/12 11:07 @Mail roooyhe@163.com
 */
@Mapper(
    componentModel = "jsr330",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OpenHistoryMapper {
  OpenHistoryMapper INSTANCE = Mappers.getMapper(OpenHistoryMapper.class);

  OpenHistoryDTO convertOpenHistoryToDTO(OpenHistory openHistory);
}