// Muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
public class MultiplosDe2y3 {
	
	public static void main(String[] args) {
		int numero, numeroDos, numeroTres;
		numero = 1;
		numeroDos = 2;
		numeroTres = 3;
		
		while (numero <= 100) {
			if (numero%numeroDos == 0) {
				System.out.println(numero + " es múltiplo de " + numeroDos);
			} else if (numero%numeroTres == 0) {
				System.out.println(numero + " es múltiplo de " + numeroTres);
			}
			
			numero++;
			
		}
	}

}
