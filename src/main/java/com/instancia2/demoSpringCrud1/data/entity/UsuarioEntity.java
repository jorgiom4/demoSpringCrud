package com.instancia2.demoSpringCrud1.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idUsuario;

    @Column(name = "user")
    private String user;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;

    public UsuarioEntity() {}

    public UsuarioEntity(Long idUsuario, String user, String name, String pass) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.pass = pass;
    }

    // Getter & Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /*
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (1, 'Gorka','hola1','user1');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (2, 'Juan','hola2','user2');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (3, 'Pedro','hola3','user3');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (4, 'Antonio','hola4','user4');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (5, 'Susana','hola5','user5');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (6, 'Belen','hola6','user6');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (7, 'Juanjo','hola7','user7');
    INSERT INTO USUARIOS (ID,NAME,PASS,USER) VALUES (8, 'Monica','hola8','user8');
    select * from USUARIOS;
    */
}
