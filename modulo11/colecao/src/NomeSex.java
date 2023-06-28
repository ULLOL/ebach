import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class NomeSex {
    public static void main (String[] args) {
            List<String> masculino = new ArrayList<>();
            List<String> feminino = new ArrayList<>();
            List<String> outro = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva os nomes separados por , e o seu sexo seprados por - ");
        System.out.println("Masculino - M  ");
        System.out.println("Femino - F  ");
        System.out.println("Outro - O ");
        System.out.println("Exemplo: Pedro-M, Barbara-F, Alex-O");
        String input = scanner.nextLine();

            String[] values = input.split(", ");

            for (String value : values) {

                if (value.contains("-M")){
            masculino.add(value);
            }else if(value.contains("-F")){
            feminino.add(value);
            }else{
            outro.add(value);
            }
                
}
                Collections.sort(masculino);
                Collections.sort(feminino);
                Collections.sort(outro);
                System.out.println ("Lista masculina:" + masculino);
                System.out.println ("Lista feminina:" + feminino);
                System.out.println ("Lista outros:" + outro);
                scanner.close();
}
}