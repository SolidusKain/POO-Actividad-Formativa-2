import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Usamos una lista de la clase padre (Producto) para guardar hijos diferentes
        ArrayList<Producto> inventario = new ArrayList<>();

        // Polimorfismo: agregamos diferentes tipos a la misma lista
        inventario.add(new Electronico("Laptop MSI", 1500.0, 10, 24));
        inventario.add(new Alimento("Manzanas", 2.5, 50, "2026-04-15"));
        inventario.add(new Electronico("PS5 Slim", 550.0, 5, 12));

        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIOS (POLIMORFISMO) ===\n");

        // Recorremos la lista y llamamos al mismo método 'mostrarDetalles'
        // Cada objeto responde de forma diferente según su tipo real
        for (Producto p : inventario) {
            p.mostrarDetalles();
        }

        // Prueba de método común heredado
        System.out.println("\n--- Realizando transacciones ---");
        inventario.get(0).vender(2); // Vende laptops
        inventario.get(1).vender(10); // Vende manzanas
    }
}