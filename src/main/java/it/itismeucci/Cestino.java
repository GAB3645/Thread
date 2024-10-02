package it.itismeucci;

public class Cestino {

    int valore;

    public Cestino(int i) {

        valore = i;
    }

    public void aggiungiMoneta() {

        valore = valore + 1;
    }

    public int getValore() {
        return valore;
    }

}
