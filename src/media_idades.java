import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades:");
		int idade = sc.nextInt();
		
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			int soma = 0;
			int contIdade = 0;
			while (idade >= 0) {
				soma += idade;
				contIdade += 1;
				idade = sc.nextInt();
			}

			double media = (double) soma / contIdade;

			System.out.printf("MEDIA = %.2f", media);

			sc.close();
		}
	}
		
}
