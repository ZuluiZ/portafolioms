package com.proyectocoin.portafolioms.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_portafolio_transaccion")
public class Portafolio_Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_portafolio_transaccion")
    private Long id;

    @OneToMany
    @JoinColumn(name = "id")
    private Portafolio portafolio;

    @ManyToOne
    @JoinColumn( name = "id")
    private Transaccion transaccion;

    public Portafolio_Transaccion(Portafolio portafolio, Transaccion transaccion) {
        this.portafolio = portafolio;
        this.transaccion = transaccion;
    }


}
