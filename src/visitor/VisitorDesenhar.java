package visitor;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class VisitorDesenhar implements VisitorIF {

    @Override
    public double visitaCirculo(Circulo c) {
        return -1;
    }

    @Override
    public double visitaRetangulo(Retangulo r) {
        return -1;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return -1;
    }

    @Override
    public double visitaTrapezio(Trapezio z) {
        return -1;
    }
}
