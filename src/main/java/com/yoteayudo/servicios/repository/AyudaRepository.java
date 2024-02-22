package com.yoteayudo.servicios.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yoteayudo.model.Ayuda;

public interface AyudaRepository extends JpaRepository<Ayuda, Long> {
    @Query("SELECT a FROM Ayuda a WHERE a.titulo = ?1") List<Ayuda> findByTitulo(String titulo);

@Query("SELECT a FROM Ayuda a WHERE a.descripcion LIKE %?1%") List<Ayuda> findByDescripcionContaining(String descripcion);

@Query(value = "SELECT * FROM ayuda WHERE id IN (SELECT ayuda_id FROM comentario WHERE usuario_id = ?1)", nativeQuery = true) List<Ayuda> findByUsuarioId(Long usuarioId);

@Query("SELECT a FROM Ayuda a WHERE a.id IN (SELECT c.ayuda.id FROM Comentario c WHERE c.usuario.id = ?1)") List<Ayuda> findAyudasComentadasPorUsuario(Long usuarioId);
}

