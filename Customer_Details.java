package com.haydarmahadooa;

/**
 * Created by Haydar on 15-Mar-17.
 */
public class Customer_Details {
    private int AccountNumber;
    private int CustomerBalance;
    private String CustomerName;
    private String CustomerEmail;
    private int PhoneNum;

    public void setAccountNumber(int accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public void setPhoneNum(int PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public void setDepositFunds(int DepositedFund) {
        System.out.println("Initial amount: " +this.CustomerBalance);
        this.CustomerBalance += DepositedFund;
        System.out.println("New amount: " +this.CustomerBalance);
    }

    public void setWithdrawFunds(int WithdrawnFund) {
        if (WithdrawnFund <= (this.CustomerBalance)){
            this.CustomerBalance -= WithdrawnFund;
            System.out.println("Removed: " +WithdrawnFund);
            System.out.println("Remaining amount: " +this.CustomerBalance);
        } else {
            System.out.println("Insufficient Funds!");
        }
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getCustomerBalance() {
        return CustomerBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public int getPhoneNum() {
        return PhoneNum;
    }

    public int getCustomerFund(){
        return CustomerBalance;
    }

    public int getWithdrawFund(){
        return CustomerBalance;
    }
}
