package visitor;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class VisitorCalcularArea implements VisitorIF {
    @Override
    public double visitaCirculo(Circulo c) {
        return Math.PI * (c.getRaio() * c.getRaio());
    }

    @Override
    public double visitaRetangulo(Retangulo r) {
        return r.getAltura() * r.getBase();
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return (t.getAltura() * t.getBase())/2;
    }

    @Override
    public double visitaTrapezio(Trapezio z) {
        return ((z.getBaseMaior() + z.getBaseMenor())/2) * z.getAltura();
    }
}
