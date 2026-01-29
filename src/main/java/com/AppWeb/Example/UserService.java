package com.AppWeb.Example;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UsersModel> users = new ArrayList<>();
    private static int idCounter = 1;

    public UsersModel CreateUsers(UsersModel user) {
        user.setId(idCounter++);
        users.add(user);
        return user;
    }

    public List<UsersModel> Read() {
        return users;
    }

    public UsersModel Update(int id, UsersModel updateUser) {
        for (UsersModel u : users) {
            if (u.getId() == id) {
                u.setNames(updateUser.getNames());
                u.setLastNames(updateUser.getLastNames());
                u.setMail(updateUser.getMail());
                return u;
            }
        }
        return null;
    }

    public boolean Delete(int id) {
        for (UsersModel u : users) {
            if (u.getId() == id) {
                users.remove(u);
                return true;
            }
        }
        System.out.println("The Id doesnt match in our database");
        return false;
    }
}
