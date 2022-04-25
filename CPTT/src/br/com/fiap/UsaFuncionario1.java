package br.com.fiap;

import java.time.LocalDate;

public class UsaFuncionario1 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Pedro", 100f);
		LocalDate data = LocalDate.now();
		System.out.println("Nome: " + f1.getNome() + "\nSalário: " + f1.salario(23f));
		System.out.println("Data: " + data.getDayOfMonth()+ "/" + data.getMonth()+ "/" + data.getYear() );
	}
}
