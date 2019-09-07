package com.inoex.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.json.JSONObject;

import com.inoex.core.entity.Income;
import com.inoex.core.entity.IncomeCategory;
import com.inoex.core.repository.IncomeRepository;
import com.inoex.core.service.IncomeService;

@Controller
@RequestMapping(path="/income")
public class IncomeController 
{
	@Autowired
	private IncomeService incomeService;

	@GetMapping
	public @ResponseBody Iterable<Income> getAllIncome()
	{
		return incomeService.getAllIncome();
	}

	@PostMapping(path="/add")
	public @ResponseBody Income addIncome(@RequestBody Income income)
	{
		incomeService.addIncome(income);
		return income;
	}

	@PutMapping(value="/{id}")
	public @ResponseBody Income updateIncome(@PathVariable("id") Long id, @RequestBody Income income)
	{
		incomeService.updateIncome(income);
		return income;
	}

	@DeleteMapping(value="/{id}")
	public @ResponseBody Income deleteIncome(@PathVariable("id") Long id)
	{
		return incomeService.deleteIncome(id);
	}
}