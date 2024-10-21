import javax.swing.JOptionPane;
/**
 * Clase principal que ejecuta los hilos para contar vocales.
 */
public class Main {
    public static void main(String[] args) {
    //Iniciamos el JOptionPane para insertar la palabra e instanciamos el objeto Texto, que recíbe el string palabra
        String palabra = JOptionPane.showInputDialog("Escriba una cadena de texto");
        TextoImplementado texto = new TextoImplementado(palabra);

        Thread hiloA = new Thread(new CuentaVocalesA(texto));
        Thread hiloE = new Thread(new CuentaVocalesE(texto));
        Thread hiloI = new Thread(new CuentaVocalesI(texto));
        Thread hiloO = new Thread(new CuentaVocalesO(texto));
        Thread hiloU = new Thread(new CuentaVocalesU(texto));

        hiloA.start();
        hiloE.start();
        hiloI.start();
        hiloO.start();
        hiloU.start();

        try {
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        texto.mostrarTotal();
    }
}
