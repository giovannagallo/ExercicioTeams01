package AtividadeTeams;
import java.util.Scanner;

public class CalculadoraJurosSimples {

	public static void main(String[] args) {


		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Digite o capital inicial: ");
		        double capitalInicial = sc.nextDouble();
		        
		        System.out.print("Digite a taxa de juros mensal (%): ");
		        double taxaJuros = sc.nextDouble();
		        
		        System.out.print("Digite o tempo em meses: ");
		        int meses = sc.nextInt();
		        
		        double juros = capitalInicial * (taxaJuros / 100) * meses;
		        
		        double montante = capitalInicial + juros;
		        
		        System.out.printf("Os juros acumulados são: %.2f\n", juros);
		        System.out.printf("O montante total após %d meses é: %.2f\n", meses, montante);
		        
		        sc.close();
		        
		        
		    }
	}


