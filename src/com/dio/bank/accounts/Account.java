package com.dio.bank.accounts;

import com.dio.bank.clients.Client;
import com.dio.bank.clients.IClient;

public abstract class Account implements IAccount {
    protected static int SERIAL_ID = 1;
    protected static int BRANCH_ID = 1;

    protected int branch;
    protected int id;
    protected double balance;
    protected IClient client;

    protected Account(String cName, String cDoc) {
        this.branch = BRANCH_ID;
        this.id = SERIAL_ID++;
        client = new Client(cName, cDoc);
    }



    protected void mainStatement(){
        System.out.printf("\nCliente: %s", this.client.getName());
        System.out.printf("\nDocumento: %s", this.client.getDocument());
        System.out.printf("\nAgência: %d", this.branch);
        System.out.printf("\nNúmero de Conta: %d", this.id);
        System.out.printf("\nSaldo: %.2f", this.balance);
        System.out.print("\n============================\n");
    }

    @Override
    public void withdrawn(double amount) {
        this.balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void transfer(double amount, IAccount target) {
        this.withdrawn(amount);
        target.deposit(amount);
    }
}
