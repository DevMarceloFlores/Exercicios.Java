import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args){
        boolean repeat = true;
       
        while (repeat == true) {
            System.out.println("Tocar a música.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Devo repetir a musica true ou false");
            repeat = scanner.nextBoolean();
        }

    }
}
