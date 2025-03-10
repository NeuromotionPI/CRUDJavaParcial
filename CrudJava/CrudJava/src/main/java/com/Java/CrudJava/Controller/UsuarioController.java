package com.Java.CrudJava.Controller;

import com.Java.CrudJava.Entity.UsuarioEntity;
import com.Java.CrudJava.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioEntity> getUsuario(){
        return usuarioService.getAllUsuario();
    }

    @GetMapping("/{id}") // Aquí estaba el error
    public Optional<UsuarioEntity> getUsuarioId(@PathVariable UUID id){
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public String createUsuario(){
        return "POST USUARIO";
    }

    @PutMapping("/{id}")
    public String updateUsuario(){
        return "PUT USUARIO";
    }

    @DeleteMapping("/{id}")
    public String deleteUsuario(){
        return "DELETE USUARIO";
    }
}
