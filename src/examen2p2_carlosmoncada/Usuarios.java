/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

import java.io.Serializable;

/**
 *
 * @author Em
 */
public class Usuarios implements Serializable{
    String username;
    String contraseña;
    int edad;

    public Usuarios() {
    }

    public Usuarios(String username, String contraseña, int edad) {
        this.username = username;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  username ;
    }
    
   }
