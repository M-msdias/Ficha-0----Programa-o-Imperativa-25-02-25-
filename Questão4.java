import java.util.Scanner;

public class Questão4 {
      public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println(" Digite o dia:");
        int dia = ler.nextInt();
        System.out.println(" Digite o mês:");
        int mes = ler.nextInt();
        System.out.println(" Digite o ano:");
        int ano = ler.nextInt();
        
        int[] diasMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            diasMes[2] = 29;
        }
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasMes[mes]) {
            System.out.println("Data Invalida");
            return;
        }
        String[] signos = {"Capricornio", "Aquario", "Peixes", "Aries", "Touro", "Gemeos", "Cancer", "Leao", "Virgem", "Libra", "Escorpiao", "Sagitario"};
        int[] diasLimite = {19, 18, 20, 19, 20, 21, 22, 22, 22, 22, 21, 21};
        
        String signo;
        if (dia > diasLimite[mes - 1]) {
            signo = signos[mes];
        } 
        else {
            signo = signos[mes - 1];
        }
        System.out.println(" Seu signo é " + signo + ".");
    }
}
