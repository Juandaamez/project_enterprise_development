package com.example.demo.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")

public class Usuario {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_name")
    private int userName;

    @Column(name = "contraseña")
    private String Contraseña;

    @JoinColumn(name = "estudiantes_id_estudiantes", referencedColumnName = "id_estudiante")
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario idEstudiante;

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Usuario getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Usuario idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
 