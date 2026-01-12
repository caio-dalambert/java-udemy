import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            double primeiroValor = sc.nextDouble();
            double segundoValor = sc.nextDouble();
            double terceiroValor = sc.nextDouble();

            double media = (primeiroValor * 2.0 + segundoValor * 3.0 + terceiroValor * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }


        sc.close();

    }


}
