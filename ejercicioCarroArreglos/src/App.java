import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Concesionaria app = new Concesionaria("niza");
        app.capDatos();
        app.capDatos();
        app.capDatos();
        app.capDatos();
        app.mostrar(); //println
        app.getMostrarCarrosBaratos();

    }
}
