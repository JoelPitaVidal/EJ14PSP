public class Main {
    public static void main(String[] args) {
        Thread hiloA = new Thread(new CuentaVocalesA());
        Thread hiloE = new Thread(new CuentaVocalesE());
        Thread hiloI = new Thread(new CuentaVocalesI());
        Thread hiloO = new Thread(new CuentaVocalesO());
        Thread hiloU = new Thread(new CuentaVocalesU());
        Thread hiloResultado = new Thread(new TextoImplementado("aeiou",0,0,0,0,0,0));

        try{

        hiloA.start();
        hiloE.start();
        hiloI.start();
        hiloO.start();
        hiloU.join();
        hiloResultado.start();

        }catch (InterruptedException e) {
            //Capturamos la excepción en caso de que el thread sea interrumpido
            Thread.currentThread().interrupt();
        }

    }
}