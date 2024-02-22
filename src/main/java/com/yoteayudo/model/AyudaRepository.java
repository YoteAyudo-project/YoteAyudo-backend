package com.yoteayudo.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository public interface AyudaRepository extends JpaRepository<Ayuda, Long> {

    @Query("SELECT a FROM Ayuda a WHERE a.titulo = ?1") List<Ayuda> findByTitulo(String titulo);
    
    }
