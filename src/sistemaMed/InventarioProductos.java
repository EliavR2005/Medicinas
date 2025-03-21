package sistemaMed;

import java.util.Queue;
import java.util.Stack;

public class InventarioProductos {
    private Stack<String> pilaProductos;
    private Queue<String> colaProductos;
    private boolean esFIFO;

    public InventarioProductos(Stack<String> pilaProductos, Queue<String> colaProductos, boolean esFIFO) {
        this.pilaProductos = pilaProductos;
        this.colaProductos = colaProductos;
        this.esFIFO = esFIFO;
    }

    public void mostrarInventario() {
        System.out.println("Estado actual del inventario:");
        if (esFIFO) {
            for (String producto : colaProductos) {
                System.out.println(producto);
            }
        } else {
            for (String producto : pilaProductos) {
                System.out.println(producto);
            }
        }
    }
}