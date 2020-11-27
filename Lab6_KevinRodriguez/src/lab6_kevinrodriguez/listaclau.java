/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class listaclau {
    public String nombreclase;
    public String nombre;
    public String puntuacion;
    public String año_Lanzamiento;
    public String Tipo;
    public String Genero;

    public listaclau(String nombreclase, String nombre, String puntuacion, String año_Lanzamiento, String Tipo, String Genero) {
        this.nombreclase = nombreclase;
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.año_Lanzamiento = año_Lanzamiento;
        this.Tipo = Tipo;
        this.Genero = Genero;
    }

    

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAño_Lanzamiento() {
        return año_Lanzamiento;
    }

    public void setAño_Lanzamiento(String año_Lanzamiento) {
        this.año_Lanzamiento = año_Lanzamiento;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "nombreclase=" + nombreclase + ", nombre=" + nombre + ", puntuacion=" + puntuacion + "año de Lanzamiento=" + año_Lanzamiento + ", Tipo=" + Tipo + ", Genero=" + Genero ;
    }
}
