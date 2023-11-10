//Pedir al usuario 3 números y un orden de ordenamiento, que puede ser ascendente o descendente, a continuación, según el orden indicado se mostrarán en pantalla dichos números.  
import java.util.Scanner;
public class OrdenDe3numeros {

	public static void main(String[] args) {
		int num1, num2, num3;
		int orden;
		String texto = "";
		String texto2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
	    num1 = sc.nextInt();
	    
	    System.out.print("Introduzca el segundo número: ");
	    num2 = sc.nextInt();
	    
	    System.out.print("Introduzca el tercer y último número: ");
	    num3 = sc.nextInt();
	    
	    if(num1 > num2 && num2 > num3) {
	    	texto = ("El orden descendente es: "+ num1 + ", " + num2 + ", " + num3);
	    	texto2 = ("El orden ascendente es: "+ num3 + ", " + num2 + ", " + num1);
	    } else if (num1 > num3 && num3 > num2) {
	    	texto = ("El orden descendente es: "+ num1 + ", " + num3 + ", " + num2);
	    	texto2 = ("El orden ascendente es: "+ num2 + ", " + num3 + ", " + num1);
	    } else if (num2 > num1 && num1 > num3) {
	    	texto = ("El orden descendente es: "+ num2 + ", " + num1 + ", " + num3);
	    	texto2 = ("El orden ascendente es: "+ num3 + ", " + num1 + ", " + num2);
	    } else if (num2 > num1 && num3 > num2) {
	    	texto = ("El orden descendente es: "+ num3 + ", " + num2 + ", " + num1);
	    	texto2 = ("El orden ascendente es: "+ num1 + ", " + num2 + ", " + num3);
	    } else if (num3 > num1 && num1 > num2) {
	    	texto = ("El orden descendente es: "+ num3 + ", " + num1 + ", " + num2);
	    	texto2 = ("El orden ascendente es: "+ num2 + ", " + num1 + ", " + num3);
	    }
	    
	    System.out.print("Escriba 1 para ordenarlos en modo descendente o 2 para ordenarlos en modo ascendente: ");
	    orden = sc.nextInt();
	    
	    switch(orden) {
	    case 1:
	    	System.out.println(texto);
	    	break;
	    	
	    case 2:
	    	System.out.println(texto2);
	    	break;
	    }
	}
}
