package com.example.demo.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estudiantes")

public class Estudiantes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private int idEstudiante;

    @Column(name = "codigo_u")
    private int codigoU;

    @Column(name = "nombres")
    private String Nombres;

    @Column(name = "apellidos")
    private String Apellidos;

    @Column(name = "correo")
    private String Correo;

    @Column(name = "telefono")
    private int Telefono;

    @Column(name = "doc")
    private int Doc;

    @JoinColumn(name = "usuario_user_name", referencedColumnName = "user_name")
    @OneToOne(fetch = FetchType.LAZY)
    private Estudiantes userName;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getCodigoU() {
        return codigoU;
    }

    public void setCodigoU(int codigoU) {
        this.codigoU = codigoU;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public int getDoc() {
        return Doc;
    }

    public void setDoc(int doc) {
        Doc = doc;
    }

    public Estudiantes getUserName() {
        return userName;
    }

    public void setUserName(Estudiantes userName) {
        this.userName = userName;
    }
}
