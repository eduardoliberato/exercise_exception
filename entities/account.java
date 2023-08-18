package entities;

import exception.accountException;

public class account {

    Integer number;
    String holder;
    Double balance;
    Double withdrawLimit;

    public account() {

    }

    public account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) {
        balance = balance + amount;
    }

    public Double withdraw(Double withdraw) {
        if (balance == 0) {
            throw new accountException("Your balance is zero, you can't do a withdraw without any amount in your account");
        }
        if(withdraw > balance ){
            throw new accountException("Withdraw error: Not enough balance");
        }
        if (withdraw > withdrawLimit) {
            throw new accountException("You can't do a withdraw bigger than your withdraw limit");
        }
        return balance = balance - withdraw;
    }

    @Override
    public String toString(){
       return "New balance: " + balance;
    }

}
