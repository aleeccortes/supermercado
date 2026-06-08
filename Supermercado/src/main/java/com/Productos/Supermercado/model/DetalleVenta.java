package com.Productos.Supermercado.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;

    //Venta
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ventaId")
    private Venta venta;

    //Producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productoId")
    private Producto prod;
    private Integer cantProd;
    private Double precio;
}
