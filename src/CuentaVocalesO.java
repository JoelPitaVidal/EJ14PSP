/**
 * Clase que cuenta la vocal 'o' en el texto.
 */
public class CuentaVocalesO implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesO.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesO(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    //Comenzamos el hilo
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            //Abrímos un bucle, convertimos la cadena de texto en una matriz de caracteres,
            //y cada caracter de la cadena en un elemento de la matriz,igualandolo a "c"
            //Comparamos "c" con la letra que queremos encontrar
            if (c == 'o') {
                //Incrementamos el contador en caso de que esta esté
                texto.incrementarO();
            } else if (c == 'O') {
                texto.incrementarO();
            }
            //Fin del if
        }
        //Fin del bucle
    }
    //Fin del hilo
}