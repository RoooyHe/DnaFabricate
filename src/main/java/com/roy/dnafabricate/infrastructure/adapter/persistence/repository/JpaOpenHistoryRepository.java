package com.roy.dnafabricate.infrastructure.adapter.persistence.repository;

import com.roy.dnafabricate.infrastructure.adapter.persistence.entity.OpenHistoryEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @Author Roy @DataTime 2025/11/12 11:17 @Mail roooyhe@163.com
 */
@Repository
public interface JpaOpenHistoryRepository extends CrudRepository<OpenHistoryEntity, String> {}