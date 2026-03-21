public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ALIMENTO] " + nombre + " | Precio: $" + precio + 
                           " | Stock: " + cantidad + " | Caduca: " + fechaCaducidad);
    }
}