/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.ArrayList;

/**
 *
 * @author nelson
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      mport java.util.ArrayList;
import java.util.Scanner;

class Tarea {
    private String titulo;
    private String descripcion;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Descripción: " + descripcion;
    }
}

public class ListaDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarea> tareas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE TAREAS ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Eliminar tarea por índice");
            System.out.println("4. Buscar tarea por palabra clave");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título de la tarea: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la descripción: ");
                    String descripcion = scanner.nextLine();
                    tareas.add(new Tarea(titulo, descripcion));
                    System.out.println("✅ Tarea agregada con éxito.");
                    break;

                case 2:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        System.out.println("\n=== LISTA DE TAREAS ===");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int indice = Integer.parseInt(scanner.nextLine());
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.remove(indice);
                        System.out.println("✅ Tarea eliminada.");
                    } else {
                        System.out.println("❌ Índice no válido.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la palabra clave para buscar: ");
                    String keyword = scanner.nextLine().toLowerCase();
                    boolean encontrada = false;
                    for (Tarea tarea : tareas) {
                        if (tarea.getTitulo().toLowerCase().contains(keyword)) {
                            System.out.println(tarea);
                            encontrada = true;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("No se encontraron tareas con esa palabra clave.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

}  // TODO code application logic here
    }
    
}
