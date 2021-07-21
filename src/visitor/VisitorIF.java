package visitor;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public interface VisitorIF {
    public double visitaCirculo(Circulo c);
    public double visitaRetangulo(Retangulo r);
    public double visitaTriangulo(Triangulo t);
    public double visitaTrapezio(Trapezio z);
}
