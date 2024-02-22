package com.yoteayudo.servicios.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.yoteayudo.model.Ayuda;
import java.util.List;
@RestController @RequestMapping("/api/ayudas") public class AyudaController {

    private final AyudaService ayudaService;
    
    public AyudaController(AyudaService ayudaService) { this.ayudaService = ayudaService; }
    
    @PostMapping public ResponseEntity<Ayuda> crearAyuda(@RequestBody Ayuda ayuda) { Ayuda ayudaCreada = ayudaService.crearAyuda(ayuda); return ResponseEntity.ok(ayudaCreada); }
    
    @GetMapping public ResponseEntity<List<Ayuda>> obtenerTodasLasAyudas() { List<Ayuda> ayudas = ayudaService.obtenerTodasLasAyudas(); return ResponseEntity.ok(ayudas); }
    
    @GetMapping("/{id}") public ResponseEntity<Ayuda> obtenerAyudaPorId(@PathVariable Long id) { Ayuda ayuda = ayudaService.obtenerAyudaPorId(id); return ResponseEntity.ok(ayuda); }
    
    @PutMapping("/{id}") public ResponseEntity<Ayuda> actualizarAyuda(@PathVariable Long id, @RequestBody Ayuda ayudaActualizada) { Ayuda ayudaActualizadaEnDB = ayudaService.actualizarAyuda(id, ayudaActualizada); return ResponseEntity.ok(ayudaActualizadaEnDB); }
    
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminarAyuda(@PathVariable Long id) { ayudaService.eliminarAyuda(id); return ResponseEntity.noContent().build(); } }
