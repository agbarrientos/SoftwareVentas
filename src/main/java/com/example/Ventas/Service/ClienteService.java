package com.example.Ventas.Service;

import com.example.Ventas.model.Clientes;

import java.util.List;

public interface ClienteService {
    List<Clientes> listacliente();

    Clientes mostrarcliente(int id);
}
