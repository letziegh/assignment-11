//package com.codercampus.Assignment11;
//
//
//    import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.List;
//import com.codercampus.Assignment11.domain.Transaction;
//
//    public class TransactionInspection {
//        public static void main(String[] args) {
//            try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/doNotTouch/transactions.doNotTouch");
//                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
//
//                // Deserialize the transactions
//                List<Transaction> transactions = (List<Transaction>) objectInputStream.readObject();
//
//                // Print each transaction to verify the type
//                transactions.forEach(transaction -> {
//                    System.out.println("Transaction ID: " + transaction.getId() +
//                            ", Type: " + transaction.getType() +
//                            ", Amount: " + transaction.getAmount());
//                });
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
