import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char temperatura;
		double f, c;
		
		System.out.print("Voce vai digitar a temperatura em qual escala(C/F)? ");
		temperatura = sc.next().charAt(0);
		
		if(temperatura == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			c = 5.0 / 9.0 * (f - 32.0);
			System.out.printf("Temperatura equivalente em Celsius: %.2f", c);
		}
		else {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = 9.0 * c / 5 + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", f);
		}
		
		sc.close();
	}

}
