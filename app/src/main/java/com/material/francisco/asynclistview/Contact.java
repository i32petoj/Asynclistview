package com.material.francisco.asynclistview;

/**
 * Created by Francisco on 12/2/2015.
 */

import java.io.Serializable;

public class Contact implements Serializable {
    private Integer id;
    private String name;
    private String contenido;
    private String fecha;


    public Contact(Integer id, String name, String surname, String email) {
        super();
        this.id = id;
        this.name = name;
        this.contenido = surname;
        this.fecha = email;

    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return contenido;
    }

    public void setSurname(String surname) {
        this.contenido = surname;
    }

    public String getEmail() {
        return fecha;
    }

    public void setEmail(String email) {
        this.fecha = email;
    }





}