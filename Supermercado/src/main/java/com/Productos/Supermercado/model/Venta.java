package com.Productos.Supermercado.model;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private String estado;
    private Double total;

    @ManyToOne
    private Sucursal sucursal;

    @OneToMany(mappedBy="venta",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    @Builder.Default
    private List<DetalleVenta> detalle=new ArrayList<>();

}
