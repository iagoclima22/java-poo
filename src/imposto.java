import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaAnual, rendaMensal, rendaServico, ganhoCapital;
		double gastosMedicos, gastosEducacionais;
		double impostoSalario, impostoServico, impostoCapital;
		double maximoDedutivel, gastosDedutiveis;
		double impostoBruto, abatimento, impostoDevido;
		
		System.out.print("Renda anual com salário: ");
		rendaAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		rendaMensal = rendaAnual / 12.0;
		if (rendaMensal < 3000) {
			impostoSalario = 0;
		}
		else if (rendaMensal <= 5000) {
			impostoSalario = 0.10 * rendaAnual;
		}
		else {
			impostoSalario = 0.20 * rendaAnual;
		}
		
		
		impostoServico = 0.15 * rendaServico;
		impostoCapital = 0.20 * ganhoCapital;
		
		impostoBruto = impostoSalario + impostoServico + impostoCapital;
		gastosDedutiveis = gastosMedicos + gastosEducacionais;
		maximoDedutivel = 0.30 * impostoBruto;
		
		if (gastosDedutiveis <= 0.30 * impostoBruto) {
			abatimento = gastosDedutiveis;
		}
		else {
			abatimento = maximoDedutivel;
		}
		
		impostoDevido = impostoBruto - abatimento;
		
		System.out.println();
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
		
		System.out.println();
		
		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);
		
		System.out.println();
		
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
		System.out.printf("Abatimento: %.2f\n", abatimento);
		System.out.printf("Imposto devido: %.2f\n", impostoDevido);
		
		sc.close();

	}

}
