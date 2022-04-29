package com.youssef.serverproductmanagement.repository;

import com.youssef.serverproductmanagement.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
