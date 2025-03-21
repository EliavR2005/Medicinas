package sistemaMed;

class NodoProducto {
    Producto producto;
    NodoProducto izquierda, derecha;

    public NodoProducto(Producto producto) {
        this.producto = producto;
        izquierda = derecha = null;
    }
}



