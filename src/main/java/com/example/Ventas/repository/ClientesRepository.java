package com.example.Ventas.repository;

import com.example.Ventas.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository <Clientes,Integer> {

}
