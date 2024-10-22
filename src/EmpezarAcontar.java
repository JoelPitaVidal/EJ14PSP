import javax.swing.JOptionPane;

public class EmpezarAcontar {

    public void contar(){
        //Iniciamos el JOptionPane para insertar la palabra e instanciamos el objeto Texto, que recíbe el string palabra
        String palabra = JOptionPane.showInputDialog("Escriba una cadena de texto");
        TextoImplementado texto = new TextoImplementado(palabra);
        //Creamos los diferentes hilos de las diferenets vocales
        Thread hiloA = new Thread(new CuentaVocalesA(texto));
        Thread hiloE = new Thread(new CuentaVocalesE(texto));
        Thread hiloI = new Thread(new CuentaVocalesI(texto));
        Thread hiloO = new Thread(new CuentaVocalesO(texto));
        Thread hiloU = new Thread(new CuentaVocalesU(texto));
        //Iniciamos los hilos
        hiloA.start();
        hiloE.start();
        hiloI.start();
        hiloO.start();
        hiloU.start();
        //Iniciamos un try para añadirlos a un join
        try {
        //Añadimos a un join los diferentes hilos para que no se interrumpan mutuamente
            hiloA.join();
            hiloE.join();
            hiloI.join();
            hiloO.join();
            hiloU.join();
        //Capturamos la excepción de interrupción de los hilos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        texto.mostrarTotal();
    }

}
