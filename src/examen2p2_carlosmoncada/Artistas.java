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
public class Artistas extends Usuarios implements Serializable{
    String nombreartistico;
    ArrayList<Cancion> canciones= new ArrayList();
    ArrayList<Album> albumes= new ArrayList();

    public Artistas(String nombreartistico, String username, String contraseña, int edad) {
        super(username, contraseña, edad);
        this.nombreartistico = nombreartistico;
    }

    public String getNombreartistico() {
        return nombreartistico;
    }

    public void setNombreartistico(String nombreartistico) {
        this.nombreartistico = nombreartistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
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
