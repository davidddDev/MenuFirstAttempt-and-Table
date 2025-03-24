import java.awt.*;

public class Kvetina {
    private String nazev;
    private int pocet;
    private Color barva;

    public Kvetina(String nazev, int pocet, Color barva) {
        this.nazev = nazev;
        this.pocet = pocet;
        this.barva = barva;
    }

    //region: Gettery a settery

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocet() {
        return pocet;
    }

    public void setPocet(int pocet) {
        this.pocet = pocet;
    }

    public Color getBarva() {
        return barva;
    }

    public void setBarva(Color barva) {
        this.barva = barva;
    }

    //endregion
}
