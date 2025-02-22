package AtividadeTeams;

import java.util.Scanner;

public class CalculandoJurosComposto {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o capital inicial: ");
        double capitalInicial = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJuros = scanner.nextDouble();
        
        System.out.print("Digite o número de meses: ");
        int meses = scanner.nextInt();
        
        double montante = capitalInicial * Math.pow(1 + taxaJuros / 100, meses);
        
        System.out.printf("O montante total após %d meses é: %.2f\n", meses, montante);
        
        scanner.close();
    }
}


