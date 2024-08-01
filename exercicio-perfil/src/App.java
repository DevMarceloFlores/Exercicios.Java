public class App {
    public static void main(String[] args) throws Exception {
        Estudante estudante1 = new Estudante(
            "Estudante 1", 2025, 10.0);
        Estudante estudante2 = new Estudante(
            "Estudante 2", 2024, 8.0);

        estudante1.setAnoPraFormatura(2026);
        System.out.println(estudante1.anoParaFormatura);
        System.out.println(estudante2.anoParaFormatura);

    }
}
