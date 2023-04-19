package kafic;

public class Sok extends Pice {

    public enum Vrsta{GAZIRAN, NEGAZIRAN}

    private final Vrsta vrsta;

    public Sok(String naziv, float zapremina, int cena, Vrsta vrsta) {
        super(naziv, zapremina, cena);
        this.vrsta = vrsta;
    }

    @Override
    public char getOznaka() {
        if(vrsta==Vrsta.GAZIRAN) return 'G';
        else return 'N';
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

}
