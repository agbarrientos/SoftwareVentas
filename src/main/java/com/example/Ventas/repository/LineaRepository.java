package com.example.Ventas.repository;

import com.example.Ventas.model.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineaRepository extends JpaRepository<Linea,Integer> {
}
