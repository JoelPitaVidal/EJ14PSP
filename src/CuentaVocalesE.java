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
    public void run() {
        for (char c : texto.palabra.toCharArray()) {
            if (c == 'e') {
                texto.incrementarE();
            }
        }
    }
}