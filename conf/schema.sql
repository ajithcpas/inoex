CREATE DATABASE Inoex;

CREATE TABLE IncomeCategory (ID serial PRIMARY KEY, NAME varchar(100) NOT NULL);

CREATE TABLE Income (ID serial PRIMARY KEY, AMOUNT numeric(12,4), CREDITED_ON timestamp NOT NULL, COMMENTS varchar(256), CATEGORY_ID bigint references IncomeCategory (ID));

CREATE TABLE ExpenseCategory (ID serial PRIMARY KEY, NAME varchar(100) NOT NULL);

CREATE TABLE Expense (ID serial PRIMARY KEY, AMOUNT numeric(12,4), DEBITED_ON timestamp NOT NULL, COMMENTS varchar(256), CATEGORY_ID bigint references ExpenseCategory (ID));
