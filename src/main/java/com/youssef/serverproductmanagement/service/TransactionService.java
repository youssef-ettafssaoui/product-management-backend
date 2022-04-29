package com.youssef.serverproductmanagement.service;


import com.youssef.serverproductmanagement.models.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);

    Long numberOfTransactions();

    List<Transaction> findAllTransactions();
}
