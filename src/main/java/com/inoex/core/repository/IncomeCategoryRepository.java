package com.inoex.core.repository;

import org.springframework.data.repository.CrudRepository;
import com.inoex.core.entity.IncomeCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeCategoryRepository extends CrudRepository<IncomeCategory, Integer> {
	public IncomeCategory findByName(String name);
}