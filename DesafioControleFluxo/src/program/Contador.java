package program;

import java.util.Locale;
import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		int parametroUm, parametroDois;
		
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Insira o primeiro numero: ");
		parametroUm = terminal.nextInt();	
		System.out.println("Insira o segundo numero: ");
		parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}	
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		int contagem = parametroDois - parametroUm;
		if(contagem <= 0){
			throw new ParametrosInvalidosException();
		}
		
		for (int i = 1; i <= contagem; i++) {
			System.out.printf("\nImprimindo o número %d", i);
		}
	}

}
