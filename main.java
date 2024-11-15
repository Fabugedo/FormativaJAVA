package javaapplication8;

import java.util.Scanner;

/
 *
 
@author david*/
public class JavaApplication8 {

    /
     
@param args the command line arguments*/
 public static void main(String[] args) {
     Scanner tc=new Scanner (System.in);
     Producto p1 = new Producto();
     boolean validacion = false;
     for (int intentos = 0; intentos < 3; intentos++) {
         try {
      System.out.println("Ingrese el codigo");
      int cod = tc.nextInt();tc.nextLine();
      System.out.println("Ingrese descripcion");
      String descripcion = tc.nextLine();
      System.out.println("Ingrese valor");
      int prec = tc.nextInt();tc.nextLine();
      System.out.println("Ingrese cantidad:");
              int cant = tc.nextInt(); tc.nextLine(); // Limpiar buffer

                // Establecer los valores en el objeto producto
                p1.setCodigo(cod);
                p1.setDescripcion(descripcion);
                p1.setPrecio(prec);
                p1.setCantidad(cant);

                validacion = true; // Marcar que los datos son válidos
                break; // Salir del bucle si los datos son válidos
            } catch (Exception e) {
                System.out.println("Error al ingresar los datos. Intente de nuevo.");
                int intentosRestantes = 2 - intentos; // Calcular intentos restantes
                System.out.println("Le quedan " + intentosRestantes + " intentos."); // Mostrar intentos restantes
                tc.nextLine(); // Limpiar el buffer en caso de una excepción
            }
        }

        if (validacion) {
            System.out.println(p1.toString());
        } else {
            System.out.println("Adios, los datos no fueron ingresados correctamente.");
        }

        tc.close(); // Cerrar el scanner
    }

}
