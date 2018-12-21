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
public class PruebaArchivosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeerArchivoTexto1 aplicacion = new LeerArchivoTexto1();
        Operaciones operacion = new Operaciones();
        aplicacion.abrirArchivo();
        operacion.agregarInformacion(aplicacion.leerRegistros());
        System.out.printf("El promedio es: %.2f", operacion.obtenerPromedioCapacidad());
        System.out.println("");
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaArchivosClase

