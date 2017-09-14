package com.i053113.programacion.Models;

/**
 * Created by JUANJO FAJARDO on 14/09/2017.
 */

public class Persons {

    // crear atributos
    private String first_name;
    private String last_name;

    // aqui se hace el POJO = CLIC DERCEHO = GENERATE -> SETERS AND GETERS Y SELECCIONAR LOS DOS

// GET =  OBTENER NOMBRE
    public String getFirst_name() {
        return first_name;
    }
// SET ESTABLECER NOMBRE
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    // GET =  OBTENER APELLIDO
    public String getLast_name() {
        return last_name;
    }
    // GET =  ESTABLECER APELLIDO

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
