
public class Metodos {
	
	/*Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor
	 *  de las dos. Si son iguales, indicarlo tambien. Ves cambiando los valores para 
	 *  comprobar que funciona.*/
	
	
	
	public void mayorValor(int num1, int num2) {
	
	if(num1>num2) {
		System.out.println(num1 + " es mayor que " + num2);
	}else if (num1<num2) {
		System.out.println(num2 + " es mayor que " + num1);
	}else {
		System.out.println(num1 + " es igual que " + num2);
	}
}
}
