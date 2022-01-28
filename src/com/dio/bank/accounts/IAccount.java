package com.dio.bank.accounts;

public interface IAccount {

    //Reduce account balance by an "int amount"
    void withdrawn(double amount);

    //Increases account balance by an "int amount"
    void deposit(double amount);

    //Reduce account balance by an "int amount"
    //Increases an "IAccount target" balance by an "int amount"
    void transfer(double amount, IAccount target);

    //prints all important information of the account
    void statement();

}
