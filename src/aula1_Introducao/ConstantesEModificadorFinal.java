package aula1_Introducao;

public class ConstantesEModificadorFinal {

	public static void main(String[] args) {
		
		int populacaoBrasileira = 203429773; //variavel
		populacaoBrasileira = 123; //é possivel modificar e substituir
		//double PI = 3.14159265358979323846;
		System.out.println(populacaoBrasileira);
		
		//Modificador Final - valores que nao sera modificado por ninguem, ele se transforma em uma constante
		final double PI = 3.14159265358979323846; 
		//PI = 123; //error - nao pode atribuir um valor para uma constante
		System.out.println(PI);
		
		final char SEXO_MASCULINO = 'M'; 
		final char SEXO_FEMININO = 'F';
		//uma boa pratica sempre escrever as constantes com letras maiusculas e se for nome composto separar por underline
		System.out.println(SEXO_MASCULINO);
		System.out.println(SEXO_FEMININO);
		
		
	}
}
