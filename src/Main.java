
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Basica");
        System.out.println("Seleccione una operacion");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");

        int opcion = scanner.nextInt();


        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
                case 1:
                    Suma suma = new Suma(num1, num2);
                    System.out.println("Resultado de la suma: " + suma.calcular());
                    break;
                case 2:
                    Resta resta = new Resta(num1, num2);
                    System.out.println("Resultado de la resta: " + resta.calcular());
                    break;
                case 3:
                    Multiplicacion multiplicacion = new Multiplicacion(num1, num2);
                    System.out.println("Resultado de la multiplicacion: " + multiplicacion.calcular());
                    break;
                case 4:
                    Division division = new Division(num1, num2);
                    System.out.println("Resultado de la division: " + division.calcular());
                    break;
                default:
                    System.out.println("Opcion no valida ");
                    break;

        }

        scanner.close();

    }
}