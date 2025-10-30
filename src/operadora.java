import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if (minutos <= 100) {
			valor =  50;
		}
		else {
			valor = 50 + (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", valor);
		
		sc.close();

	}

}
