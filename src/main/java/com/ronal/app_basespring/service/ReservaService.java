package com.ronal.app_basespring.service;

import com.ronal.app_basespring.entity.Libro;
import com.ronal.app_basespring.entity.Reserva;
import com.ronal.app_basespring.repository.ReservaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Log4j2
public class ReservaService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private ReservaRepository reservaRepository;

    @Transactional
    public boolean crearReserva(Reserva reserva){
        try {
            if (!reservaRepository.equals(reserva.getId())){
                reservaRepository.save(reserva);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
    public List<Reserva> obtenerReserva(){
        return reservaRepository.findAll();
    }
}
