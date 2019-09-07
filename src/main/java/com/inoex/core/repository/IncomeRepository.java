package com.inoex.core.repository;

import org.springframework.data.repository.CrudRepository;
import com.inoex.core.entity.Income;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends CrudRepository<Income, Long> {

}