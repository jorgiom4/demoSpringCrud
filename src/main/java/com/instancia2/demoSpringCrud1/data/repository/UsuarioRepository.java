package com.instancia2.demoSpringCrud1.data.repository;

import com.instancia2.demoSpringCrud1.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

    List<UsuarioEntity> findAll();

    UsuarioEntity findUsuarioEntityByIdUsuario(Long id);

    UsuarioEntity findUsuarioEntityByName(String name);

    UsuarioEntity save(UsuarioEntity usuarioEntity);

    void deleteUsuarioEntityByIdUsuario(Long id);

}
