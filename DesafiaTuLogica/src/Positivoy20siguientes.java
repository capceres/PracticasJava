// Pide un número por teclado hasta que éste sea positivo. A continuación, muestra los primeros 20 números sucesivos a dicho número.
import java.util.Scanner;

public class Positivoy20siguientes {
	
	public static void main(String[] args) {
		int numero;
		boolean bandera = true;
		
	    do {
	    	Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca un número positivo: ");
		    numero = sc.nextInt();
		    
		    if(numero > 0) {
		    	int mas20 = numero +20;
		    	System.out.println("Los 20 números que siguen a " + numero + " son: ");
		    	
		    	for(int i = numero+1; i <= mas20; i++) {
		    		System.out.println(i);
		    	}
		    	
		    	bandera = false;
		    } else {
		    	System.out.println("El número " + numero + " no es positivo.");
		    }

		    
	    } while (bandera);
	    
	}

}
