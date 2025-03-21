package empresa;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor, "Euro");
    }

    @Override
    public double converterParaReal() {
        
        return getValor() * 6.16; // Valor relacionado ao Euro em 20/03/2025
 }
}