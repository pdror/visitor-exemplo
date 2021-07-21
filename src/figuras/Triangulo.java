package figuras;

import visitor.VisitorIF;

public class Triangulo implements ElementoConcretoIF {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void aceitarVisita(VisitorIF v) {
        double output = v.visitaTriangulo(this);
        if(output != -1) {
            System.out.println(String.format("%.2f", output));
        } else
            System.out.println(this.toString());
    }

    @Override
    public String toString() { return String.format("Triângulo de base %.2f e altura %.2f", getBase(), getAltura()); }

}
