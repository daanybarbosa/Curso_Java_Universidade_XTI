package aula1_Introducao;

/* OPERADORES DE COMPARAÇÃO
 * 
 * 	== 			| igual
 * 	!= 			| diferente
 * 	> 			| maior
 * 	< 			| menor
 * 	>= 			| maior ou igual
 * 	<= 			| menor ou igual
 * 	instanceof 	| compara tipos
 * 
 * */

public class OperadoresComparacao {

	public static void main(String[] args) {
		
		int x = 6;
		//x == 6 : true; 
		//x == 6 : false;
		Integer x1 = 6; //wrapper
		
		System.out.println(x == 6); // compara se os valores sao iguais e retornam um booleano: true/false
		System.out.println(x == 7); 
		//System.out.println(x == "6"); //é incompartivel
		
		System.out.println(x != 6); //compara se os valores sao diferentes
		System.out.println(x != 7); 
		
		System.out.println(x > 7); //compara se é maior
		System.out.println(x > 5);
		
		System.out.println(x < 7); //compara se o valor é menor  
		System.out.println(x < 5);
		
		System.out.println(x >= 7); //compara se é maior ou igual a 7
		System.out.println(x >= 6);
		
		System.out.println(x <= 7); //compara se é menor ou igual a 7
		System.out.println(x <= 6);
		
		//System.out.println(x instanceof int); //erro - int nao é um tipo de objeto, é um tipo primitivo de dados
		System.out.println(x1 instanceof Integer); //compara numeros
		System.out.println("oi" instanceof String); //compara strings
		
	}
}
