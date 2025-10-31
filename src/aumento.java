import java.util.Locale;
import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, aumento, novoSalario;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			porcentagem = 20;
		}
		else if (salario <= 3000) {
			porcentagem = 15;
		}
		else if (salario <= 8000) {
			porcentagem = 10;
		}
		else {
			porcentagem = 5;
		}
		
		aumento = porcentagem / 100.00 * salario;
		novoSalario = salario + aumento;
		
		System.out.printf("Novo salario = R$%.2f\n", novoSalario);
		System.out.printf("Aumento = R$%.2f\n", aumento);
		System.out.printf("Porcentagem = %d %% \n", porcentagem);
		
		sc.close();
		
	}

}
