/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author rodrigo
 */
public class Cliente {
    private String cc;
    private String nombre;
    private String apellidos;
    
    //Se omiten set y get

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    public Cliente (
        String cc,
        String nombre,
        String apellidos
        ){
    this.cc = cc;
    this.nombre = nombre;
    this.apellidos = apellidos;
    }
}
