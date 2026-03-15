/**
 * Clase Producto: Representa un artículo del inventario.
 * Aplica conceptos de Encapsulamiento y Constructores.
 */
public class Producto {
    // Atributos (Propiedades)
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor: Inicializa el objeto con valores específicos
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para mostrar la información del producto
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + cantidad + " unidades");
        System.out.println("---------------------------");
    }

    // Método para realizar una venta (modifica el estado del objeto)
    public void vender(int cantidadVenta) {
        if (cantidadVenta <= cantidad) {
            cantidad -= cantidadVenta; // Resta del inventario
            System.out.println("Venta exitosa de " + cantidadVenta + " " + nombre);
        } else {
            System.out.println("Error: No hay suficiente stock de " + nombre);
        }
    }
}