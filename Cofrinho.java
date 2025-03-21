package empresa;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        
        moedas = new ArrayList<>(); // Inicia a lista de moedas com uma Arraylist vazia
    }

    public void adicionarMoeda(Moeda moeda) {
        
        moedas.add(moeda); // Metodo usado para adicionar moedas no cofrinho
    }

    public void removerMoeda(Moeda moeda) {
        
        moedas.remove(moeda); // Metodo usado para remover moedas do cofrinho
    }

    public List<Moeda> getMoedas() {
      
        return moedas; // Usado para retornar a lista de moedas
    }

    public void listarMoedas() {
        System.out.println("Moedas no cofrinho:"); // Aqui ocorre a iteração das moedas e é exibido o pais e valor delas
        for (Moeda moeda : moedas) {
        System.out.println(moeda.getTipoMoedas() + " - " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0.0;
        for (Moeda moeda : moedas) { 
        total += moeda.converterParaReal();  // Aqui ocorre a iteração das moedas e as converte para o seu valor em real
        }
        return total;
    }
}