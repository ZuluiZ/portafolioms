create table public.tb_portafolio (
    id_portafolio serial primary key,
    nombre_portafolio varchar(32) NOT NULL,
    balance_portafolio Double NOT NULL
)

create table public.tb_transacciones (
    id_transaccion serial primary key,
    tipo_transaccion varchar(15) NOT NULL,
    id_moneda Long NOT NULL,
    cantidad Double NOT NULL,
    fecha_registro Date NOT NULL,
    tarifa Double NOT NULL,
    nota varchar(255) NOT NULL,
    extra varchar(15)
)

create table public.tb_portafolio_transaccion (
    id_portafolio_transaccion serial primary key,
    id_portafolio Long NOT NULL,
    id_transaccion Long NOT NULL,
    CONSTRAINT fk_portalio foreign key (id_portafolio) REFERENCES tb_portafolio(id_portafolio),
    CONSTRAINT fk_transaccion foreign key (id_transaccion) REFERENCES tb_transacciones(id_transaccion)
)
