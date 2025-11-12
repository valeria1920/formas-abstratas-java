public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
