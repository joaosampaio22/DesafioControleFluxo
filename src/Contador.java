import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }
		
		int contagem = parametroDois - parametroUm;
		for(int i=1; i<=contagem; i++) {
            System.out.println(i);
        }
	}
}