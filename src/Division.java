public class Division extends Operacion {

    public Division(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() {
        return x / y;
    }

}
