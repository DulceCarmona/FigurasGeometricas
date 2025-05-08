package figuras;

public class Romboide implements FiguraGeometrica {
    private double base, altura, lado;

    public Romboide(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + lado);
    }
}
