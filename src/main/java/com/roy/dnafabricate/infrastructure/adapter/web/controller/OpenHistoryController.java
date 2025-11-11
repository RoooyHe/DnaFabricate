package com.roy.dnafabricate.infrastructure.adapter.web.controller;

import com.roy.dnafabricate.application.dto.OpenHistoryDTO;
import com.roy.dnafabricate.application.port.input.CreateOpenHistoryUseCase;
import com.roy.dnafabricate.infrastructure.adapter.web.response.OpenHistoryResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;
import jakarta.validation.Valid;

/**
 * @Author Roy @DataTime 2025/11/11 19:40 @Mail roooyhe@163.com
 */
@Controller("/api/v1")
public class OpenHistoryController {
  private final CreateOpenHistoryUseCase createOpenHistoryUseCase;

  @Inject
  public OpenHistoryController(CreateOpenHistoryUseCase createOpenHistoryUseCase) {
    this.createOpenHistoryUseCase = createOpenHistoryUseCase;
  }

  @Post
  @Produces(MediaType.APPLICATION_JSON)
  public HttpResponse<OpenHistoryResponse> createOpenHistory(
      @Valid @Body OpenHistoryRequest request) {
    CreateOpenHistoryCommand command =
        new CreateOpenHistoryCommand(request.getEmail(), request.getPassword());

    OpenHistoryDTO userDTO = createOpenHistoryUseCase.execute(command);

    return HttpResponse.created(OpenHistoryResponse.from(userDTO));
  }
}