package figuras;

import visitor.VisitorIF;

public interface ElementoConcretoIF {
    public void aceitarVisita(VisitorIF v);
}
