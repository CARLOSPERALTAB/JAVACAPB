
import java.util.Scanner;



public class Login {
    public static void authenticate() throws Exception {
        Scanner inputReader = new Scanner(System.in);
        String username, password;
        System.out.print("Usuario (Nombre y apellido): ");
        username = inputReader.nextLine();
        System.out.print("Contraseña (8 dígitos): ");
        password = inputReader.nextLine();

        if(username.equals("Daniel Carmona") && password.equals("1234567890")) {

                System.out.println("\n------------------");
                System.out.println("Bienvenido Daniel Carmona");
                System.out.println("------------------\n");
                Menu.main();
            }


        if(username.equals("Luis Felipe") && password.equals("3456789012")) {

            System.out.println("\n------------------");
            System.out.println("Bienvenido Luis Felipe");
            System.out.println("------------------\n");
            Menu.main();
        }



        if(username.equals("Jesus Martinez") && password.equals("5678901234")) {

            System.out.println("\n------------------");
            System.out.println("Bienvenido Jesus Martinez");
            System.out.println("------------------\n");
            Menu.main();
        }





            else  {
                System.out.println("\nUsuario y/o contraseña inválida, intente nuevamente.\n");
                authenticate();
            }
        }

    }
