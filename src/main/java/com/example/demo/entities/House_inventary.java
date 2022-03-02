package com.example.demo.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "house_inventary")

public class House_inventary implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_house_inventary")
    private int idHouseInventary;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo")
    private String Tipo;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    @JoinColumn(name = "house_id_house", referencedColumnName = "id_house")
    @OneToOne(fetch = FetchType.LAZY)
    private House_inventary id_House;

    @JoinColumn(name = "inventario_general_id_articulo", referencedColumnName = "id_articulo")
    @OneToOne(fetch = FetchType.LAZY)
    private House_inventary idArticulo;

    public int getIdHouseInventary() {
        return idHouseInventary;
    }

    public void setIdHouseInventary(int idHouseInventary) {
        this.idHouseInventary = idHouseInventary;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public House_inventary getId_House() {
        return id_House;
    }

    public void setId_House(House_inventary id_House) {
        this.id_House = id_House;
    }

    public House_inventary getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(House_inventary idArticulo) {
        this.idArticulo = idArticulo;
    }
}
