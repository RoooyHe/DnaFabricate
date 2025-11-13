package com.roy.dnafabricate.application.port.input;

import com.roy.dnafabricate.application.command.CreateOpenHistoryCommand;
import com.roy.dnafabricate.application.dto.OpenHistoryDTO;

/**
 * @Author Roy @DataTime 2025/11/11 19:16 @Mail roooyhe@163.com
 */
public interface CreateOpenHistoryUseCase {
  OpenHistoryDTO execute(CreateOpenHistoryCommand command);
}