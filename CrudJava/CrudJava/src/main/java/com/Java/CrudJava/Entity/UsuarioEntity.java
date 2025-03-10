package com.Java.CrudJava.Entity;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEntity {
    private UUID id;
    private String usuarioName;
    private String usuarioApellido;
    private int usuarioEdad;

    public UsuarioEntity(UUID id, String usuarioName, String usuarioApellido, int usuarioEdad) {
        this.id = id;
        this.usuarioName = usuarioName;
        this.usuarioApellido = usuarioApellido;
        this.usuarioEdad = usuarioEdad;
    }

    public UUID id() {
        return id;
    }

    public UsuarioEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public String usuarioName() {
        return usuarioName;
    }

    public UsuarioEntity setUsuarioName(String usuarioName) {
        this.usuarioName = usuarioName;
        return this;
    }
    public String usuarioApellido() {
        return usuarioApellido;
    }

    public UsuarioEntity setUsuarioApellido(String usuarioApellido) {
        this.usuarioApellido = usuarioApellido;
        return this;
    }

    public int usuarioEdad() {
        return usuarioEdad;
    }

    public UsuarioEntity setUsuarioEdad(int usuarioEdad) {
        this.usuarioEdad = usuarioEdad;
        return this;
    }
}
