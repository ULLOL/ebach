import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
//import java.text;

public class ex12 {
    public static void main (String[] args) {
           List<String> masculino = new ArrayList<>();
            List<String> feminino = new ArrayList<>();
            List<String> outro = new ArrayList<>();
            //StringBuffer arrumar = new StringBuffer();
            

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
                   value=value.replace("-M","");
            masculino.add(value);
            }else if(value.contains("-F")){
                value=value.replace("-F","");
            feminino.add(value);
            }else{
                value=value.replace("-O","");
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

