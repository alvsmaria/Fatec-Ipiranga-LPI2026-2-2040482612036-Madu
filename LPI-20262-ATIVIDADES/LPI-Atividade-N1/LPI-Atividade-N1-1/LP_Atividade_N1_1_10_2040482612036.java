import java.util.Scanner;

public class LP_Atividade_N1_1_10_2040482612036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		double a = sc.nextDouble();
		System.out.print("Informe o valor de B: ");
		double b = sc.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = sc.nextDouble();
		System.out.print("Informe o valor de D: ");
		double d = sc.nextDouble();
	    System.out.print("Informe a média do aluno: ");
		double media = sc.nextDouble();
		System.out.print("Informe o percentual de presença: ");
		double presenca = sc.nextDouble();
		sc.close();
		
		double semParenteses = a + b * c / d - 1.5;
		double comParenteses = a + ((b * c) / d) - 1.5;
		System.out.println("--- Demonstração de Precedência Aritmética ---");
        System.out.println("Resultado Sem parênteses: " + semParenteses);
        System.out.println("Resultado Com parênteses explícitos: " + comParenteses);
        System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), mas a segunda forma é mais legível.");
        System.out.println();
        
        boolean aprovadoDireto = (media >= 6.0) && (presenca >= 75.0);
        System.out.println("--- Validação do Critério de Aprovação ---");
        System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
        System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);
	}
}