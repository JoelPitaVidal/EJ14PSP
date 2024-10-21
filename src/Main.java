import javax.swing.JOptionPane;
/**
 * Clase principal que ejecuta los hilos para contar vocales.
 */
public class Main {
    public static void main(String[] args) {
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
