package com.inoex.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;
import lombok.Data;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

@Entity
@Table (name = "Expense")
@Data
public class Expense
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private double amount;
    @NotNull
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime debitedOn;
    private String comments;
    @ManyToOne (cascade = CascadeType.PERSIST)
    private ExpenseCategory category;
}
