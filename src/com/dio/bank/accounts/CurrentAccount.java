package com.dio.bank.accounts;

import com.dio.bank.clients.Client;

public class CurrentAccount extends Account{
    private double fee;

    public CurrentAccount(String cName, String cDoc) {
        super(cName, cDoc);
        this.fee = 20.00f;
    }

    @Override
    public void statement() {
        System.out.println("=======Conta Corrente=======");
        System.out.printf("\nTaxa Mensal de Serviços: %.2f%n", this.fee);
        super.mainStatement();
    }
}
