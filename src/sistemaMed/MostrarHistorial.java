package sistemaMed;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MostrarHistorial {
    private Stack<String> historialEntradas;
    private Stack<String> historialSalidas;

    public MostrarHistorial() {
        historialEntradas = new Stack<>();
        historialSalidas = new Stack<>();
    }

    public void agregarEntrada(String producto) {
        historialEntradas.push(producto);
    }

    public void agregarSalida(String producto) {
        historialSalidas.push(producto);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de entradas:");
        for (int i = historialEntradas.size() - 1; i >= 0; i--) {
            System.out.println(historialEntradas.get(i));
        }

        System.out.println("Historial de salidas:");
        for (int i = historialSalidas.size() - 1; i >= 0; i--) {
            System.out.println(historialSalidas.get(i));
        }
    }
}