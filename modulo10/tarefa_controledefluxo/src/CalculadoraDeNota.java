import java.util.Scanner;

public class CalculadoraDeNota {

    public static void main (String arg[ ]){
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1 com os decimais:");
        Double nota1 = n1.nextDouble();
        

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 2 com os decimais:");
        Double nota2 = n2.nextDouble();
        

        Scanner n3 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 3 com os decimais:");
        Double nota3 = n3.nextDouble();
        

        Scanner n4 = new Scanner(System.in);
        System.out.println("Digite a nota da prova 4 com os decimais:");
        Double nota4 = n4.nextDouble();
        

        Double notaf = getMedia(nota1, nota2, nota3, nota4);
        System.out.println(notaf);

        System.out.print("Situação do aluno:");

        if (notaf >= 7){
            System.out.println("aluno aprovado");
        }else if( notaf >= 5){
            System.out.println("aluno de recuperação");
        }else{
            System.out.println("aluno reprovado");
        }

        n1.close();
        n2.close();
        n3.close();
        n4.close();
    }

    public static Double getMedia(double nota1, double nota2, double nota3, double nota4) {
       Double notafinal = ( nota1 + nota2 + nota3 + nota4 ) / 4;
    return notafinal;
    }
    
}
