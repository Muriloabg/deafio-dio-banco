package com.dio;

import com.dio.bank.accounts.CurrentAccount;
import com.dio.bank.accounts.DepositAccount;
import com.dio.bank.accounts.IAccount;

public class App {
    public static void main(String[] args) {
        System.out.println("Bank Project Program Start.");

        //Client Data Example
        String cName = "Murilo Amorim";
        String cDoc  = "123.456.789-01";

        //Account creation and use example
        IAccount currentAcc = new CurrentAccount(cName, cDoc);
        IAccount depositAcc = new DepositAccount(cName, cDoc);
        currentAcc.deposit(100);
        currentAcc.withdrawn(10);
        currentAcc.transfer(50, depositAcc);
        currentAcc.statement();
        depositAcc.statement();

        System.out.println("Program End.");
    }
}
