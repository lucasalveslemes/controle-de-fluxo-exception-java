package contador;

import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int primeiroValor = sc.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int segundoValor = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(primeiroValor, segundoValor);
		}catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}
		
		sc.close();
		
	}
	
	static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
		
		// validar se o primeiroParametro é maior que o segundo e lancar a exceção
		if (primeiroValor >= segundoValor) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
		int contagem = segundoValor - primeiroValor;
		// realizar o for para imprimir os números com base na variável contagem
		for(int i = 0; i <= contagem; i++ ) {
			System.out.println("Imprimindo número: " + i);
		}
	}

}
