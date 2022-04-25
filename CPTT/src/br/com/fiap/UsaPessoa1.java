package br.com.fiap;

public class UsaPessoa1 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Pedro",2000);
		
		pessoa1.setNome("Lucas");
		pessoa1.setAnoNascimento(2003);
		
		System.out.println("Nome: " + pessoa1.getNome() + 
				"\nIdade: " + pessoa1.calculaIdade(2022));
		
		System.out.println("Nome: " + pessoa2.getNome() + 
				"\nIdade: " + pessoa2.calculaIdade(2022));
			
	}
}
