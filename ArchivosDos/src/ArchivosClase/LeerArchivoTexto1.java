package ArchivosClase;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto1 {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("data_estadios.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
            
        } // fin de catch
        
    } // fin del m�todo abrirArchivo

    // lee registro del archivo
    
    // lee registro del archivo
    public ArrayList<Estadio> leerRegistros() {
        Operaciones o = new Operaciones();
        ArrayList<Estadio> lista =new ArrayList<>();
        
        //Creamos un objeto de tipo Estadio
        
       try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
           
                Estadio e = new Estadio();
                String linea = entrada.nextLine();
                //Creamos un objeto de ArrayList
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                e.agregarNombreEstadio(linea_partes.get(0));
                e.agregarTipoDeporte(linea_partes.get(1));
                double v =Double.parseDouble(linea_partes.get(2));
                e.agregarCapacidad(v);
                lista.add(e);
         
        } // fin de while
           
           // o.agregarInformacion(lista);
            //System.out.printf("El promedio es: ", o.obtenerPromedioCapacidad());
    } // fin de try
    catch ( NoSuchElementException elementException)
    {
         System.err.println("El archivo no esta bien formado.");
        entrada.close();
        System.exit(1);
    }catch ( IllegalStateException stateException)
      {
         System.err.println("Error al leer del archivo.");
        System.exit(1);
    }
       return lista;
}// fin de catch

 // fin del m�todo leerRegistros
// cierra el archivo y termina la aplicaci�n
public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto
