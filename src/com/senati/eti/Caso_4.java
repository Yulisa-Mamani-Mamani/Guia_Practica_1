package com.senati.eti;

import java.util.Scanner;

public class Caso_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0; 
		
		System.out.print("Primer n�mero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float division = n1 / n2;
		float restoentero = n1 % n2;
		
		System.out.println("----- Resultados -----");
		System.out.println("Suma............: " + suma);
		System.out.println("Resta...........: " + resta);
		System.out.println("Producto........: " + producto);
		System.out.println("Divisi�n........: " + division);
		System.out.println("Resto Entero....: " + restoentero);

	}

}
