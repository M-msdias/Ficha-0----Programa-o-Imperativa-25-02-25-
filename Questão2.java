import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println( "Digite primeiro número:");
        int numero1 = ler.nextInt();
        System.out.println( "Digite segundo número:");
        int numero2 = ler.nextInt();
        System.out.println( "Digite terceiro número:");
        int numero3 = ler.nextInt();
        
        int maior, meio, menor;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
            if (numero2 >= numero3) {
                meio = numero2;
                menor = numero3;
            } 
            else {
                meio = numero3;
                menor = numero2;
            }
        } 
        else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
            if (numero1 >= numero3) {
                meio = numero1;
                menor = numero3;
            } 
            else {
                meio = numero3;
                menor = numero1;
            }
        } 
        else {
            maior = numero3;
            if (numero1 >= numero2) {
                meio = numero1;
                menor = numero2;
            } 
            else {
                meio = numero2;
                menor = numero1;
            }
        }

        System.out.println(maior + " >= " + meio + " >= " + menor);
    }
}
