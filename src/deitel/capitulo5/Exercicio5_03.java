package deitel.capitulo5;


/*5.3 Escreva uma instru��o Java ou um conjunto de instru��es Java para realizar cada uma das seguintes tarefas:
a)  Some os inteiros �mpares entre 1 e 99 utilizando uma instru��o for. Assuma que as vari�veis de inteiro sum e count foram declaradas.
b)  Calcule o valor de 2.5 elevado � pot�ncia de 3, utilizando o m�todo pow.
c)  Imprima os inteiros de 1 a 20, utilizando um loop while e a vari�vel contadora i. Assuma que a vari�vel i foi declarada, mas n�o foi 
inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o c�lculo i % 5. Quando o valor dessa express�o for 0, imprima 
um caractere de nova linha; caso contr�rio, imprima um caractere de tabula��o. Assuma que esse c�digo � um aplicativo. Utilize o 
m�todo System.out.println() para imprimir o caractere de nova linha, e utilize o m�todo System.out.print('\t') para 
imprimir o caractere de tabula��o.]
d)  Repita a parte (c) utilizando uma instru��o for.*/

public class Exercicio5_03 {

	public static void main(String[] args) {
		
		//a)  Some os inteiros �mpares entre 1 e 99 utilizando uma instru��o for. Assuma que as vari�veis de inteiro sum e count foram declaradas.
		
		int sum = 0;
		for(int count = 0; count < 100; ++count) {
			
			if(count % 2 != 0)
			sum += count;
		}
		
		System.out.println("a) " + sum);
		
		
		//b)  Calcule o valor de 2.5 elevado � pot�ncia de 3, utilizando o m�todo pow.
		
		double base = 2.5;
		int p = 3;
		
		double resultado = Math.pow(base, p);
		
		System.out.println("b) " + resultado);
		
		/*c)  Imprima os inteiros de 1 a 20, utilizando um loop while e a vari�vel contadora i. Assuma que a vari�vel i foi declarada, mas n�o foi 
		inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o c�lculo i % 5. Quando o valor dessa express�o for 0, imprima 
		um caractere de nova linha; caso contr�rio, imprima um caractere de tabula��o. Assuma que esse c�digo � um aplicativo. Utilize o 
		m�todo System.out.println() para imprimir o caractere de nova linha, e utilize o m�todo System.out.print('\t') para 
		imprimir o caractere de tabula��o.]*/
		
		System.out.println("c) ");
		
		int  i = 1;
		do {
			System.out.printf("%d", i);
			if(i % 5 == 0) 
				System.out.println();
			else
				System.out.printf("\t");
			++i;
		}while(i <= 20);
		
		
		//d)  Repita a parte (c) utilizando uma instru��o for.*/
		
		System.out.println("d) ");
		
		for(i = 1; i <= 20; ++i) {
			System.out.printf("%d", i);
			if(i % 5 == 0) 
				System.out.println();
			else
				System.out.printf("\t");
		}
		

	}//main
}//class
