public class MostraDados {
    public static void main (String arg[]) {
        Chocolate chocolate = new Chocolate();
        chocolate.setMarca("garoto");
       System.out.println(chocolate.getMarca());
       System.out.println(chocolate.getPesoTotal());
       System.out.print(chocolate.getPesoTotal2());
       System.out.print(" ");
       System.out.println(chocolate.unidadeDeMedidaDoPeso());
    }
}
