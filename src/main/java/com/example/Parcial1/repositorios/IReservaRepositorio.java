package com.example.Parcial1.repositorios;

import com.example.Parcial1.modelos.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IReservaRepositorio extends JpaRepository<Reserva, Integer> {

    Optional<Reserva> findByCodigoReserva(Integer codigoReserva);
    List<Reserva> findByFechaHora(String fechaHora);
}
