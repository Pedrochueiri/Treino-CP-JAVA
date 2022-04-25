package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {
	public static void main(String[] args) {
		Pessoa pessoa1;
		Scanner scan;
		/* String nome = "";
		int ano = 0;*/
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome");
			/*nome = scan.newtLine();*/
			System.out.println("Digite ano nascimento");
			/*ano = scan.nextInt();*/
			
			pessoa1 = new Pessoa(scan.nextLine(), scan.nextInt());
			
			System.out.println("Nome: "+ pessoa1.getNome()+
					"\nIdade: "+ pessoa1.calculaIdade(2022));
		} catch (Exception e) {
			System.out.println("algo deu errado!!");
		}
	}
}
