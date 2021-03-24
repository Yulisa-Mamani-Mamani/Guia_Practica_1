package com.senati.eti;

public class Caso_6 {

	public static void main(String[] args) {
		
		// Aplicar CAST: Convertir un tipo de dato a otro	
		int res1 = (int) Math.pow(5, 3); 
				
		// el pow te permite sacar potencias 
		// 81 elevado a la inversa de 2 (1/2) o cualquiera
		// te permite sacar raíces
		float res2 = (float)Math.pow(81, 1/2.0); 
		float res3 = (float)Math.pow(125, 1/3.0); 
		float res4 = (float)Math.pow(256, 1/4.0); 
		float res5 = (float)Math.pow(25, 1/2.0); 
		float res6 = res4 + res5;   
				
		System.out.println("----- Resultados -----");
		System.out.println("Resultado 1....: " + res1);
		System.out.println("Resultado 2....: " + res2);
		System.out.println("Resultado 3....: " + res3);
		System.out.println("Resultado 4....: " + res6);

	}

}
