/**
 * Clase que cuenta la vocal 'e' en el texto.
 */
public class CuentaVocalesE implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesE.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesE(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    //Comenzamos el hilo
    public void run() {
        //Abrímos un bucle, convertimos la cadena de texto en una matriz de caracteres,
        //y cada caracter de la cadena en un elemento de la matriz,igualandolo a "c"
        for (char c : texto.palabra.toCharArray()) {
            //Comparamos "c" con la letra que queremos encontrar
            if (c == 'e') {
                //Incrementamos el contador en caso de que esta esté
                texto.incrementarE();
            } else if (c == 'E') {
                texto.incrementarE();
            }
            //Fin del if
        }
        //Fin del bucle
    }
    //Fin del hilo
}