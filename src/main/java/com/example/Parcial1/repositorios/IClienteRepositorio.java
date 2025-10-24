package com.example.Parcial1.repositorios;

import com.example.Parcial1.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByDocumento(Integer documento);
}


