package com.tg.vitrineVirtual.repository;

import com.tg.vitrineVirtual.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
