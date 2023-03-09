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

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Bienvenido a la app Flujo de datos");
//		System.out.println("Introduce tu nombre: ");
//
//		String name = sc.nextLine();
//		sc.close();

		String name = "Paula";

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
		sc.close();
	}

	/*
	 * Lee un numero por teclado que pida el precio de un producto (puede tener
	 * decimales) y calcule el precio final con IVA. El IVA sera una constante que
	 * sera del 21%
	 */

	public void precioFinal() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al coalculador de precio final!");
		System.out.println("Introduce el precio del producto sin IVA: ");

		double precio = Double.parseDouble(sc.nextLine());

		final double IVA = 0.21;

		double precioFinal = precio + (precio * IVA);

		System.out.println("El precio final del producto sera " + precioFinal);

		sc.close();
	}

	/* Muestra los números del 1 al 100 (ambos incluidos). Usa un blucle while. */

	public void mostrarNum() {

		int num = 1;

		while (num >= 1 && num <= 100) {
			System.out.println(num);
			num++;
		}
	}

	/* Haz el mismo ejercicio anterior con un bucle for. */

	public void mostrarNum2() {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	/*
	 * Muestra los numeros del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	 * Utiliza el bucle que desees.
	 */

	public void mostrarNum3() {

		for (int i = 1; i <= 100; i++) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
			}
		}
	}

	/*
	 * Realiza una aplicación que nos pida un número de ventas a introducir, después
	 * nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
	 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite
	 * y lo que no.
	 */

	public void calculoVentas() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido al calculador de ventas!");
		System.out.println("Introduce el numero de ventas totales a introducir: ");

		int totalVentas = Integer.parseInt(sc.nextLine());
		int numVentas = 0;

		if (totalVentas != 0) {

			for (int i = 1; i <= totalVentas; i++) {
				System.out.println("Introduce el numero de ventas realizada en la venta "+i+": ");
				numVentas += Integer.parseInt(sc.nextLine());

			}

			System.out.println("El total de ventas es de " + numVentas);

		} else if (totalVentas == 0) {
			System.out.println("No has introducido ninguna venta");

		} else {
			System.out.println("Has introducido un valor erroneo.");
		}

	}

}
