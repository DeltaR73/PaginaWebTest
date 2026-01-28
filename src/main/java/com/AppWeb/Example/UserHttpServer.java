package com.example;

import com.example.model.User;
import com.example.service.UserService;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class UserHttpServer {

    private static UserService service = new UserService();

    public static void start() throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // GET /users
        server.createContext("/users", exchange -> {
            if ("GET".equals(exchange.getRequestMethod())) {
                StringBuilder response = new StringBuilder();
                response.append("[");

                for (User u : service.listar()) {
                    response.append("{\"id\":")
                            .append(u.getId())
                            .append(",\"nombre\":\"")
                            .append(u.getNombre())
                            .append("\",\"correo\":\"")
                            .append(u.getCorreo())
                            .append("\"},");
                }

                if (response.length() > 1)
                    response.setLength(response.length() - 1);

                response.append("]");

                sendResponse(exchange, response.toString());
            }
        });

        server.start();
        System.out.println("Servidor HTTP iniciado en http://localhost:8080");
    }

    private static void sendResponse(HttpExchange exchange, String response) throws IOException {
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}