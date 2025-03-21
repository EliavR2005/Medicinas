package sistemaMed;

import java.util.Queue;
import java.util.Stack;

public class SalidaProductos {
    private Stack<String> pilaProductos;
    private Queue<String> colaProductos;
    private boolean esFIFO;

    public SalidaProductos(Stack<String> pilaProductos, Queue<String> colaProductos, boolean esFIFO) {
        this.pilaProductos = pilaProductos;
        this.colaProductos = colaProductos;
        this.esFIFO = esFIFO;
    }

    public String sacarProducto() {
        String producto;
        if (esFIFO) {
            producto = colaProductos.poll();  // Sacar de la cola (FIFO)
            if (producto != null) {
                pilaProductos.remove(producto);  // Eliminar de la pila
            }
        } else {
            producto = pilaProductos.isEmpty() ? null : pilaProductos.pop();  // Sacar de la pila (LIFO)
            if (producto != null) {
                colaProductos.remove(producto);  // Eliminar de la cola
            }
        }
        return producto;
    }
}