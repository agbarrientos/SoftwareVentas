package com.example.Ventas.Controller;

import com.example.Ventas.Service.ClienteService;
import com.example.Ventas.model.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
