package com.sagun.tracker;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(String category, double amount) {
        expenses.add(new Expense(category, amount));
    }

    public void showSummary() {
        double total = 0;
        for (Expense e : expenses) {
            System.out.println(e);
            total += e.getAmount();
        }
        System.out.println("Total Spent: $" + total);
    }
}
