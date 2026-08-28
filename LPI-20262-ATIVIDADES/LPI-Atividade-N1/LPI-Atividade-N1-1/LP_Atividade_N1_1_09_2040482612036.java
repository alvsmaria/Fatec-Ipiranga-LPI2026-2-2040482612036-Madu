import java.util.Scanner;

public class LP_Atividade_N1_1_09_2040482612036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a nota final do aluno: ");
		double notaFinal = sc.nextDouble();
		sc.close();

		System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
		if (notaFinal >= 6.0) {
			System.out.println("Situação (if-else): Aprovado");
		} else {
			System.out.println("Situação (if-else): Reprovado");
		}
		System.out.println();

		String operadorTernario = (notaFinal >= 6.0) ? "Aprovado" : "Reprovado";
		System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
		System.out.println("Situação (Ternário): " + operadorTernario);
		
		/* Ternário Encadeado (nested ternary):
          Primeiramente vamos a uma demonstração de como seria se houvesse um terceiro estado, utilizando o exemplo "Recuperação" para notas entre 4.0 e 5.9):
            String exemploTernárioEncadeado = (notaFinal >= 6.0) ? "Aprovado" : (notaFinal >= 4.0) ? "Recuperação" : "Reprovado";
          Isso deve ser evitado primeiramente porque o código se torna mais difícil de ler e entender à primeira vista, pois a tela fica poluída, com muitos operadores de interrogação e dois-pontos. Outro fator é que erros de lógica em ternários encadeados são muito mais difíceis de rastrear do que em if / else. */
	}
}