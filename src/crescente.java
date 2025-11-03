import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois numeros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 < n2) {
			System.out.println("CRESCENTE!");
		}
		else if (n1 > n2) {
			System.out.println("DECRESCENTE!");
		}
		
		while (n1 != n2) {
			System.out.println("Digite outros dois numeros:");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if (n1 < n2) {
				System.out.println("CRESCENTE!");
			}
			else if (n1 > n2) {
				System.out.println("DECRESCENTE!");
			}
		}
		
		
		
		sc.close();

	}

}
