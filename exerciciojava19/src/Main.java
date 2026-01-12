import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int contadorIn = 0;
        int contadorOut = 0;
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            int X = sc.nextInt();
            if (X >= 10 && X <= 20){
                contadorIn += 1;
            }
            else {
                contadorOut += 1;
            }
        }

        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");

        sc.close();

    }

}
