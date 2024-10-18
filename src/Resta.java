public class Resta extends Operacion {

    public Resta(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() {
        return x - y;
    }

}
