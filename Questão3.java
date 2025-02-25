import java.util.Scanner;

public class Questão3 {
      public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(" Digite o valor de 'a':");
        double a = ler.nextDouble();
        System.out.println(" Digite o valor de 'b':");
        double b = ler.nextDouble();
        System.out.println(" Digite o valor de 'c':");
        double c = ler.nextDouble();
        
        if (a == 0) {
            System.out.println("Coeficiente não pode ser zero.");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são " + x1 + " e " + x2 + ".");
        } 
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A única raiz é " + x + ".");
        } 
        else {
            System.out.println("Não há raizes.");
        }
    }
}

