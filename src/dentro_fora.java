import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int x;
		int dentro = 0;
		int fora = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				dentro++;
			}
			else {
				fora++;
			}
			
		}
		
		System.out.printf("%d DENTRO\n", dentro);
		System.out.printf("%d FORA\n", fora);
		
		sc.close();
	}

}
