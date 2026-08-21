import java.util.Scanner;

public class LP_Atividade_N1_1_08_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Informe o valor total da compra em reais: ");
	    double valorTotalReais = sc.nextDouble();
	    System.out.print("Informe o número de parcelas: ");
	    int numeroParcelas = sc.nextInt();
	    sc.close();
	    
	    long valorTotalCentavos = Math.round(valorTotalReais * 100);
	    System.out.println("--- Calculadora Financeira Escalar (Mapeamento em Centavos) ---");
        System.out.println("Valor total convertido: " + valorTotalCentavos + " centavos.");
        long valorParcelaCentavos = valorTotalCentavos / numeroParcelas;
        
        double valorParcelaReais = valorParcelaCentavos / 100.0;
        System.out.println("Divisão de R$" + valorTotalReais + " por " + numeroParcelas + " em centavos: " + valorParcelaCentavos + " centavos por parcela.");
        System.out.println("Valor convertido para exibição: R$ " + valorParcelaReais);
        
        /*Comparação com vantagens e desvantagens:
        
         Vantagens da abordagem Escalar: 
          - Tem maior desempenho por utilizar tipos primitivos do Java.
          - Evita imprecisões do IEEE 754 ao trabalhar apenas com números inteiros.
         Desvantagens da Escalar: 
          - Requer controle manual de conversões (multiplicar/dividir por 100).
          - É menos flexível para cálculos complexos com muitas casas decimais.

         Vantagens do uso do BigDecimal:
          - Manipulação nativa de casas decimais e regras de arredondamento claras (RoundingMode).
         Desvantagens do uso do BigDecimal:
          - Custo ligeiramente maior de processamento e alocação de memória por ser objeto. */
	}
}