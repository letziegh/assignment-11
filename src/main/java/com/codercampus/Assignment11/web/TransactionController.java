package com.codercampus.Assignment11.web;
import  com.codercampus.Assignment11.domain.Transaction;

import com.codercampus.Assignment11.service.TransactionService;
import com.codercampus.Assignment11.domain.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public String getAllTransactions(Model model) {
        List<Transaction> transactions = transactionService.findAllTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions";
    }

    @GetMapping("/transactions/{transactionId}")
    public String getTransactionById(@PathVariable Long transactionId, Model model) {
        Transaction transaction = transactionService.findTransactionById(transactionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid transaction ID: " + transactionId));
        model.addAttribute("transaction", transaction);
        return "transaction";
    }
}

