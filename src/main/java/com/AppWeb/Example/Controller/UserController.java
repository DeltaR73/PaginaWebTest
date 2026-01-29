package com.AppWeb.Example.Controller;

import com.AppWeb.Example.UserService;
import com.AppWeb.Example.UsersModel;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public  UserController(UserService userService){
        this.userService = userService;

    }

    @GetMapping
    public List<UsersModel> read(){
        return userService.Read();
    }

    @PostMapping
    public UsersModel Create(@RequestBody UsersModel user){
        return userService.CreateUsers(user);
    }

    @PutMapping("/{id}")
    public UsersModel Update(@PathVariable int id, @RequestBody UsersModel user){
        return userService.Update(id, user);
    }

    @DeleteMapping("/{id}")
    public String Delete(@PathVariable int id){
        boolean eliminated = userService.Delete(id);
        return eliminated ? "Usuario eliminado" : "Usuario no encontrado";
    }
}
