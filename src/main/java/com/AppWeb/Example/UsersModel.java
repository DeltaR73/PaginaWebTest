package com.AppWeb.Example;

public class UsersModel {

    private int id;
    private String names;
    private String lastnames;
    private String mail;

    public UsersModel(){

    }

    public UsersModel(int id, String names, String lastnames, String mail){
        this.id = id;
        this.names = names;
        this.lastnames = lastnames;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getNames(){
        return names;
    }

    public String getLastNames() {
        return lastnames;
    }

    public String getMail() {
        return mail;
    }

    public  void setId(int id){this.id = id;}

    public void setNames(String names) {
        this.names = names;
    }

    public void setLastNames(String lastnames) {
        this.lastnames = lastnames;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
