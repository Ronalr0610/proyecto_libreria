package com.ronal.app_basespring.repository;

import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}
