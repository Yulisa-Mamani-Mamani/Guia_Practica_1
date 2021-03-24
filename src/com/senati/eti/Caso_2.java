package com.senati.eti;

import java.util.Scanner;

public class Caso_2 {

	public static void main(String[] args) {
		
		// Crear la instancia para el objeto Scanner
		Scanner sc = new Scanner(System.in); 
				
		//Se puede declarar y asignar un valor a una variable
		int n = 0;
				
		//Lectura de la variable
		//System.out.println   ----> el "ln" es para salto de linea 
		System.out.print("Ingrese número: "); 
		n = sc.nextInt();
				
		//Impresión del valor de la variable
				
		System.out.println("----- Valor Ingresado -----");
		System.out.println("Número: " + n);

	}

}
