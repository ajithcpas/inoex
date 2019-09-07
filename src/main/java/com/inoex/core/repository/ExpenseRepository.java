package com.inoex.core.repository;

import org.springframework.data.repository.CrudRepository;
import com.inoex.core.entity.Expense;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Integer> {

}