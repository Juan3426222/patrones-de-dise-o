/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package credenciales;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneradorCredenciales generador = GeneradorCredenciales.getInstancia();

        // Plantilla base
        Credencial plantilla = new Credencial("Nombre Apellido", "Cargo", "RUT");

        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar credencial");
            System.out.println("2. Ver credenciales");
            System.out.println("3. Eliminar todas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("RUT: ");
                    String rut = scanner.nextLine();

                    Credencial nueva = plantilla.clone();
                    nueva.setNombre(nombre);
                    nueva.setCargo(cargo);
                    nueva.setRut(rut);

                    generador.agregarCredencial(nueva);
                    System.out.println("Credencial generada.");
                    break;

                case 2:
                    generador.mostrarCredenciales();
                    break;

                case 3:
                    generador.eliminarTodas();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
