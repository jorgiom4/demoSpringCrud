package com.instancia2.demoSpringCrud1.data.repository;

import com.instancia2.demoSpringCrud1.data.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

    /**
     * Listamos todos los usuarios
     * @return
     */
    List<UsuarioEntity> findAll();

    /**
     * Busca un usuario dado su id
     * @param id
     * @return
     */
    UsuarioEntity findUsuarioEntityByIdUsuario(Long id);

    /**
     * Busca un usuario dado su nombre
     * @param name
     * @return
     */
    UsuarioEntity findUsuarioEntityByName(String name);

    /**
     * Guarda en base de datos un nuevos usuario
     * @param usuarioEntity
     * @return
     */
    UsuarioEntity save(UsuarioEntity usuarioEntity);

    /**
     * Borra de la base de datos un usuario dado su id
     * @param id
     */
    void deleteUsuarioEntityByIdUsuario(Long id);

}
