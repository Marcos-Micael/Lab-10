	package Conta;

	public class TesteTributavel {
	    public static void main(String[] args) {
	        
	        Cliente cliente = new Cliente("12345678900", "João Silva");

	        
	        ContaCorrente contaCorrente = new ContaCorrente(12345, 67890, cliente, 1234, 1000.0);
	        SeguroDeVida seguroDeVida = new SeguroDeVida();

	        
	        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

	       
	        gerenciador.adiciona(contaCorrente);
	        gerenciador.adiciona(seguroDeVida);

	    
	        System.out.println("Total de tributos: " + gerenciador.getTotal());
	    }
	}
