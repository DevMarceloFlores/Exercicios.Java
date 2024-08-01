import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args){
        System.out.println("Ola, seja bem vindo ao Quiz!");
        String pergunta = ("Qual é a Raiz Quadrada de 25? ");
        int alternativa = 0;
        int alternativa1 = 5;
        int alternativa2 = 25;
        int respostaCerta = 5;
        
        System.out.println(pergunta);
        System.out.println(alternativa);
        System.out.println(alternativa1);
        System.out.println(alternativa2);
        System.out.println("Digite a resposta correta!(0 ,5 ou 25):");

        Scanner scanner = new Scanner(System.in);
        int resposta = scanner.nextInt();

        if (resposta == respostaCerta){
            System.out.println("Parabéns você acertou!");
        } else {
            System.out.println("Que pena, a resposta era: " + respostaCerta);
        }
    }
}
