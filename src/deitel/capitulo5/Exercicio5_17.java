package deitel.capitulo5;

import java.util.Scanner;

/*5.17  (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; produto 
2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um aplicativo que leia uma série de pares de números 
como segue:
a)  número de produto
b)  quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve calcular e exibir o valor de 
varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop 
e exibir os resultados finais.*/

public class Exercicio5_17 {

	public static void main(String[] args) {
		
		//contadores
		
		int p1Count = 0;
		int p2Count = 0;
		int p3Count = 0;
		int p4Count = 0;
		int p5Count = 0;
		
		//preços
		
		final double produto1 = 2.98;
		final double produto2 = 4.50;
		final double produto3 = 9.98;
		final double produto4 = 4.49;
		final double produto5 = 6.87;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número do produto de 1 a 5.");
		System.out.print(" (Utilize Ctrl+z para finalizar o aplicativo).\n");
		
		while(sc.hasNext()) {
			int nProduto = sc.nextInt();
			
			switch(nProduto) {// ctrl+z para finalizar o loop.
			
			case 1:
				++p1Count;
				break;
			case 2:
				++p2Count;
				break;
			case 3:
				++p3Count;
				break;
			case 4:
				++p4Count;
				break;
			case 5:
				++p5Count;
				break;
			default:
				System.out.println("Produto não especificado.");
			
			}
		}//while
		
		int[] qtdVendida = {p1Count,p2Count,p3Count,p4Count,p5Count};
		double[] valorTotal = {p1Count*produto1, p2Count*produto2, p3Count*produto3, p4Count*produto4, p5Count*produto5};
		int qtdVendidas = 0;
		double valorTotalVendido = 0;
		
		for(int i = 0; i < 5; ++i) {
			System.out.println("Produto " + (i+1) + " vendido: Qtd:" + qtdVendida[i] + ", Total: US$" + valorTotal[i] );
			qtdVendidas += qtdVendida[i];
			valorTotalVendido += valorTotal[i];
		}
		
		System.out.println("Quantidade total vendida: " + qtdVendidas);
		System.out.println("Valor total vendido: US$" + valorTotalVendido);
		
		sc.close();
		
	}//main
}//class
