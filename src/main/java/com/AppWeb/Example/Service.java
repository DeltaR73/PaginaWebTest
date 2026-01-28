package com.AppWeb.Example;

import java.util.ArrayList;
import java.util.List;
import com.AppWeb.Example.UsersModel;
public class Service {
    private List<UsersModel> users = new ArrayList<>();

    public void CreateUsers(UsersModel user){
        users.add(user);
    }

    public List<UsersModel> Read(){
        return users;
    }

    public List<UsersModel> Update(int id, String name, String LastName, String Mail){
        for (UsersModel u : users){
            if(u.getId()==id){
                u.setNames(name);
                u.setLastNames(LastName);
                u.setMail(Mail);
                return users;
            }
        }
        return users;
    }
}
