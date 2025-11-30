package cl.salmontt.data;

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Producto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;

/**
 * Clase que lee los archivos del centro de cultivo y crea objetos con los datos cargados
 * ademas hace la limpieza del archivo (separar los ";" y guarda la info.
 * Tambien cargamos el inventario con este proceso {@link Producto}
 */

public class GestorDatos {

    // Metodo para Centro de Cultivo
    public ArrayList<CentroCultivo> cargarCentros(String centros) {

        ArrayList<CentroCultivo> lista = new ArrayList<>();

        // Cargar archivo desde resources/
        InputStream input = getClass().getClassLoader().getResourceAsStream(centros);

        if (input == null) {
            System.out.println("No se encontró el archivo: " + centros);
            return lista;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                // Separar con punto y coma
                String[] datos = linea.split(";");

                //validación
                if (datos.length != 7) { //si la linea no tiene 7 datos
                    System.out.println("Linea ignoradda por formato incorrecto: " + linea); //avisa cual linea es
                    continue; // se la salta y no causa error
                }


                CentroCultivo centro = new CentroCultivo( // Crear objeto
                        datos[0],                    // idCentro
                        datos[1],                    // nombre
                        datos[2],                    // comuna
                        Integer.parseInt(datos[3]),  // toneladas
                        Double.parseDouble(datos[4]),// profundidadAgua
                        Double.parseDouble(datos[5]),// salinidad
                        datos[6]                     // tipoSalmon
                );

                //Guardarlo en la lista
                lista.add(centro);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }

    //AQUI INICIA CARGAR INVENTARIO
    public ArrayList<Producto> cargarInventario() {

        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto(1001, "Salmón", "Atlántico", "Los Lagos", true, 7990.00, 850));
        inventario.add(new Producto(1002, "Salmón", "Coho", "Aysén", true, 8990.00, 745));
        inventario.add(new Producto(1003, "Salmón", "Trucha", "Los Ríos", false, 6590, 1055));
        inventario.add(new Producto(1004, "Salmón", "Trucha", "Los Lagos", false, 7370, 1002));

        return inventario;
    }

    //Metodo para guardar inventario en archivo txt
    public void guardarInventario(ArrayList<Producto> inventario) {

        try {
            String nombreArchivo = "inventario.txt"; //escribe el nombre del archivo en este caso 'inventario'
            FileWriter archivo = new FileWriter(nombreArchivo);

            archivo.write(">>>>>>>>>> INVENTARIO DE PRODUCTOS <<<<<<<<<<\n\n"); //escribimos dentro del archivo

            //recorremos Producto y lo escribimos en el archivo q estamos creando
            for (Producto p : inventario) {
                archivo.write(p.toString() + "\n");
            }

            archivo.close(); //fin de proceso
            System.out.println("Archivo 'Inventario.txt' creado exitosamente");

            //Mostrar la ruta del archivo
            File patharchivo = new File(nombreArchivo);
            System.out.println("Ruta del archivo: " + patharchivo.getAbsolutePath());

            //Mensaje de error por si falla
            } catch (IOException e) {
                System.out.println("Error al cargar inventario" + e.getMessage());
            }

        }

    }
