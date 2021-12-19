package loops_arrays_matrizes;

import javax.swing.JOptionPane;

/* desafio loops em java
 * 
 * faca um loop for que mostre os numeros de 3 a 11, sendo que itere de 2 em 2
 * quando este passar pelo 7 esse noa deve ser exibido.
 * faca um loop while que exiba um texto 5 vezes.
 */

public class exec {

	public static void main(String[] args) {
		int j = 1;
		int count = 2;
		for (int i = 3; i <= 11; i += 2) {
			
			if (i != 7 && i <= 11) {
			System.out.println("Numero: " + i + "\n");
			JOptionPane.showMessageDialog( null, i);
	
			}
			
		}
		
		System.out.println("\n" +"Parando o loop for..." + "\n\n");
		
		System.out.println("\n" +"Iniciando o loop while..." + "\n\n");
		
		while (j < 6) {
			System.out.println("exibindo = " + j + " vez" + "\n"); j++;
		 }
		
		 System.out.println("Parando o loop while...");
		  
/* desafio com interruptores.
* faca uma iteracao com numeros multiplos de 2 e pare quando chegar no 12 utilizando break e continue.
*/
		
		 while (count <= 14) {
			 System.out.println("\n Multiplo de 2 = " + count + "\n");
			 count += 2;
			 if (count == 12) {
				 System.out.println("\nChegou ao 12, parando o loop...");
				 break;
			 }
			 else
				 continue;  	 
		}
				  
	}
}