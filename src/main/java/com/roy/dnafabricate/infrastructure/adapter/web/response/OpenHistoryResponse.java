package com.roy.dnafabricate.infrastructure.adapter.web.response;

import com.roy.dnafabricate.application.dto.OpenHistoryDTO;
import com.roy.dnafabricate.infrastructure.adapter.persistence.mapper.OpenHistoryEntityMapper;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

/**
 * @Author Roy @DataTime 2025/11/11 19:43 @Mail roooyhe@163.com
 */
@Introspected
@Serdeable
public record OpenHistoryResponse(String id, String title, String url, String imgUrl) {
  public static OpenHistoryResponse from(OpenHistoryDTO dto) {
    return OpenHistoryEntityMapper.INSTANCE.convertOpenHistoryDTOToResponse(dto);
  }
}