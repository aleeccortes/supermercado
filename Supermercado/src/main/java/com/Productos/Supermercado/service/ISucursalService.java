package com.Productos.Supermercado.service;

import com.Productos.Supermercado.dto.SucursalDTO;

import java.util.List;

public interface ISucursalService {
    List<SucursalDTO> traerSucursales();

    SucursalDTO crearSucursal(SucursalDTO sucursalDto);

    SucursalDTO actualizarSucursal(Long id,SucursalDTO sucursalDTO);

    void eliminarSucursal(Long id);
}
