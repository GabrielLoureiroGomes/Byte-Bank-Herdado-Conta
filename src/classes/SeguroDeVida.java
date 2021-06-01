package classes;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }

}
