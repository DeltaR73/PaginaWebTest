package com.AppWeb.Example;

public class UsersModel {

    private int id;
    private String names;
    private String LastNames;
    private String Mail;

    public UsersModel(int id, String names, String LastNames, String Mail){
        this.id = id;
        this.names = names;
        this.LastNames = LastNames;
        this.Mail = Mail;
    }

    public int getId() {
        return id;
    }

    public String getNames(){
        return names;
    }

    public String getLastNames() {
        return LastNames;
    }

    public String getMail() {
        return Mail;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setLastNames(String lastNames) {
        LastNames = lastNames;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
