/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

import java.util.ArrayList;

/**
 *
 * @author Em
 */
public class ListaReprodccion {
    int likes;
    String nombre;
    ArrayList<Cancion> cancionesquecontiene = new ArrayList();

    public ListaReprodccion(int likes, String nombre) {
        this.likes = likes;
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCancionesquecontiene() {
        return cancionesquecontiene;
    }

    public void setCancionesquecontiene(ArrayList<Cancion> cancionesquecontiene) {
        this.cancionesquecontiene = cancionesquecontiene;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
