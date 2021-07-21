package visitor;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class VisitorCalcularPerimetro implements VisitorIF {
    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * Math.PI * c.getRaio();
    }

    @Override
    public double visitaRetangulo(Retangulo r) {
        return 2 * (r.getBase() + r.getAltura());
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        double hipotenusa = Math.sqrt(Math.pow(t.getBase(), 2) + Math.pow(t.getAltura(), 2));
        return t.getBase() + t.getAltura() + hipotenusa;
    }

    @Override
    public double visitaTrapezio(Trapezio z) {
        return z.getBaseMaior() + z.getBaseMenor() + (2 * z.getLados());
    }
}
