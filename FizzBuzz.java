
public class FizzBuzz {

	/*
	 * Escribe un programa que muestre por consola (con un print) los
	 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
	 * cada impresión), sustituyendo los siguientes:
	 * - Múltiplos de 3 por la palabra "fizz".
	 * - Múltiplos de 5 por la palabra "buzz".
	 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
	 */
    public static void main(String args[]) {
        int n = 1;
        
        for(int i = n; n<101; n++) {
            
            if(n%3 == 0 && n%5 == 0) {
                System.out.println("Fizzbuzz");
            }else if(n%3 == 0) {
                System.out.println("Fizz");
            }else if(n%5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(n);
            }
        }
        

    }
	


}


