import java.util.Scanner;

public class LP_Atividade_N1_1_01_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("Idade do Aluno: ");
		byte idade = sc.nextByte(); // byte = 8 bits, com intervalo de -128 a 127.
		System.out.print("Número de Faltas: ");
		short faltas = sc.nextShort(); // short = 16 bits, com intervalo de -32.768 a 32.767.
		System.out.print("Matrícula ID: ");
		int matriculaId = sc.nextInt(); // int = 32 bits, com intervalo de -2.147.483.648 a 2.147.483.647.
		System.out.print("Código Nacional do Estudante: ");
		long codigoNacional = sc.nextLong(); // long = 64 bits, com intervalo de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
		System.out.print("Nota do Trabalho: ");
		float notaTrabalho = sc.nextFloat(); // float = 32 bits, com intervalo de ± 1.5 × 10⁻⁴⁵ a ± 3.4 × 10³⁸.
		System.out.print("Nota da Prova Final: ");
		double notaProvaFinal = sc.nextDouble(); // double = 64 bits, com intervalo de ± 2.23 × 10⁻³⁰⁸ até ± 1.80 × 10³⁰⁸.
		System.out.print("Conceito Final do Aluno: ");
		char conceitoFinal = sc.next().charAt(0); // char = 16 bits, com intervalo 0 a 65.535.
		System.out.print("Aluno está Aprovado (true/false): ");
		boolean aprovado = sc.nextBoolean(); // boolean = 1 bit, com apenas dois valores (true ou false).
		sc.close();
		
		System.out.println("--- Dados do Aluno Fictício ---");
		System.out.println("Idade do Aluno: " + idade + " anos");
		System.out.println("Número de Faltas: " + faltas);
		System.out.println("Matrícula ID: " + matriculaId);
		System.out.println("Código Nacional do Estudante: " + codigoNacional);
		System.out.println("Nota do Trabalho: " + notaTrabalho);
		System.out.println("Nota da Prova Final: " + notaProvaFinal);
		System.out.println("Conceito Final do Aluno: " + conceitoFinal);
		System.out.println("Aluno está Aprovado? "+ aprovado);
	}
}