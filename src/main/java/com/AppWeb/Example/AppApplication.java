package com.AppWeb.Example;

import com.AppWeb.Example.UserHttpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {

       // SpringApplication.run(AppApplication.class, args);
        UserHttpServer.start();
        System.out.println("La app ya empezo a correr");
    }

}
