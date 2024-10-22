/**
 * Clase que cuenta la vocal 'i' en el texto.
 */
public class CuentaVocalesI implements Runnable {
    private final TextoImplementado texto;

    /**
     * Constructor de CuentaVocalesI.
     *
     * @param texto Instancia de TextoImplementado.
     */
    public CuentaVocalesI(TextoImplementado texto) {
        this.texto = texto;
    }

    @Override
    //Comenzamos el hilo
    public void run() {
        //Abrímos un bucle, convertimos la cadena de texto en una matriz de caracteres,
        //y cada caracter de la cadena en un elemento de la matriz,igualandolo a "c"
        for (char c : texto.palabra.toLowerCase().toCharArray()) {
            //Comparamos "c" con la letra que queremos encontrar
            if (c == 'i') {
                //Incrementamos el contador en caso de que esta esté
                texto.incrementarI();
            } else if (c == 'í') {
                texto.incrementarI();
            }
            //Fin del if
        }
        //Fin del bucle
    }
    //Fin del hilo
}