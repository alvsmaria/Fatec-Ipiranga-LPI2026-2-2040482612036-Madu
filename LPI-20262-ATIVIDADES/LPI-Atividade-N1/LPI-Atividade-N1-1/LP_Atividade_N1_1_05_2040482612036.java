import java.util.Scanner;

public class LP_Atividade_N1_1_05_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Estoque inicial: ");
	    int estoque = sc.nextInt();
	    System.out.print("Quantidade de entrada: ");
	    int qtdEntrada = sc.nextInt();
	    System.out.print("Quantidade de saída 1: ");
	    int qtdSaida1 = sc.nextInt();
	    System.out.print("Quantidade de saída 2: ");
	    int qtdSaida2 = sc.nextInt();
	    System.out.print("Estoque mínimo: ");
	    int estoqueMinimo = sc.nextInt();
	    System.out.print("Tamanho do lote (caixa): ");
	    int tamanhoLote = sc.nextInt();
	    sc.close();
	    
	    int estoqueInicial = estoque;
	    System.out.println("Estoque inicial: " + estoqueInicial + " unidades.");
	    estoque += qtdEntrada;
	    System.out.println("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades." );
	    estoque -= qtdSaida1;
	    System.out.println("Após saída (-" + qtdSaida1 + "): " + estoque + " unidades.");
	    estoque -= qtdSaida2;
	    System.out.println("Após outra saída (-" + qtdSaida2 + "): " + estoque + " unidades.");
	    
	    boolean estoqueAbaixoDoMinimo = estoque < estoqueMinimo;
	    System.out.println("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? " + estoqueAbaixoDoMinimo);
	    
	    int unidadesForaDeCaixas = estoque % tamanhoLote;
	    boolean estoquePerfeitamenteFracionado = (unidadesForaDeCaixas == 0);
	    System.out.println("Unidades fora de caixas fechadas de " + tamanhoLote + ": " + unidadesForaDeCaixas);
	    System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + estoquePerfeitamenteFracionado);
	}
}