package com.roy.dnafabricate.application.port.input;

/**
 * @Author Roy @DataTime 2025/11/11 19:16 @Mail roooyhe@163.com
 */
public interface CreateOpenHistoryUseCase {
    OpenHistoryDTO execute(CreateUserCommand command);
}