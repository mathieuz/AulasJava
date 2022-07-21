package Fundamentos;

import java.util.Scanner;

public class MainEx2 {

	public static void main(String[] args) {
		
		CalculadoraDesconto calc = new CalculadoraDesconto();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em reais:");
		double num = scan.nextDouble();
		calc.setNum(num);
		
		System.out.println("Digite o valor do desconto:");
		double desc = scan.nextDouble();
		calc.setNumDesc(desc);
		
		scan.close(); //Resolve "calc is never closed".
		
		System.out.println("Total R$" + String.format("%.2f", calc.calcularDesconto())); //String format retorna um valor double com x casas decimais definidas
		
	}
}