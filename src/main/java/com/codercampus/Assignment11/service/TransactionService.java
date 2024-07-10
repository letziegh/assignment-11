package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.repository.TransactionRepository;
import com.codercampus.Assignment11.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findAllTransactions() {
        return transactionRepository.findAll().stream()
                .sorted(Comparator.comparing(Transaction::getDate))
                .collect(Collectors.toList());

    }

    public Optional<Transaction> findTransactionById(Long transactionId) {
        return transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getId().equals(transactionId))
                .findFirst();
    }
}