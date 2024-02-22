package com.yoteayudo.model;

import java.util.List;

import org.springframework.stereotype.Service;

@Service public class Ayuda {

    private final AyudaRepository ayudaRepository;
    
    public Ayuda(AyudaRepository ayudaRepository) { this.ayudaRepository = ayudaRepository; }
    
    public Ayuda crearAyuda(Ayuda ayuda) { return ayudaRepository.save(ayuda); }
    
    public List<Ayuda> obtenerTodasLasAyudas() { return ayudaRepository.findAll(); }
    
    public Ayuda obtenerAyudaPorId(Long id) { return ayudaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ayuda no encontrada")); }
    
    public Ayuda actualizarAyuda(Long id, Ayuda ayudaActualizada) { Ayuda ayudaExistente = obtenerAyudaPorId(id); ayudaExistente.setTitulo(((Ayuda) ayudaActualizada).getTitulo()); ayudaExistente.setDescripcion(ayudaActualizada.getDescripcion()); return ayudaRepository.save(ayudaExistente); }
    
    public void eliminarAyuda(Long id) { ayudaRepository.deleteById(id); }

    private String titulo;
    private String descripcion;
    private Long id;
    
    public Ayuda(Long id, String titulo, String descripcion) {
        this.ayudaRepository = null;
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }}