import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da altura:");
        int n = ler.nextInt();
       
        if (n < 2 || n > 20) {
            return;
        }
        for (int a = 1; a <= n; a++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = n - 1; a > 0; a--) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
