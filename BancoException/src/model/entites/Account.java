package model.entites;

import model.exception.WithdrawError;

public class Account {
   private int number;
   private String holder;
   private double balance;
   private double withdrawLimit;

   public Account(){
   }

   public Account(Integer number, String holder, double balance, double withdrawLimit){

       this.number = number;
       this.holder = holder;
       this.balance = balance;
       this.withdrawLimit = withdrawLimit;
   }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit){
       this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
       balance += amount;
    }

    public void withdraw(double amount) {
       if (withdrawLimit < amount){
           throw new WithdrawError("The amount exceeds withdraw limit");
       }
       if (amount > balance){
           throw new WithdrawError("Not enough balance");
       }
       balance -= amount;
    }

}
