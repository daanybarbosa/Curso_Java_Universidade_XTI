package aula1_Introducao;

import java.util.Scanner;

/* 
 * OPERADORES DE BITS (BITWISE)
 * & 	| 	^ 		~ 		<<=
 * &= 	|= 	^| 		>>=	 	>>>=
 * 
 * OPERADORES ESPECIAIS
 * ?: 		Operador ternario
 * , 		Separaçao de expressoes
 * () 		Chama de metodo
 * (cast) 	Coercao unaria
 * 
 * */

public class OperadoresEspeciais {
	
	public static void main(String[] args) {
	
		int idade = 6;
		String x = (idade >= 18 ? "Maior de idade " : "Menor de idade ");
		
		System.out.println(x);
		
		String sexo = "M", pais = "Brasil";
		System.out.println("Sexo: " + sexo + "Pais: " + pais);
		
		//DIAMETRO E AREA DE CIRCULO
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o raio: ");
		double raio = s.nextDouble();
		
		//Diametro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		
		System.out.println("Diametro: " + diametro);
		
		//Circunferencia : 2 PI r
		double pi = Math.PI; //acessar PI atravez da classe Math 
		double circunferencia = 2 * pi * raio;
		
		System.out.println("Circunferencia: " + circunferencia);
		
		//Area PI r2 (raio ao quadrado) 
		double area = pi * (raio * raio);
		System.out.println("Area: " + area);
	}
}
