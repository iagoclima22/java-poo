import java.util.Locale;
import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double pesoMedio, porcentagemHomens, altMediaMulheres;
		double altura, peso;
		String nome;
		String nomeMaisAlto = null;
		char sexo;
		
		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();
		sc.nextLine();
		
		
		double somaPeso = 0;
		double maiorAltura = 0;
		int contHomens = 0;
		int contMulheres = 0;
		double somaAltMulheres = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do atleta numero " + i + ":");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Valor Invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			
			if (sexo == 'M') {
				contHomens++;
			}
						
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			if (altura > maiorAltura) {
				maiorAltura = altura;
				nomeMaisAlto = nome;
			}
			
			if (sexo == 'F') {
				somaAltMulheres += altura;
				contMulheres++;
			}
			
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			sc.nextLine();
			
			somaPeso += peso;
					
		}
		
		pesoMedio = (double) somaPeso / n;
		porcentagemHomens = (double) contHomens * 100 / n;
		altMediaMulheres = (double) somaAltMulheres / contMulheres;
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
		System.out.printf("Atleta mais alto: %s\n", nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.2f%%\n", porcentagemHomens);
		if (contMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		}
		else {
			System.out.printf("Altura média das mulheres: %.2f", altMediaMulheres);
		}
			
		sc.close();
	}

}
