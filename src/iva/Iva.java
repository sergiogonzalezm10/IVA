package iva;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		final double IVA = 0.21;
		double precio;
		double preciofinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio: ");
		precio = sc.nextDouble();
		
		preciofinal = ( 1 + IVA) * precio;
		System.out.println("Precio final con IVA: " + preciofinal + " €");
		sc.close();
	}

}
