
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Menu.printWelcome();
        Login.authenticate();
        Menu.main();
    }
}
