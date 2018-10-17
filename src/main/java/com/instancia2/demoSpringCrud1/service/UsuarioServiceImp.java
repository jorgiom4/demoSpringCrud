package com.instancia2.demoSpringCrud1.service;

import com.instancia2.demoSpringCrud1.data.entity.UsuarioEntity;
import com.instancia2.demoSpringCrud1.data.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> findAll() {

        return usuarioRepository.findAll();
    }

    @Override
    public UsuarioEntity findUsuarioEntityByIdUsuario(Long id) {

        return usuarioRepository.findUsuarioEntityByIdUsuario(id);
    }

    @Override
    public UsuarioEntity findUsuarioEntityByName(String name) {

        return usuarioRepository.findUsuarioEntityByName(name);
    }

    @Override
    public UsuarioEntity save(UsuarioEntity usuarioEntity) {

        return usuarioRepository.save(usuarioEntity);
    }

    @Override
    public void deleteUsuarioEntityByIdUsuario(Long id) {

        usuarioRepository.deleteUsuarioEntityByIdUsuario(id);
    }
}
