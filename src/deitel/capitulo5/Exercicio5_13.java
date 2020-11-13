package deitel.capitulo5;

import java.util.Scanner;

/*5.13  (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro positivo n (escrito como n! e pro-
nunciado como “fatorial de n”) é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais 
de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?*/

public class Exercicio5_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor de n: ");
		int n = sc.nextInt();

		long fat = 1;
		int count = 1;
		if(n == 0 || n == 1)
			fat = 1;
		else {
			while(count <= n) {
				fat *= count;
				++count;
			}
		}
		
		System.out.println("Fatorial de " + n  + " = " + fat);
		sc.close();
	
		//A constant holding the maximum value a long can have, 2^63-1.
		
	}//main
}//class
