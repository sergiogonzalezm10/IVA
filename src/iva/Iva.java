package iva;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		final double IVA = 0.21;		//Constante que almacena el valor del IVA
		double precio;					//Variable que almacena el precio
		double preciofinal;				//Variable qu almacena el preciofinal
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Precio: ");
		precio = sc.nextDouble();
		
		preciofinal = ( 1 + IVA) * precio;	//Operación para calcular el precio final
		System.out.println("Precio final con IVA: " + preciofinal + " €");
		sc.close();
	}

}
