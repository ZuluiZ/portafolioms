package com.proyectocoin.portafolioms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="tb_portafolio")
public class Portafolio implements Serializable{


    @Id
    @Column(name="id_portafolio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_portafolio")
    private String nombre;

    @Column(name="id_transaccion")
    @OneToMany
    @JoinColumn(name = "tb_transacciones")
    private Long id_transaccion;

    @Column(name="balance_portafolio")
    private double balance;

    public Portafolio() {
    }

    public Portafolio(Long id, String nombre, Long transaccion, Long id_activo, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.id_transaccion = transaccion;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(Long id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
