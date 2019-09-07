package com.inoex.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Entity
//@Table (name = "ExpenseCategory")
@Table
@Data
public class ExpenseCategory
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
}
