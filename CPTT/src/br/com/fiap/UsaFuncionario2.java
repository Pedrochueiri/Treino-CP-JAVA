package br.com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class UsaFuncionario2 {
	public static void main(String[] args) {
		Funcionario f1;
		Scanner scan;
		LocalDate data;
		float semana = 0.0f;
		
		try {
			scan = new Scanner(System.in);
			data = LocalDate.now();
			System.out.println("Digite seu nome e o valor por hora trabalhada:");
			f1 = new Funcionario(scan.nextLine(),scan.nextFloat());
			System.out.println("Digite a quantidade de horas por semana:");
			semana = scan.nextFloat();
			System.out.println("Nome: " + f1.getNome()+ "\nSalario: " + f1.salario(semana)+ "\nData: "
			+ data.getDayOfMonth()+ "/"+ data.getMonthValue()+"/"+data.getYear());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
