package com.controller.db.sqlite.Objcts;

import java.util.Date;

public class Transaction {

    private float value;
    private String description;
    private String date;
    private TransactionType transactionType;

    public float getValue() {return value;}
    public void setValue(float value) {this.value = value;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    public TransactionType getTransactionType() {return transactionType;}
    public void setTransactionType(TransactionType transactionType) {this.transactionType = transactionType;}
}
