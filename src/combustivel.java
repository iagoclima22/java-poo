import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo; 
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		do {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
			
			if (codigo == 1) {
				alcool += alcool + 1;
			}
			else if (codigo == 2) {
				gasolina += 1;
			}
			else if (codigo == 3) {
				diesel += diesel + 1;
			}
			
		} while (codigo != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool );
		System.out.printf("Gasolina: %d\n", gasolina );
		System.out.printf("Diesel: %d\n", diesel );
		
		sc.close();
		
	}

}
