import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite seu nome");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura");
        double altura = scanner.nextDouble();

        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        System.out.println("ola, me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos ");
        System.out.println("minha altura e " + altura + "cm ");

    }
}
