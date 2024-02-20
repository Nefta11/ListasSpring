package com.spring.listaspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.listaspring.model.Usuario;

@Controller
public class PrincipalController {

    @GetMapping
    public String index(Model modelo) {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario(1L, "Uusario 1", "Neftali Arturo Hernández Vergara"));
        usuarios.add(new Usuario(2L, "Usuario 2", "Juanita Pérez Sosima"));
        usuarios.add(new Usuario(3L, "Usuario 3", "Alejandro Gómez Batalla"));
        usuarios.add(new Usuario(4L, "Usuario 4", "Isabella Rodríguez Vera"));
        usuarios.add(new Usuario(5L, "Usuario 5", "Luis García Ramirez"));
        usuarios.add(new Usuario(6L, "Usuario 6", "Ana Martínez Lara"));

        return "index";
    }

}
