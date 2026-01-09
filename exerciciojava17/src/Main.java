import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int tipoCombustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombustivel != 4) {
            switch (tipoCombustivel) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                default:
                    break;
            }
            tipoCombustivel = sc.nextInt();            
        }

        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
        sc.close();

    }


}
