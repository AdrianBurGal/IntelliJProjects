package com.example.relacionejercicios01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/animal")
public class Animal extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        List<String> animales = List.of("Ballena", "Caballito-mar", "Camello", "Cebra", "Elefante",
                "Hipopotamo", "Jirafa", "Leon", "Leopardo", "Medusa", "Mono", "Oso", "Oso-blanco", "Pajaro",
                "Pinguino", "Rinoceronte", "Serpiente", "Tigre", "Tortuga", "Tortuga-marina");

        request.setAttribute("animalRandom", animales.get((int) (Math.random() * 20)));

        RequestDispatcher dispatcher = request.getRequestDispatcher("./WEB-INF/animal.jsp");

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
    }
}