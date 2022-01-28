package com.dio.bank.accounts;

import com.dio.bank.clients.Client;

public class DepositAccount extends Account{
    private final double interest;

    public DepositAccount(String cName, String cDoc) {
        super(cName, cDoc);
        this.interest = 0.085f;
    }

    @Override
    public void statement() {
        System.out.println("=======Conta Poupança=======");
        System.out.printf("\nRenda Mensal : %.2f%n", this.interest * super.balance);
        super.mainStatement();
    }
}
