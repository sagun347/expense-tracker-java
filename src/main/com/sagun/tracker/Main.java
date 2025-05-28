package com.sagun.tracker;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        tracker.addExpense("Food", 12.50);
        tracker.addExpense("Transport", 8.00);
        tracker.addExpense("Books", 22.99);

        tracker.showSummary();
    }
}
