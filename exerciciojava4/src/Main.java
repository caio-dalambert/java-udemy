import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double ganhoPorHora = sc.nextDouble();
        double salarioFuncionario =  ganhoPorHora * horasTrabalhadas;

        System.out.printf("%nNUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salarioFuncionario);

        sc.close();

    }
}
