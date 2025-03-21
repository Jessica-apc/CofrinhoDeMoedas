package empresa;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor, "Dolar");
    }

    @Override
    public double converterParaReal() {
        
        return getValor() * 5.68; // Valor relacionado ao dolar em 20/03/2025
    }
}
