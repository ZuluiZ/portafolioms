package com.proyectocoin.portafolioms.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_transacciones")
public class Transaccion implements Serializable {

    @OneToMany(mappedBy="transaccion")
    private Set<Portafolio_Transaccion> portafolio_transaccions;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion")
    private Long id;

    @Column(name = "tipo_transaccion")
    private String tipo;

    @Column(name = "id_moneda")
    private Long id_moneda;

    @Column(name = "cantidad")
    private Double cantidad;

    @Column(name = "fecha_registro")
    private Date fecha_registro;

    @Column(name = "tarifa")
    private Double tarifa;

    @Column(name = "nota")
    private String nota;

    @Column(name = "extra")
    private String extra;

    public Transaccion() {
    }

    public Transaccion(Long id, String tipo, Long id_moneda, Double cantidad, Date fecha_registro, Double tarifa, String nota, String extra) {
        this.id = id;
        this.tipo = tipo;
        this.id_moneda = id_moneda;
        this.cantidad = cantidad;
        this.fecha_registro = fecha_registro;
        this.tarifa = tarifa;
        this.nota = nota;
        this.extra = extra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(Long id_moneda) {
        this.id_moneda = id_moneda;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
