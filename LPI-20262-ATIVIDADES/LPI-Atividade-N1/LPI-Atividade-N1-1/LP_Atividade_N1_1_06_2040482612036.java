import java.util.Scanner;

public class LP_Atividade_N1_1_06_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Informe o nome de usuário: ");
	    String texto = sc.nextLine();
	    sc.close();
	    
	    if (texto != null && !texto.isEmpty()) {
	        System.out.println("Usuário válido fornecido: " + texto);
	    } else {
	        System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
	    }
	    /* O uso do operador & simples nesse mesmo contexto poderia lançar uma NullPointerException caso a referência fosse nula pois enquanto o operador && utiliza curto-circuito e, caso o primeiro operando for falso, ele interrompe a avaliação imediatamente, com o operador & simples, ambos os lados seriam avaliados obrigatoriamente. Caso o texto fosse nulo (null), tentar executar .isEmpty() no segundo lado resultaria no erro. */
	}
}