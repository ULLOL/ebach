public class Primeiraclasse {
    
    public static void main(String args []) {
         Cliente cliente = new Cliente();
         cliente.cadastrarEndereco("rua 1");
         cliente.setCodigo(1);
         cliente.setNome("Pedro");
         System.out.println(cliente.getCodigo());
         //cliente.imprimirenderco();
         String end = cliente.retornarNomeCliente();
         System.out.println(end);
         //System.out.println(cliente.getNome());
         System.out.println(cliente.getvalorTotal());
    }
}
