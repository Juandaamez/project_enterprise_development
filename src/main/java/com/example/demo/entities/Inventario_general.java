package com.example.demo.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inventario_general")

public class Inventario_general implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private int idArticulo;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    @Column(name = "estado")
    private String Estado;

    @Column(name = "accesorio1")
    private String Accesorio1;

    @Column(name = "accesorio2")
    private String Accesorio2;

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getAccesorio1() {
        return Accesorio1;
    }

    public void setAccesorio1(String accesorio1) {
        Accesorio1 = accesorio1;
    }

    public String getAccesorio2() {
        return Accesorio2;
    }

    public void setAccesorio2(String accesorio2) {
        Accesorio2 = accesorio2;
    }
}
