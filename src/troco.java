import java.util.Locale;
import java.util.Scanner;

public class troco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double troco, preco, dinheiroRecebido;
		int qtd;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - (qtd * preco);
		System.out.printf("TROCO = %.2f", troco);
		
		sc.close();
		
	}

}
