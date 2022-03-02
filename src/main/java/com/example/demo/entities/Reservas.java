package com.example.demo.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reservas")

public class Reservas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservas")
    private int idReservas;

    @Column(name = "estado")
    private String Estado;

    @Column(name = "tiempo")
    private int Tiempo;

    @JoinColumn(name = "house_id_house", referencedColumnName = "id_house")
    @OneToOne(fetch = FetchType.LAZY)
    private Reservas idHouse;

    @JoinColumn(name = "usuario_user_name", referencedColumnName = "user_name")
    @OneToOne(fetch = FetchType.LAZY)
    private Reservas userName;

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    public Reservas getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(Reservas idHouse) {
        this.idHouse = idHouse;
    }

    public Reservas getUserName() {
        return userName;
    }

    public void setUserName(Reservas userName) {
        this.userName = userName;
    }
}
