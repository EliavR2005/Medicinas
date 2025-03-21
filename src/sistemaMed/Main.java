package sistemaMed;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Usuario[] usuarios = {
                new Usuario("Manager", "1234"),
                new Usuario("usuario", "1234")
        };

        // Instancias
        Queue<String> colaProductos = new LinkedList<>();  // Definir primero
        Login login = new Login(usuarios);
        EntradaProductos entradaProductos = new EntradaProductos(colaProductos);

        if (login.autenticar()) {
            System.out.println("Login exitoso. Bienvenido al sistema de gestión de medicamentos.");

            ArbolProducto arbolProductos = new ArbolProducto();  // Creamos el árbol para los productos
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nSeleccione una opción:");
                System.out.println("1. Agregar producto");
                System.out.println("2. Buscar producto");
                System.out.println("3. Eliminar producto");
                System.out.println("4. Mostrar inventario (Inorden)");
                System.out.println("5. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el ID del producto: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese la cantidad del producto: ");
                        int cantidad = scanner.nextInt();

                        System.out.print("Ingrese el precio del producto: ");
                        double precio = scanner.nextDouble();

                        Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
                        arbolProductos.insertar(nuevoProducto);
                        System.out.println("Producto agregado con éxito.");
                        break;

                    case 2:
                        System.out.print("Ingrese el ID del producto a buscar: ");
                        int idBuscar = scanner.nextInt();
                        Producto productoEncontrado = arbolProductos.buscar(idBuscar);
                        if (productoEncontrado != null) {
                            System.out.println("Producto encontrado: " + productoEncontrado.getNombre());
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                        break;

                    case 3:
                        System.out.println("Función de eliminar producto pendiente de implementación.");
                        break;

                    case 4:
                        System.out.println("\nInventario (Inorden):");
                        arbolProductos.inorden();
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema.");
                        return;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
        } else {
            System.out.println("Login fallido. Usuario o contraseña incorrectos.");
        }
    }
}
