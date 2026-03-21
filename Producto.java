// abstract impide que instancies un "Producto" genérico
public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método común para todos
    public void vender(int cant) {
        if (cant <= cantidad) {
            this.cantidad -= cant;
            System.out.println("Venta exitosa de: " + nombre);
        } else {
            System.out.println("No hay stock suficiente de: " + nombre);
        }
    }

    // Método abstracto: cada hijo debe implementarlo a su manera
    public abstract void mostrarDetalles();
}