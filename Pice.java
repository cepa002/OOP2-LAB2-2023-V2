package kafic;

public abstract class Pice {

    private final String naziv;
    private final float zapremina;
    private final int cenaPoLitru;
    public Pice(String naziv, float zapremina, int cena){
        this.naziv = naziv;
        this.zapremina = zapremina;
        this.cenaPoLitru = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public float getZapremina() {
        return zapremina;
    }

    public float getCena() {
        return cenaPoLitru * zapremina;
    }

    public abstract char getOznaka();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" (");
        sb.append(String.format("%.02f L): ", zapremina));
        sb.append(String.format("%.02f RSD", cenaPoLitru*zapremina));
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pice){
            return naziv.equals(((Pice)obj).naziv) && ((Pice) obj).zapremina==zapremina;
        }
        else return false;
    }
}
