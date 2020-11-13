package deitel.capitulo5;

import java.util.Scanner;

/*5.11  (Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. Suponha que o primeiro valor lido 
especifica o número de valores a serem inseridos pelo usuário.*/

public class Exercicio5_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a quantidade de valores a serem comparados: ");
		int qtdValores = sc.nextInt();
		
		System.out.print("Informe o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		int menor;
		int i = 1;
		while(i <= qtdValores - 1) {//"qtdValores - 1" porque o primeiro valor já foi inserido em "valor1".
			
			System.out.print("Informe o próximo valor: ");
			int valor2 = sc.nextInt();//Recebe o segundo valor para comparacao.
			
			if(valor2 < valor1)//Compara os valores "valor1" e "valor2".
				menor = valor2;
			else
				menor =valor1;
			
			valor1 = valor2;//"valor1" recebe o ultimo valor inserido "valor2" para a próxima comparacao.
			System.out.println("Menor valor = " + menor);
			++i;//incrementa i.
		}
		
		sc.close();
		
	}//main
}//class
