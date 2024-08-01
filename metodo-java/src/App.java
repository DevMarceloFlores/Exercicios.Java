public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Antes do Alarme");
        alarmeDoLanche();
        System.out.println("Depois do Alarme");

        double media = calcularMedia(7.0, 8.0, 9.0);
        
        if (media >= 6.0){
        System.out.println("Você foi Aprovado!");
        } else {
        System.out.println("Você foi Reporvado!");
        }

        System.out.println(potenciacao(2,2));
        System.out.println(potenciacao(3,2));
    }

    public static void alarmeDoLanche(){
        System.out.println("Hora do Lanche");
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;    }

    public static double potenciacao(int base, int potecia){
        return Math.pow(base, potecia);
    }
}

