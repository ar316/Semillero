public class carro {

    private double precio;
    private String modelo;
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public carro(double precio, String modelo) {
        this.precio = precio;
        this.modelo = modelo;
    }
    
    
}
