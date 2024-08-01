import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double numeroDeHoras = scanner.nextDouble();
        System.out.println("Digite quanto ganha por hora: R$");
        double valorHora = scanner.nextDouble();
        double salario = calcularSalario(valorHora, numeroDeHoras);
        System.out.println("Você receberá: R$" + salario);
    }

    public static double calcularSalario(double valorHora, double numeroDeHoras){
        double salario = valorHora * numeroDeHoras;
        return salario;
    }
}
