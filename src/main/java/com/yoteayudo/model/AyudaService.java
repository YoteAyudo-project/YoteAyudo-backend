package com.yoteayudo.model;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yoteayudo.servicios.repository.AyudaRepository;

@Service public class AyudaService {

    private final AyudaRepository ayudaRepository;
    
    public AyudaService(AyudaRepository ayudaRepository) { this.ayudaRepository = ayudaRepository; }
    
    public Ayuda crearAyuda(Ayuda ayuda) { return ayudaRepository.save(ayuda); }
    
    public List<Ayuda> obtenerTodasLasAyudas() { return ayudaRepository.findAll(); }
    
    public Ayuda obtenerAyudaPorId(Long id) { return ayudaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ayuda no encontrada")); }
    
    public Ayuda actualizarAyuda(Long id, Ayuda ayudaActualizada) { Ayuda ayudaExistente = obtenerAyudaPorId(id); ayudaExistente.setTitle(ayudaActualizada.getTitle()); ayudaExistente.setDescripcion(ayudaActualizada.getDescripcion()); return ayudaRepository.save(ayudaExistente); }
    
    public void eliminarAyuda(Long id) { ayudaRepository.deleteById(id); } }
