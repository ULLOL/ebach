public class Chocolate {
    
    private String marca;

    // peso em gramas
    private int peso;

    /**
     * @return
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String unidadeDeMedidaDoPeso() {
        return "gramas";
    } 

    /**
     * 
     * @deprecated
     * @see int getPesoTotal2
     */
    public int getPesoTotal() {
       return 10;
    }

    public int getPesoTotal2() {
        return 15;
     }

}

