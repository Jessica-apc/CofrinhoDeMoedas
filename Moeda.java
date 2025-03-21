package empresa;

public class Moeda {
    protected double valor; 
    protected String tipoMoeda; 
    
    public Moeda(double valor, String tipoMoeda) {
        this.valor = valor;
        this.tipoMoeda = tipoMoeda;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoMoedas() {
        return tipoMoeda;
    }

    public double converterParaReal() {
        return valor;
    }

	
}