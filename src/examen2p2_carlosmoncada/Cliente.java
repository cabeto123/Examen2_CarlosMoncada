/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Em
 */
public class Cliente extends Usuarios implements Serializable{
    ArrayList<Cancion> cancionesfavoritas= new ArrayList();
   ListaReprodccion listadereproduccion;
   ListaReprodccion listareproduccionporlike;

    public Cliente(String username, String contraseña, int edad) {
        super(username, contraseña, edad);
    }

    public ArrayList<Cancion> getCancionesfavoritas() {
        return cancionesfavoritas;
    }

    public void setCancionesfavoritas(ArrayList<Cancion> cancionesfavoritas) {
        this.cancionesfavoritas = cancionesfavoritas;
    }

    public ListaReprodccion getListadereproduccion() {
        return listadereproduccion;
    }

    public void setListadereproduccion(ListaReprodccion listadereproduccion) {
        this.listadereproduccion = listadereproduccion;
    }

    public ListaReprodccion getListareproduccionporlike() {
        return listareproduccionporlike;
    }

    public void setListareproduccionporlike(ListaReprodccion listareproduccionporlike) {
        this.listareproduccionporlike = listareproduccionporlike;
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
   
}
