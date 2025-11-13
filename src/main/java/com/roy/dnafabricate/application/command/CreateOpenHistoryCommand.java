package com.roy.dnafabricate.application.command;

import io.micronaut.core.annotation.Introspected;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 * @Author Roy @DataTime 2025/11/12 10:16 @Mail roooyhe@163.com
 */
@Introspected
public record CreateOpenHistoryCommand(
    @NotNull String title,
    @NotNull @Length(min = 10) String url,
    @NotNull @Length(min = 10) String imgUrl) {}