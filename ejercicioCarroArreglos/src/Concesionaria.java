import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Concesionaria {
    private String nombre;
    ArrayList<carro> misCarros;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        misCarros = new ArrayList<>();
    } 
    
    public void capDatos(){
        
        String modelo = JOptionPane.showInputDialog(null, "digite el modelo ");
        String precio = JOptionPane.showInputDialog(null, "digite el precio ");
        double valor = Double.parseDouble(precio);
        carro c  = new carro(valor, modelo);
        agregarDatos(c);
    }

    public void agregarDatos(carro c) { 
        misCarros.add(c);
    }
    //valida si el arreaglo de carros está vacio; si está vacio devuelve true sino false
    public boolean validarListaDeCarros(){
        return misCarros.isEmpty();
    }

    //metodo para convertir los datos de los carros a un String para mostralos en en metodo getMostrarcarrosBaratos();
    //cuando le pongo ! antes de una variable la niego es decir si es tru pasa a se false y viseversa 
    public String mostrarCarrosBaratos(){
        int  i = 1;
        String CarrosBaratos = "";
        if(!validarListaDeCarros()){
            for(carro c : misCarros){
                if(c.getPrecio()<20){
                     CarrosBaratos += "carro barato numero: "+ (i)+" "+ c.getModelo() + " " + c.getPrecio() +"\n";   
                     i++;      
                }
                 
            }
            return CarrosBaratos;
        }else{
            return "no hay carros"; 
        }
        
    }
    public void getMostrarCarrosBaratos(){
        JOptionPane.showMessageDialog(null, "lista de carros baratos: "+"\n" + mostrarCarrosBaratos());
    }
    public void mostrar(){
        for(carro c : misCarros){
            System.out.println(c.getModelo() + " "+ c.getPrecio());  
        }
    }
}
