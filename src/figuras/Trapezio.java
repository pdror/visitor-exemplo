package figuras;

import visitor.VisitorIF;

public class Trapezio implements ElementoConcretoIF {
    private double baseMaior;
    private double baseMenor;
    private double lados;
    private double altura;

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Trapezio(double baseMaior, double baseMenor, double lados, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.lados = lados;
        this.altura = altura;
    }

    @Override
    public void aceitarVisita(VisitorIF v) {
        double output = v.visitaTrapezio(this);
        if(output != -1) {
            System.out.println(String.format("%.2f", output));
        } else
            System.out.println(this.toString());
    }

    @Override
    public String toString() { return String.format("Trapézio com base maior de %.2f, base menor de %.2f, lados de  %.2f e altura %.2f", getBaseMaior(), getBaseMenor(), getLados(), getAltura()); }

}
