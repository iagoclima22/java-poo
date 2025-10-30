import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double preco = 0;
		double total;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			preco = 5.00;
		}
		else if (codigo == 2) {
			preco = 3.50;
		}
		else if (codigo == 3) {
			preco = 4.80;
		}
		else if (codigo == 4) {
			preco = 8.90;
		} else if (codigo == 5) {
			preco = 7.32;
		}
		
		total = preco * quantidade;
		
		System.out.printf("Valor a pagar: R$%.2f", total);
		
		sc.close();
		
		
	}

}
