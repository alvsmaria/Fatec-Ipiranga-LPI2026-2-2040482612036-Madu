/* O exercício foi feito com a repetição 'do-while' por fazer o loop ao menos uma vez, sendo necessária por prever ao menos uma tentativa para colocar a senha */

import java.util.Scanner;

public class LP_Atividade_N1_2_03_2040482612036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o PIN de acesso: ");
		int pinDigitado = sc.nextInt();
		int pinTentativa;
		int quantidadeTentativa = 0;

		do {
		    pinTentativa = sc.nextInt();
		    quantidadeTentativa++;
		    if (pinTentativa != pinDigitado){
		        System.out.println("Pin incorreto. Tente novamente.");
		    }
		} while (pinTentativa != pinDigitado); 
                System.out.println("Acesso concedido! Você utilizou " + quantidadeTentativa + " tentativa(s).");
	}
}