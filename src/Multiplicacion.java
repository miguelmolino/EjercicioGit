public class Multiplicacion extends Operacion {

    public Multiplicacion(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() {
        return x * y;
    }

}
