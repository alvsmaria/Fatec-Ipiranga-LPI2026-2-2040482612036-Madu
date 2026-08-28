import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class LP_Atividade_N1_1_07_2040482612036 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Informe o valor A (ex.: 1.00): ");
	    String valorA = sc.nextLine();
	    System.out.print("Informe o valor B (ex.: 0.90): ");
	    String valorB = sc.nextLine();
	    System.out.print("Informe o valor total da compra: ");
	    String valorCompra = sc.nextLine();
	    System.out.print("Informe o número de parcelas: ");
	    int numeroParcelas = sc.nextInt();
	    sc.close();
	    
	    double doubleA = Double.parseDouble(valorA);
        double doubleB = Double.parseDouble(valorB);
        double resultadoDoubleAB = doubleA - doubleB;
        BigDecimal resultadoEsperado = new BigDecimal(valorA).subtract(new BigDecimal(valorB));
        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria " + resultadoEsperado);
        System.out.println("Resultado real obtido com double: " + resultadoDoubleAB);
        System.out.println();
        
        BigDecimal bigDecimalA = new BigDecimal(valorA);
        BigDecimal bigDecimalB = new BigDecimal(valorB);
        BigDecimal resultadoBigDecimalAB = bigDecimalA.subtract(bigDecimalB);
        System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoBigDecimalAB);
        System.out.println();
        
        BigDecimal compraBigDecimal = new BigDecimal(valorCompra);
        BigDecimal parcelasBigDecimal = new BigDecimal(numeroParcelas);
        BigDecimal valorDaParcela = compraBigDecimal.divide(parcelasBigDecimal, 2, RoundingMode.HALF_UP); 
        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorDaParcela + " por parcela.");
	}
}