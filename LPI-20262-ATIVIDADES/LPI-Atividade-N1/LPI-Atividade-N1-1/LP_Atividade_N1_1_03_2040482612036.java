import java.util.Scanner;

public class LP_Atividade_N1_1_03_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    Integer idade = null;
	    try {
	        System.out.println("Tentando realizar operação aritmética com Integer nulo...");
	        int idadeProximoAno = idade + 1;
	    } catch(NullPointerException detalheExcecao) {
	        System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null).");
	        System.out.println("Detalhe da exceção: " + detalheExcecao.getClass().getName());
	    }
	    
		System.out.print("Informe uma idade válida: ");
		int novaIdade = sc.nextInt();
		sc.close();
		
		idade = novaIdade;
		System.out.println("Reatribuindo valor válido para a variável...");
		System.out.println("Operação bem-sucedida! Idade atual: " + idade + " | Idade no próximo ano: " + (idade + 1));
	}
}