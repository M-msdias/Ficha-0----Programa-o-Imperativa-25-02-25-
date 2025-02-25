import java.util.Scanner;

public class Questão6 {
      public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do lado:");
        int n = ler.nextInt();
       
        if (n < 1 || n > 20) {
            return;
        }
        for (int l = 0; l < n; l++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


