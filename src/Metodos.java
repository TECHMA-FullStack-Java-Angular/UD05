import java.util.Scanner;


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
	
	/*Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida 
	 * por consola. Por ejemplo: si introduzco "Fernando", me aparezca "Bienvenido Fernando". */
	
	public void saludoUsuario() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bienvenido a la app Flujo de datos");
		System.out.println("Introduce tu nombre: ");
		
		String name = sc.nextLine();
		sc.close();
		
		System.out.println("Hola "+ name + "! Es un placer tenerte por aqui.");
	}
	
	
}
