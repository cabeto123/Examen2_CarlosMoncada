/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_carlosmoncada;

/**
 *
 * @author Em
 */
public class Cancion {
    String titulo;
    int tiempoduracion;
    String referencia;

    public Cancion(String titulo, int tiempoduracion, String referencia) {
        this.titulo = titulo;
        this.tiempoduracion = tiempoduracion;
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempoduracion() {
        return tiempoduracion;
    }

    public void setTiempoduracion(int tiempoduracion) {
        this.tiempoduracion = tiempoduracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return  titulo ;
    }

    
    
}
