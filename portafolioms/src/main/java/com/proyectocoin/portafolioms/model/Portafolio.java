package com.proyectocoin.portafolioms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tb_portafolio")
public class Portafolio implements Serializable{

    @OneToMany(mappedBy="portafolio")
    private Set<Portafolio_Transaccion> portafolio_transaccions;

    @Id
    @Column(name="id_portafolio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_portafolio")
    private String nombre;

    @Column(name="balance_portafolio")
    private double balance;

    public Portafolio() {
    }

    public Portafolio(Long id, String nombre, Long id_activo, double balance) {
        this.id = id;
        this.nombre = nombre;

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




    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
