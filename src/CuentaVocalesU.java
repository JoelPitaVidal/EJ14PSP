/**
 * Clase que cuenta la vocal 'u' en el texto.
 */
public class CuentaVocalesU implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesU.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesU(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    //Comenzamos el hilo
    public void run() {
        //Abrímos un bucle, convertimos la cadena de texto en una matriz de caracteres,
        //y cada caracter de la cadena en un elemento de la matriz,igualandolo a "c"
        for (char c : texto.palabra.toCharArray()) {
            //Comparamos "c" con la letra que queremos encontrar
            if (c == 'u') {
                //Incrementamos el contador en caso de que esta esté
                texto.incrementarU();
            } else if (c == 'U') {
                texto.incrementarU();
            }
            //Fin del if
        }
        //Fin del bucle
    }
    //Fin del hilo
}