public class TextoImplementado implements Runnable{

    public String palabra = "aeiou";
    int contadorA=0;
    int contadorE=0;
    int contadorI=0;
    int contadorO=0;
    int contadorU=0;
    int contadorTotal = contadorA+contadorE+contadorI+contadorO+contadorU;

    public static void setPalabra() {

    }

    public TextoImplementado(String palabra, int contadorA, int contadorE, int contadorI, int contadorO, int contadorU, int contadorTotal) {
        this.palabra = palabra;
        this.contadorA = contadorA;
        this.contadorE = contadorE;
        this.contadorI = contadorI;
        this.contadorO = contadorO;
        this.contadorU = contadorU;
        this.contadorTotal = contadorTotal;
    }

    public int getContadorA() {
        return contadorA;
    }

    public void setContadorA(int contadorA) {
        this.contadorA = contadorA;
    }

    public int getContadorE() {
        return contadorE;
    }

    public void setContadorE(int contadorE) {
        this.contadorE = contadorE;
    }

    public int getContadorI() {
        return contadorI;
    }

    public void setContadorI(int contadorI) {
        this.contadorI = contadorI;
    }

    public int getContadorO() {
        return contadorO;
    }

    public void setContadorO(int contadorO) {
        this.contadorO = contadorO;
    }

    public int getContadorU() {
        return contadorU;
    }

    public void setContadorU(int contadorU) {
        this.contadorU = contadorU;
    }

    @Override
    public void run() {
        contadorTotal = contadorA+contadorE+contadorI+contadorO+contadorU;
        System.out.println("El total de vocales es de: "+contadorTotal);
    }
}
