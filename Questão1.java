
import java.util.Scanner;

public class Questão1{

 public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do volume:");
        int volume = ler.nextInt();
       
        if (volume <= 0) {
            System.out.println(" O valor "+ volume + " é dado como Volume minímo.");
        } 
        else if (volume <= 25) {
            System.out.println( "O valor "+ volume + " é dado como Baixo Volume." );
        }
        else if (volume <= 75) {
            System.out.println("O valor "+ volume + " é dado como Médio Volume.");
        }
         else if (volume <=100) {
            System.out.println("O valor "+ volume + " é dado como Alto Volume.");
        } 
        else {
            System.out.println("O valor "+ volume + " é dado como Volume Máximo.");
        }
    }
}
