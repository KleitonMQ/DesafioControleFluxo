import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {
		Scanner terminal = new Scanner(System.in);
		boolean numero = true;

		int parametroUm = 0;
		while (numero) {
			try {
				System.out.println("Digite o primeiro parâmetro");
				parametroUm = terminal.nextInt();
				numero = false;
			} catch (InputMismatchException e) {
				System.out.println("Será aceito apenas número inteiros nesse campo.");
				terminal.nextLine();
			}
		}
		numero = true;
		int parametroDois = 0;
		while (numero) {
			try {
				System.out.println("Digite o segundo parâmetro");
				parametroDois = terminal.nextInt();
				numero = false;
			} catch (InputMismatchException e) {
				System.out.println("Será aceito apenas número inteiros nesse campo.");
				terminal.nextLine();
			}
		}

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O valor do segundo parameto não pode ser menor que o valor do primeiro parametro.");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}