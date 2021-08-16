package aula1_Introducao;

/* OPERADORES LOGICOS
 * 
 * && | AND (e)
 * || | OR (ou)
 * !  | NOT (não) 
 * 
 * */

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		int x = 6;
		System.out.println((x >= 1) && (x <= 10)); //AND - retorna verdadeiro se as duas expressoes forem verdadeira
		System.out.println((x >= 1) && (x <= 5)); 
		
		System.out.println((x >= 1) || (x <= 10)); //OR - retorna verdaeiro se pelo menos uma das expressoes forem verdadeiras
		System.out.println((x >= 1) || (x <= 5));
		
		System.out.println(!(x >= 1)); //negacao - inverte o resultado da expressao
		
	}
}
