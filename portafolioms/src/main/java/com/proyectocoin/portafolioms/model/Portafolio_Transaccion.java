package com.proyectocoin.portafolioms.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_portafolio_transaccion")
public class Portafolio_Transaccion {

    @ManyToOne
    @JoinColumn(name="id_portafolio", nullable=false)
    private Portafolio portafolio;

    @ManyToOne
    @JoinColumn(name="id_transaccion", nullable=false)
    private Transaccion transaccion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_portafolio_transaccion")
    private Long id;


    public Portafolio_Transaccion(Portafolio portafolio, Transaccion transaccion, Long id) {
        this.portafolio = portafolio;
        this.transaccion = transaccion;
        this.id = id;
    }

    public Portafolio_Transaccion() {
    }
}
