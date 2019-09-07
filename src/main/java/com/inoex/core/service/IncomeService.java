package com.inoex.core.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.inoex.core.entity.Income;
import com.inoex.core.entity.IncomeCategory;
import com.inoex.core.repository.IncomeRepository;
import com.inoex.core.repository.IncomeCategoryRepository;
import java.util.logging.Logger;

@Service
public class IncomeService
{
	private static Logger logger = Logger.getLogger(IncomeService.class.getName());

	@Autowired
	private IncomeRepository incomeRepository;
	
	@Autowired
	private IncomeCategoryRepository incomeCategoryRepository;

	public Iterable<Income> getAllIncome()
	{
		return incomeRepository.findAll();
	}

	public boolean addIncome(Income income)
	{
		IncomeCategory incomeCategory = incomeCategoryRepository.findByName(income.getCategory().getName());
		if (incomeCategory == null)
		{
			logger.info("incomeCategory not found:: "+ incomeCategory);
			incomeCategoryRepository.save(income.getCategory());
		}
		else
		{
			logger.info("incomeCategory found:: "+ incomeCategory);
			income.setCategory(incomeCategory);
		}
		incomeRepository.save(income);
		return true;
	}

	public boolean updateIncome(Income income)
	{
		IncomeCategory incomeCategory = incomeCategoryRepository.findByName(income.getCategory().getName());
		if (incomeCategory == null)
		{
			logger.info("incomeCategory not found:: "+ incomeCategory);
			incomeCategoryRepository.save(income.getCategory());
		}
		incomeRepository.save(income);
		return true;	
	}

	public Income deleteIncome(Long id)
	{
		Income income = incomeRepository.findById(id).get();
		incomeRepository.delete(income);
		return income;
	}
}
