package com.edyoda;

public class Address implements User {
    private String Addressline1;
    private String Addressline2;
    private String City;
    private String State;
    private  Integer PinCode;


    @Override
    public String getName() {
        return "Aditya";
    }

    @Override
    public String getPhone() {
        return "nokia";
    }


    @Override
    public String displayinfo() {
        return String.format("Addressline1 %s, Addressline2 %s, City %s, State %s, PinCode %d"
                ,Addressline1,Addressline2, City,State,PinCode);
    }

    public void initMethod(){
        System.out.println("In Init Method");
    }

    public void destroyMethod(){
        System.out.println("In Destroy Method");
    }


    public String getAddressline1() {
        return Addressline1;
    }

    public void setAddressline1(String addressline1) {
        Addressline1 = addressline1;
    }

    public String getAddressline2() {
        return Addressline2;
    }

    public void setAddressline2(String addressline2) {
        Addressline2 = addressline2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Integer getPinCode() {
        return PinCode;
    }

    public void setPinCode(Integer pinCode) {
        PinCode = pinCode;
    }
}
