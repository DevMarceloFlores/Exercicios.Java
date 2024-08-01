import java.util.Scanner;

public class EstudanteApp {
    public static void main(String[] args) {
       String nome = "Marcelo";
       String sobrenome = "Flores";
       int idade = 26;
       char inicioNome = 'M';
       char inicioSobrenome = 'F';
       double media = 10.0;
       boolean aprovado = true;

       System.out.println(
        idade + ", "
        + inicioNome + ", "
        + inicioSobrenome + ", "
        + media + ", "
        + aprovado + ", "
        + nome + ", "
        + sobrenome
    );
       System.out.println(inicioNome);
       System.out.println(inicioSobrenome);
       System.out.println(media);
       System.out.println(aprovado);
       System.out.println(nome + " " + sobrenome);
       System.out.println(inicioNome + " " + inicioSobrenome);

       System.out.println(nome.charAt(0)); // imprimir as string por sua posição
       System.out.println(nome.charAt(1));

       System.out.println(nome.length()); //vê a quantidade de string

       System.out.println(nome.charAt(nome.length() -1)); //vai em determinada srting

       System.out.println(nome.equals(Marcelo)); // nome é = a sobrenome?

       Scanner scanner = new scanner(System.in); // Falando com o usuario.
       media = scanner

       System.out.println(media);
    }
}
