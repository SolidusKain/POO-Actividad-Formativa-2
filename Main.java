/**
 * Clase Principal: Donde ocurre la ejecución y prueba del sistema.
 */
public class Main {
    public static void main(String[] args) {
        // Instanciación de objetos (Crear productos reales)
        Producto p1 = new Producto("Laptop MSI", 1200.50, 10);
        Producto p2 = new Producto("Monitor Gamer", 300.00, 5);

        // Uso de métodos
        System.out.println("--- ESTADO INICIAL ---");
        p1.mostrarDetalles();
        p2.mostrarDetalles();

        // Realizar acciones
        p1.vender(3); // Vendemos 3 laptops
        p2.vender(10); // Intentamos vender más de lo que hay

        System.out.println("\n--- ESTADO FINAL ---");
        p1.mostrarDetalles();
    }
}