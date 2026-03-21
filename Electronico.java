public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int cantidad, int garantiaMeses) {
        super(nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[ELECTRÓNICO] " + nombre + " | Precio: $" + precio + 
                           " | Stock: " + cantidad + " | Garantía: " + garantiaMeses + " meses.");
    }
}