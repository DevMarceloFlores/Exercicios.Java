public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
            username:"marcelo",
            password:"flores",
            email:"dev.marceloflores@gmail.com",
        );
        System.out.println(usuario.username);
        System.out.println(usuario.password);
        System.out.println(usuario.email);
    }
}
