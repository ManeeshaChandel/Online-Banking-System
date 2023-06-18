package com.example.entities;

import com.example.entities.Account;

public class UpdateThread implements Runnable{
    private Account account;
    private double amount;

    public UpdateThread(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}
