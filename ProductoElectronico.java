// La palabra extends indica que hereda de Producto
public class ProductoElectronico extends Producto {
    private int mesesGarantia;

    public ProductoElectronico(String nombre, double precio, int cantidad, int mesesGarantia) {
        // super() llama al constructor de la clase padre (Producto)
        super(nombre, precio, cantidad);
        this.mesesGarantia = mesesGarantia;
    }

    // Sobrescribimos el método para agregar la garantía (Polimorfismo/Herencia)
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método original del padre
        System.out.println("Garantía: " + mesesGarantia + " meses");
        System.out.println("---------------------------");
    }
}