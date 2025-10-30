import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco, falta, total;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = preco * quantidade;
		
		if(dinheiro < total) {
			falta = total - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", falta);
		}
		else {
			troco = dinheiro - total;
			System.out.printf("TROCO = %.2f", troco);
		}
		
		sc.close();

	}

}
