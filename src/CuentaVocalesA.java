/**
 * Clase que cuenta la vocal 'a' en el texto.
 */
public class CuentaVocalesA implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesA.
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesA(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    //Comenzamos el hilo
    public void run() {
        //Abrímos un bucle, convertimos la cadena de texto en una matriz de caracteres,
        //y cada caracter de la cadena en un elemento de la matriz,igualandolo a "c"
        for (char c : texto.palabra.toLowerCase().toCharArray()) {
            //Comparamos "c" con la letra que queremos encontrar
            if (c == 'a') {
                //Incrementamos el contador en caso de que esta esté
                texto.incrementarA();
            } else if (c == 'á') {
                texto.incrementarA();
            }
            //Fin del if
        }
        //Fin del bucle
    }
    //Fin del hilo
}