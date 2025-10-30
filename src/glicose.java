import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		String classificacao;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if(glicose <= 100) {
			classificacao = "normal";
		}
		else if(glicose <= 140) {
			classificacao = "elevado";
		}
		else {
			classificacao = "diabetes";
		}
		
		System.out.println("Classificacao: " + classificacao);
		
		sc.close();
		
	}

}
