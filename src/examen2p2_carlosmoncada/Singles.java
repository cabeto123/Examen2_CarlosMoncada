/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

import java.util.Date;

/**
 *
 * @author Em
 */
public class Singles extends Lanzamiento {
    Cancion cancionquevaadentro;

    public Singles(Cancion cancionquevaadentro, String titulodepublicacion, String fechalanzamiento, int conteolikes) {
        super(titulodepublicacion, fechalanzamiento, conteolikes);
        this.cancionquevaadentro = cancionquevaadentro;
    }
    
}
