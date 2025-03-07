package com.Java.CrudJava.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Desarrollado por: [Mercelana Anaya Lemaitre]
 * Fecha: [6/03/2025]
 * Descripción: Crud en Java Spring boot.
 */

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<String> usuarios = new ArrayList<>();

    @GetMapping
    public List<String> listar() {

        return usuarios;
    }

    @PostMapping
    public void agregar(@RequestBody String nombre) {
        usuarios.add(nombre);
    }

    @PutMapping("/{index}")
    public void actualizar(@PathVariable int index, @RequestBody String nuevoNombre) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.set(index, nuevoNombre);
        }
    }

    @DeleteMapping("/{index}")
    public void eliminar(@PathVariable int index) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
        }
    }
}

