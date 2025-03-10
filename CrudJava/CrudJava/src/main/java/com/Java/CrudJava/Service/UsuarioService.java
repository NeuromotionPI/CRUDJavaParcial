package com.Java.CrudJava.Service;

import com.Java.CrudJava.Entity.UsuarioEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {
    private List<UsuarioEntity> usuario ;

    public UsuarioService(){
        usuario = new ArrayList<>();
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Juan", "Pérez", 26));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "María", "González", 30));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Carlos", "Ramírez", 22));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Ana Torres", "Torres", 40));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Lucas", "Fernández", 55));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Elena ", "Suárez", 27));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Fernando", "Herrera", 19));
        usuario.add(new UsuarioEntity(UUID.randomUUID(), "Sofía Castro", "Castro", 36));
    }
    public List<UsuarioEntity> getAllUsuario() {
        return  usuario;
    }
    public Optional<UsuarioEntity> getUsuarioById(UUID id){
        return  usuario.stream().filter(usuario -> usuario.getId().equals( id)).findFirst();
    }
    public  List<UsuarioEntity> createUsuario(){
        return usuario;
    }
    public  List<UsuarioEntity> updateUsuario(){
        return usuario;
    }
    public  List<UsuarioEntity>deleteCountry(){
        return  usuario;
    }
}
