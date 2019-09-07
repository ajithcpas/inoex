package com.inoex.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.CascadeType;
import java.time.LocalDateTime;

@Entity
@Table (name = "Income")
@Data
public class Income
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private double amount;
    @NotNull
    @JsonFormat (pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime creditedOn;
    private String comments;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "CATEGORY_ID")
    private IncomeCategory category;
}
