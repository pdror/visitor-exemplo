package visitor;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class VisitorMaximinizar implements VisitorIF {
    @Override
    public double visitaCirculo(Circulo c) {
        c.setRaio(c.getRaio() * 2);
        return -1;
    }

    @Override
    public double visitaRetangulo(Retangulo r) {
        r.setAltura(r.getAltura() * 2);
        r.setBase(r.getBase() * 2);
        return -1;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        t.setAltura(t.getAltura() * 2);
        t.setBase(t.getBase() * 2);
        return -1;
    }

    @Override
    public double visitaTrapezio(Trapezio z) {
        z.setBaseMaior(z.getBaseMaior() * 2);
        z.setBaseMenor(z.getBaseMenor() * 2);
        z.setLados(z.getLados() * 2);
        z.setAltura(z.getAltura() * 2);
        return -1;
    }
}
