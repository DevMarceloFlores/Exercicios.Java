import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número 1 a 10: ");
        int numero = scanner.nextInt();
        // > ,< ,<= ,>= ,== ,!=
        if(numero >= 1 && numero <=5 ) {
            System.out.println("Quem avisa amigo é");
        } else if (numero >= 6 && numero <= 10){
            System.out.println("Você é o que você come");

        } else {
            System.out.println("Informe um opção válida");
        }
    }
}
