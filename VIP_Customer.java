package com.haydarmahadooa;

/**
 * Created by Haydar on 17-Mar-17.
 */
public class VIP_Customer {
    private String VIP_Name;
    private String VIP_Credit_Limit;
    private String VIP_Email_Address;

    public VIP_Customer(){
        this("ThisIsAVIPName", "0", "vip@email.com");

    }

    public VIP_Customer(String VIP_Name, String VIP_Email_Address) {
        this();
        this.VIP_Name = VIP_Name;
        this.VIP_Email_Address = VIP_Email_Address;
    }

    public VIP_Customer(String VIP_Name, String VIP_Credit_Limit, String VIP_Email_Address) {
        this.VIP_Name = VIP_Name;
        this.VIP_Credit_Limit = VIP_Credit_Limit;
        this.VIP_Email_Address = VIP_Email_Address;

    }

    public String getVIP_Name() {
        return VIP_Name;
    }

    public String getVIP_Credit_Limit() {
        return VIP_Credit_Limit;
    }

    public String getVIP_Email_Address() {
        return VIP_Email_Address;
    }
}
