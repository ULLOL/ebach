import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class nomesord {
        public static void main (String[] args) {
            List<String> nome = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva varios nomes separados por , :");
        String input = scanner.nextLine();

            String[] values = input.split(", ");

            for (String value : values) {
                nome.add(value);
        }
    Collections.sort(nome);
    System.out.println (nome);
        scanner.close();
}
    }

