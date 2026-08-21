import java.util.Scanner;

public class LP_Atividade_N1_1_04_2040482612036 {
    public static final String INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO = 14;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Informe o número de dias do empréstimo: ");
	    final int diasEmprestimo = sc.nextInt();
	    sc.close();
	    
	    //diasEmprestimo = 7; -> quando há uma tentativa de reatribuir um valor a uma variável final, ocorre um erro de compilação:
	    //Compilation failed due to following error(s).
	    //LP_Atividade_N1_1_04_2040482612036.java:11: error: cannot assign a value to final variable diasEmprestimo
	    //diasEmprestimo = 20;
	    //^
        //1 error
	    
	    calculoDaDevolucao(diasEmprestimo);
	}
	public static void calculoDaDevolucao(final int diasEmprestimo) {
	    System.out.println("Instituição: " + INSTITUICAO);
	    System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO + " dias.");
	    System.out.println("Dias calculados para devolução: " + diasEmprestimo);
	}
}