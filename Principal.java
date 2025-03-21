package empresa;
import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
		


 Cofrinho cofrinho = new Cofrinho(); // Este é um objeto criado para armazenar as moedas 
		        
 Scanner scanner = new Scanner(System.in); // Este é o scanner que lê o que o usuario digita
		 int opcao;

		  do {
		   System.out.println("\nCOFRINHO:");
		   System.out.println("1 - Adicionar moeda");
		   System.out.println("2 - Remover moeda");
		   System.out.println("3 - Listar moedas");
		   System.out.println("4 - Calcular total em Real");
		   System.out.println("0 - Sair");
		   System.out.print("Escolha uma opcao: ");
		            
		   opcao = scanner.nextInt(); // Aqui este scanner vai ler a opção escolhida pelo usuario

		   switch (opcao) {
		   case 1:
		      System.out.println("1. Dolar");
		      System.out.println("2. Euro");
		      System.out.println("3. Real");
		      System.out.print("Escolha uma moeda: ");
		                    
		      int escolhaMoeda = scanner.nextInt(); // Este Scanner lê a moeda escolhida pelo usuario

		      System.out.print("Digite o valor da moeda: ");
		                    
		      double valor = scanner.nextDouble(); // Este Scanner lê o valor da moeda escolhida pelo usuario

		      Moeda moeda;

		      switch (escolhaMoeda) {
		                        
		      case 1:
		                            
		      moeda = new Dolar(valor); // Aqui criamos uma nova instancia da classe dolar c/ o valor informado pelo usuario
		      break;
		      case 2:
		                           
		      moeda = new Euro(valor); // Aqui criamos uma nova instancia da classe Euro  c/ o valor informado pelo usuario
		      break; 
		      case 3:
		                            
		      moeda = new Real(valor); // Aqui criamos uma nova instancia da classe Real  c/ o valor informado pelo usuario
		      break;
		             default:
		      System.out.println("Opcao invalida");
		      continue; // Volta ao começo do looping
		           }

		                   
		      cofrinho.adicionarMoeda(moeda);
		      System.out.println("Moeda adicionada com sucesso!");
		             break;
		      case 2:
		      System.out.print("Digite o valor da moeda a ser removida: ");
		                    
		      double valorRemover = scanner.nextDouble();

		      Moeda moedaRemover = null;

		       // Busca pela moeda especificada no cofrinho
		      for (Moeda m : cofrinho.getMoedas()) {
		         if (m.getValor() == valorRemover) {
		         moedaRemover = m;
		          break;
		                   }
		                    }

		      if (moedaRemover != null) {
		                        
		      cofrinho.removerMoeda(moedaRemover);
		      System.out.println("Moeda removida com sucesso!");
		      
		        } else {
		          System.out.println("Moeda nao encontrada no cofrinho.");
		                    }
		          break;
		       case 3:
		                   
		       cofrinho.listarMoedas();
		          break;
		       case 4:
		                    
		       double totalReal = cofrinho.calcularTotalEmReal();
		       System.out.println("Total em Real: R$ " + totalReal);
		           break;
		       case 0:
		       System.out.println("Saindo...");
		          break;
		             default:
		       System.out.println("Opcao invalida");
		            break;
		            }
		        } while (opcao != 0);

		        
		        scanner.close();
		    }

		

	}