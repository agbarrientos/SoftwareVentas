package com.example.Ventas.Controller;

import com.example.Ventas.Service.ClienteService;
import com.example.Ventas.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @GetMapping("")
    public List<Clientes> listacliente()
    {
        return clienteService.listacliente();
    }
    @GetMapping("{id}")
    public Clientes mostrarcliente(@PathVariable int id)
    {
        return clienteService.mostrarcliente(id);
    }
}
