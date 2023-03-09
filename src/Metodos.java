import java.util.Scanner;
import javax.swing.JOptionPane;
import java.math.*;

public class Metodos {

	/*
	 * Declara 2 variables numéricas (con el valor que desees), e indica cual es
	 * mayor de las dos. Si son iguales, indicarlo tambien. Ves cambiando los
	 * valores para comprobar que funciona.
	 */

	public void mayorValor(int num1, int num2) {

		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println(num1 + " es igual que " + num2);
		}
	}

	/*
	 * Declara un String que contenga tu nombre, después muestra un mensaje de
	 * bienvenida por consola. Por ejemplo: si introduzco "Fernando", me aparezca
	 * "Bienvenido Fernando".
	 */

	public void saludoUsuario() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a la app Flujo de datos");
		System.out.println("Introduce tu nombre: ");

		String name = sc.nextLine();
		sc.close();

		System.out.println("Hola " + name + "! Es un placer tenerte por aqui.");
	}

	/*
	 * Modifica la aplicación anterior para que nos pida el nombre que queremos
	 * introducir (recuerda usar JOptionPane)
	 */

	public void saludoInteractivo() {

		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null,
				"Bienvenido a la app Flujo de datos, " + nombre + "! Es un placer tenerte por aqui.");

	}

	/*
	 * Haz una aplicación que calcule el área de un circulo(pi*R2). El radio se
	 * pedira por teclado (recuerda pasar de String a double con
	 * Double.parseDouble). Usa la constante PI y el método pow de Math.
	 */

	public void areaCirculo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al calculador de area de circulo! ");
		System.out.println("Introduce el radio del circulo: ");

		double num1 = Double.parseDouble(sc.nextLine());

		double area = Math.PI * (Math.pow(num1, 2));

		System.out.println("El area de un circulo con radio de " + num1 + ", es " + area);
		sc.close();
	}

	/*
	 * Lee un numero por teclado e indica si es divisible entre 2 (resto = 0). Si no
	 * lo es, también debemos indicarlo.
	 */

	public void comprobarPar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al comprobador de numeros divisibles por 2!");
		System.out.println("Introduce el numero que deseas comprobar: ");

		int num = Integer.parseInt(sc.nextLine());

		if (num % 2 == 0) {
			System.out.println("El numero indicado es divisible entre 2.");

		} else {
			System.out.println("El numero indicado NO es divisible entre 2.");

		}
	}

}
