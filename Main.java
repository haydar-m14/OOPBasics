package com.haydarmahadooa;


public class Main {

    public static void main(String[] args) {
	Customer_Details Customer_1 = new Customer_Details();
	Customer_1.setAccountNumber(1408);
	Customer_1.setCustomerName("Haydar Mahadooa");
	Customer_1.setCustomerEmail("haydarali@email.com");
	Customer_1.setPhoneNum(123456);
	Customer_1.setDepositFunds(10000);
	Customer_1.setWithdrawFunds(10000);

        System.out.println("Customer Name: " + Customer_1.getCustomerName());
        System.out.println("Email address: " +Customer_1.getCustomerEmail());
        System.out.println("Phone Num: " + Customer_1.getPhoneNum());
        System.out.println("Account number: " + Customer_1.getAccountNumber());
        System.out.println("Account balance: " +Customer_1.getWithdrawFund());
        System.out.println("__________________________________________________");

        VIP_Customer Default_VIP = new VIP_Customer();
        System.out.println(Default_VIP.getVIP_Name());
        System.out.println(Default_VIP.getVIP_Credit_Limit());
        System.out.println(Default_VIP.getVIP_Email_Address());

        System.out.println("__________________________________________________");


        VIP_Customer First_VIP = new VIP_Customer("Haydar Mahadooa", "haydar_m@outlook.com");
        System.out.println(First_VIP.getVIP_Name());
        System.out.println(First_VIP.getVIP_Credit_Limit());
        System.out.println(First_VIP.getVIP_Email_Address());

    }
}
