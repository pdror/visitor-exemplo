package principal;

import figuras.*;
import org.w3c.dom.ls.LSOutput;
import visitor.*;

public class Main {
    public static void main(String[] args) {
        VisitorIF visitorCA = new VisitorCalcularArea();
        VisitorIF visitorCP = new VisitorCalcularPerimetro();
        VisitorIF visitorMAX = new VisitorMaximinizar();
        VisitorIF visitorDRAW = new VisitorDesenhar();

        ElementoConcretoIF circulo = new Circulo(3);
        ElementoConcretoIF triangulo = new Triangulo(2,9);
        ElementoConcretoIF retangulo = new Retangulo(12,8);
        ElementoConcretoIF trapezio = new Trapezio(8,3,5,5);

        System.out.println("================ CIRCULO ================");
        System.out.println("DESENHO = ");
        circulo.aceitarVisita(visitorDRAW);
        System.out.println("ÁREA = ");
        circulo.aceitarVisita(visitorCA);
        System.out.println("PERIMETRO = ");
        circulo.aceitarVisita(visitorCP);
        System.out.println("MAXIMINIZAR = ");
        circulo.aceitarVisita(visitorMAX);

        System.out.println("\n================ RETANGULO ================");
        System.out.println("DESENHO = ");
        retangulo.aceitarVisita(visitorDRAW);
        System.out.println("ÁREA = ");
        retangulo.aceitarVisita(visitorCA);
        System.out.println("PERIMETRO = ");
        retangulo.aceitarVisita(visitorCP);
        System.out.println("MAXIMINIZAR = ");
        retangulo.aceitarVisita(visitorMAX);

        System.out.println("\n================ TRIANGULO ================");
        System.out.println("DESENHO = ");
        triangulo.aceitarVisita(visitorDRAW);
        System.out.println("ÁREA = ");
        triangulo.aceitarVisita(visitorCA);
        System.out.println("PERIMETRO = ");
        triangulo.aceitarVisita(visitorCP);
        System.out.println("MAXIMINIZAR = ");
        triangulo.aceitarVisita(visitorMAX);

        System.out.println("\n================ TRAPEZIO ================");
        System.out.println("DESENHO = ");
        trapezio.aceitarVisita(visitorDRAW);
        System.out.println("ÁREA = ");
        trapezio.aceitarVisita(visitorCA);
        System.out.println("PERIMETRO = ");
        trapezio.aceitarVisita(visitorCP);
        System.out.println("MAXIMINIZAR = ");
        trapezio.aceitarVisita(visitorMAX);
    }
}
