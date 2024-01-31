import java.util.Scanner;

public class LenguajeHacker {

	/*
	 * Escribe un programa que reciba un texto y transforme lenguaje natural a
	 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
	 *  se caracteriza por sustituir caracteres alfanuméricos.
	 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
	 *   con el alfabeto y los números en "leet".
	 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
	 */
	
	public static void main(String args[]) {
		Scanner mc = new Scanner(System.in);
		String texto = "";
		
		System.out.print("Escribe un texto: ");
		texto = mc.nextLine();
		System.out.println("\n");
		
		char[] textoAPasar = texto.toCharArray();
		
		
		for (int i = 0; i < textoAPasar.length; i++) {
			
			switch(textoAPasar[i]) {
			
			case 'a' :
				textoAPasar[i] = '4';
				break;
				
			case 'e' :
				textoAPasar[i] = '3';
				break;
				
			case 'i' :
				textoAPasar[i] = '1';
				break;
				
			case 'o' :
				textoAPasar[i] = '0';
				break;
				
			case 'u' :
				textoAPasar[i] = '2';
				break;					
			
			}
		}
		
		System.out.println(textoAPasar);
	}
}
	

