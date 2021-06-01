package classes;


import interfaces.Tributavel;

public class CalculadoraDeImpostos {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
