package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private int id;
    private String name;
    private String email;
    private String senha;

    public Usuario(String name, String email, String senha, int id) {
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }
}
