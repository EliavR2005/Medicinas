package sistemaMed;

import java.util.Queue;

public class EntradaProductos {
    private Queue<String> productos;  // Usar una cola (FIFO)

    public EntradaProductos(Queue<String> productos) {
        this.productos = productos;
    }

    // Agregar un producto a la cola
    public void agregarProducto(String producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return productos.isEmpty();
    }

    // Ver el primer producto sin eliminarlo
    public String verPrimerProducto() {
        if (!productos.isEmpty()) {
            return productos.peek();
        } else {
            return "No hay productos en la cola.";
        }
    }

    // Eliminar el primer producto de la cola (FIFO)
    public String eliminarPrimerProducto() {
        if (!productos.isEmpty()) {
            return productos.poll();
        } else {
            return "No hay productos para eliminar.";
        }
    }

    // Mostrar todos los productos en la cola
    public void mostrarProductos() {
        if (!productos.isEmpty()) {
            System.out.println("Productos en la cola:");
            for (String producto : productos) {
                System.out.println(producto);
            }
        } else {
            System.out.println("No hay productos en la cola.");
        }
    }
}
