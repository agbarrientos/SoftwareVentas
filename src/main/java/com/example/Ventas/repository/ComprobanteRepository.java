package com.example.Ventas.repository;
import com.example.Ventas.model.Clientes;
import com.example.Ventas.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante,Integer> {
}
