package com.inoex.core.repository;

import org.springframework.data.repository.CrudRepository;
import com.inoex.core.entity.ExpenseCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseCategoryRepository extends CrudRepository<ExpenseCategory, Integer> {

}