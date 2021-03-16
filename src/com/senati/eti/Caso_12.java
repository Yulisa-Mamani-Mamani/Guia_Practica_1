package com.senati.eti;

public class Caso_12 {

	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		//                  cadena de caracteres
		String pl1 = frase.substring(0, 7);   //en substring agregarle uno más
        String pl2 = frase.substring(11, 21);
        String pl3 = frase.substring(24, 35);
        
        System.out.println("-------- Resultados --------");
		System.out.println("Palabra 1...: " + pl1);
		System.out.println("Palabra 2...: " + pl2);
		System.out.println("Palabra 3...: " + pl3);

	}

}
