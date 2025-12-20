import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int cod1 = sc.nextInt();
            int qte1 = sc.nextInt();
            double valor1 = sc.nextDouble();

            int cod2 = sc.nextInt();
            int qte2 = sc.nextInt();
            double valor2 = sc.nextDouble();

            double total = valor1 * qte1 + valor2 * qte2;

            System.out.printf("%nVALOR A PAGAR: R$ %.2f", total);

            sc.close();
            
        }
}
