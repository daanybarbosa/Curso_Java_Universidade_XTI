package aula1_Introducao;

import java.util.Scanner;

/* Entradas do Usuario:
 * 
 * Chamada : java.lang (pacote)
 * Scanner : java.util (pacote)
 * 
 * */

public class EntradaComScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//recuperação de dados foi feita na Chamada do programa
		//System.out.println(args[0]);
		
		//Interagindo com o usuario
		Scanner s =  new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		String nome = s.nextLine();
		System.out.println("Bem vindo " + nome);
	}
}
