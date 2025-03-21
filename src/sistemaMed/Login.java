package sistemaMed;

import java.util.Scanner;

public class Login {
    private final Usuario[] usuarios;

    public Login(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public boolean autenticar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}