import java.util.Scanner;

public class par_impar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();
			if(x % 2 == 0 && x < 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if(x % 2 == 0 && x > 0) {
				System.out.println("PAR POSITIVO");
			}
			else if(x % 2 != 0 && x > 0) {
				System.out.println("IMPAR POSITIVO");
			}
			else if(x % 2 != 0 && x < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
			else {
				System.out.println("NULO");
			}
		}
		
		
		
		
		
		sc.close();
	}

}
