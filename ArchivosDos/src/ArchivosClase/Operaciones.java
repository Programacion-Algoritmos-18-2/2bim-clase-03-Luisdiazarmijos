/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosClase;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Operaciones {

    ArrayList<Estadio> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Estadio> info) {
        informacion = info;
    }

    public ArrayList<Estadio> obtenerInformacion() {
        return informacion;
    }

    public double obtenerPromedioCapacidad() {
        //Declaramos una variable suma
        double suma = 0;

        //Creamos un ciclo repetitivo
        for (int i = 0; i < obtenerInformacion().size(); i++) {
            //Almacenamos el resultado en suma
            suma += obtenerInformacion().get(i).obtenerCapacidad();
        }
        double promedio = suma / obtenerInformacion().size();
        return promedio;
    }
}
