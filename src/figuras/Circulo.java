package figuras;

import visitor.VisitorIF;

public class Circulo implements ElementoConcretoIF {

    private double raio;

    public Circulo(double raio) { this.raio = raio; }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitarVisita(VisitorIF v) {
        double output = v.visitaCirculo(this);
        if(output != -1) {
            System.out.println(String.format("%.2f", output));
        } else
            System.out.println(this.toString());
    }

    public String toString() { return String.format("Círculo de raio %.2f", getRaio()); }
}
