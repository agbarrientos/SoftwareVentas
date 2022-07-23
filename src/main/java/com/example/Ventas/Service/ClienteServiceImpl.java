package com.example.Ventas.Service;

import com.example.Ventas.model.Clientes;
import com.example.Ventas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    ClientesRepository clientesRepository;
    @Override
    public List<Clientes> listacliente() {
        return clientesRepository.findAll();
    }
}
