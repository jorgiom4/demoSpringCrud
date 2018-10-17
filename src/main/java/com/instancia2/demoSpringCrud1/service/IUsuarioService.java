package com.instancia2.demoSpringCrud1.service;

import com.instancia2.demoSpringCrud1.data.entity.UsuarioEntity;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioEntity> findAll();

    UsuarioEntity findUsuarioEntityByIdUsuario(Long id);

    UsuarioEntity findUsuarioEntityByName(String name);

    UsuarioEntity save(UsuarioEntity usuarioEntity);

    void deleteUsuarioEntityByIdUsuario(Long id);
}
