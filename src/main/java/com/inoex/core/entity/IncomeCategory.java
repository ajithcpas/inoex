package com.inoex.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.List;

@Entity
//@Table (name = "IncomeCategory")
@Table
@Data
public class IncomeCategory
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    //@OneToMany (fetch = FetchType.LAZY, mappedBy = "Income")
    //private List<Income> income;
}
