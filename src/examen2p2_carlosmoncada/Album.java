/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Em
 */
public class Album extends Lanzamiento {
    ArrayList<Cancion> cancionespertenecientesalmismo= new ArrayList();
    int cantcanciones;
  
    public Album(int cantcanciones, String titulodepublicacion, String fechalanzamiento, int conteolikes) {
        super(titulodepublicacion, fechalanzamiento, conteolikes);
        this.cantcanciones = cantcanciones;
    }
    
    
}
