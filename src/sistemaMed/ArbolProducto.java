package sistemaMed;

public class ArbolProducto {
    private NodoProducto raiz;

    public ArbolProducto() {
        raiz = null;
    }

    // Método para insertar un producto en el árbol (BST)
    public void insertar(Producto producto) {
        raiz = insertarRecursivo(raiz, producto);
    }

    private NodoProducto insertarRecursivo(NodoProducto raiz, Producto producto) {
        if (raiz == null) {
            raiz = new NodoProducto(producto);
            return raiz;
        }

        if (producto.getId() < raiz.producto.getId()) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, producto);
        } else if (producto.getId() > raiz.producto.getId()) {
            raiz.derecha = insertarRecursivo(raiz.derecha, producto);
        }

        return raiz;
    }

    // Método para buscar un producto
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private Producto buscarRecursivo(NodoProducto raiz, int id) {
        if (raiz == null || raiz.producto.getId() == id) {
            return raiz != null ? raiz.producto : null;
        }

        if (id < raiz.producto.getId()) {
            return buscarRecursivo(raiz.izquierda, id);
        } else {
            return buscarRecursivo(raiz.derecha, id);
        }
    }

    // Métodos de recorrido (inorden, preorden, postorden)
    public void inorden() {
        inordenRecursivo(raiz);
    }

    private void inordenRecursivo(NodoProducto raiz) {
        if (raiz != null) {
            inordenRecursivo(raiz.izquierda);
            System.out.println(raiz.producto.getNombre() + " - ID: " + raiz.producto.getId());
            inordenRecursivo(raiz.derecha);
        }
    }

    public void preorden() {
        preordenRecursivo(raiz);
    }

    private void preordenRecursivo(NodoProducto raiz) {
        if (raiz != null) {
            System.out.println(raiz.producto.getNombre() + " - ID: " + raiz.producto.getId());
            preordenRecursivo(raiz.izquierda);
            preordenRecursivo(raiz.derecha);
        }
    }

    public void postorden() {
        postordenRecursivo(raiz);
    }

    private void postordenRecursivo(NodoProducto raiz) {
        if (raiz != null) {
            postordenRecursivo(raiz.izquierda);
            postordenRecursivo(raiz.derecha);
            System.out.println(raiz.producto.getNombre() + " - ID: " + raiz.producto.getId());
        }
    }
}
