package com.instancia2.demoSpringCrud1.rest;


import com.instancia2.demoSpringCrud1.data.entity.UsuarioEntity;
import com.instancia2.demoSpringCrud1.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioResource {

    @Autowired
    private IUsuarioService usuarioService;


    @RequestMapping(method = RequestMethod.GET, path = "/users")
    public List<UsuarioEntity> findAll(){

        return usuarioService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/users/id")
    public UsuarioEntity findUsuarioEntityByIdUsuario(@RequestParam(name = "id") Long id){

        return usuarioService.findUsuarioEntityByIdUsuario(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/users/name")
    public UsuarioEntity findUsuarioEntityByName(@RequestParam(name = "name") String name){

        return usuarioService.findUsuarioEntityByName(name);

    }

    @RequestMapping(method = RequestMethod.POST, path = "/users/new")
    public UsuarioEntity save(@RequestParam(name = "user") String user, @RequestParam(name = "name") String name, @RequestParam(name = "pass") String pass){

        UsuarioEntity usuarioEntityNew = new UsuarioEntity();
        usuarioEntityNew.setName(user);
        usuarioEntityNew.setUser(name);
        usuarioEntityNew.setPass(pass);

        return usuarioService.save(usuarioEntityNew);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/users/delete")
    public void deleteUsuarioEntitiesByIdUsuario(@RequestParam(name = "id") Long id){

        UsuarioEntity usuarioEntity = this.findUsuarioEntityByIdUsuario(id);

        usuarioService.deleteUsuarioEntityByIdUsuario(usuarioEntity.getIdUsuario());
    }


}
