public class Suma extends Operacion {

    public Suma(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcular() {
        return x + y;
    }

}
