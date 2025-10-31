import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, total;
		
		System.out.print("Hora inicial: ");
		inicio = sc.nextInt();
		System.out.print("Hora final: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			total = fim - inicio;
		}
		else {
			total = (24 - inicio) + fim;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S)");
		
	
		sc.close();
		
	}

}
