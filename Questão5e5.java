import java.util.Scanner;

public class Questão5e5 {
        public static void main(String[] args) {
            int pesoTotal = 0;
            int quantidadeLivro = 0;
            Scanner ler = new Scanner(System.in);
    
            while (true) {            
                System.out.print("Digite o peso do livro: ");
               
                int pesoNovoLivro = ler.nextInt();
                
                if ((pesoTotal + pesoNovoLivro) > 18) {
                    System.out.println( "A bolsa consegue carregar " + quantidadeLivro + " livros. O útimo livro posto ultrapassa o limite da bolsa.");
                    break;
                } 
                else {
                    pesoTotal += pesoNovoLivro;
                    quantidadeLivro++;
                }
            }
        }
    }
