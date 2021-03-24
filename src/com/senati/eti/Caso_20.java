package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_20 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor una venta: ");
		float venta = sc.nextInt();
		
		float incr = venta + (venta * (float)(0.42)); 
		
		System.out.println("\nValor de la venta incrementado en 42%: " +
		                   df.format(incr));

	}

}
