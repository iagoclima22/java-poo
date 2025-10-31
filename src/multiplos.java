import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite dois numeros inteiros:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			if(n1 % n2 == 0) {
				System.out.print("Sao multiplos");
			}
			else {
				System.out.print("Nao sao multiplos");
			}
		}
		if(n2 > n1) {
			if(n2 % n1 == 0) {
				System.out.print("Sao multiplos");
			}
			else {
				System.out.print("Não sao multiplos");
			}
		}
		
		sc.close();
		
		
	}

}
