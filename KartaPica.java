package kafic;

import java.util.ArrayList;
import java.util.List;

public class KartaPica {
    private final List<Pice> kartaPica = new ArrayList<>();

    public void dodajPice(Pice pice) throws GPostoji {
        if(kartaPica.contains(pice)) throw new GPostoji();
        else kartaPica.add(pice);
    }

    public int getBrojPica() {
        return kartaPica.size();
    }

    @Override
    public String toString() {
        StringBuilder gaziraniSokovi = new StringBuilder();
        StringBuilder negaziraniSokovi = new StringBuilder();
        gaziraniSokovi.append("GAZIRANI SOKOVI\n");
        negaziraniSokovi.append("NEGAZIRANI SOKOVI\n");
        int i = 0;
        for(Pice pice : kartaPica){
            switch (pice.getOznaka()){
                case 'G': {
                    gaziraniSokovi.append(pice).append('\n');
                    i++;
                    break;
                }
                case 'N': {
                    negaziraniSokovi.append(pice);
                    i++;
                    if (i < kartaPica.size()) negaziraniSokovi.append('\n');
                    break;
                }
            }
        }

        return (gaziraniSokovi.append(negaziraniSokovi)).toString();
    }
}
