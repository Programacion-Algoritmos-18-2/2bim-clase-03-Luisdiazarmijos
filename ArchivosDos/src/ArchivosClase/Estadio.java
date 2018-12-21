/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosClase;

/**
 *
 * @author USUARIO
 */
public class Estadio {
    private String nombreEstadio;
    private double capacidad;
    private String tipoDeporte;

    public String obtenerNombreEstadio() {
        return nombreEstadio;
    }

    public void agregarNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public Double obtenerCapacidad() {
        return capacidad;
    }

    public void agregarCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String obtenergetTipoDeporte() {
        return tipoDeporte;
    }

    public void agregarTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombreEstadio=" + nombreEstadio + ", capacidad=" + capacidad + ", tipoDeporte=" + tipoDeporte + '}';
    }
    
}
