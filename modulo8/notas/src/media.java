public  class media {

     /**
     * @param arg
     */
    public static void main (String arg [ ]){
        double medianotas;
        double nota1 = 7;
        double nota2 = 2;
        double nota3 = 4;
        double nota4 = 5;

        medianotas = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Media das nota do aluno: " + medianotas);
        System.out.println(" ");
        System.out.print("Situacao do aluno: ");
        if (medianotas >= 5){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        };
        
    }
}
