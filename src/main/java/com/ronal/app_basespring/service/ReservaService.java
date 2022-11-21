package com.ronal.app_basespring.service;

import com.ronal.app_basespring.repository.LibroRepository;
import com.ronal.app_basespring.repository.ReservaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
@Log4j2
public class ReservaService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private LibroRepository libroRepository;

}
