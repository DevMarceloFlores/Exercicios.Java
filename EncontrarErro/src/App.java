import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escolha a area de um triangulo");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a Base: ");
        int base = scanner.nextInt();
        System.out.print("Escolha a Altura: ");
        int altura = scanner.nextInt();

        double area = (base * altura) / 2.0;// transforma a era em decimal
        System.out.println("Sua area é: " + area);
    }
}
