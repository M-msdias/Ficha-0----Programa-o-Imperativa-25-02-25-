import java.util.Scanner;

public class Questão5{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento do bebê:");
        int anoInicial = ler.nextInt();
        System.out.println("Digite o intervalo -em anos- da vacina: ");
        int intervalo = ler.nextInt();

        if (intervalo <= 0) {
            System.out.println("Digite um período maior que zero!");
            return;
        }

        for (int i = 1; i <= 3; i++) {
            anoInicial += intervalo;
            System.out.print(anoInicial + (i < 3 ? " " : "\n"));
        }
    }
}
