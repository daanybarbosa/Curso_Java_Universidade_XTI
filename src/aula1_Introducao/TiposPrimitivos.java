package aula1_Introducao;

/*
 * dado primitivo é o valor da variavel 
 * 
 * Tipos e Tamanhos:
 * int | byte | short | long -> recebe um numero sem fração 
 * float | double -> recebe valores fracionados
 * char -> caracter | void -> nulo | boolean -> true/false
 * 
 * */


public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//tipo | nome da variavel | valor da variavel 
		int idade = 31; 
		double preco = 12.45; //valor fracionario - devera utilizar o ponto para separar as dezenas
		char sexo = 'M'; // apenas recebe um caracter (1 letra)
		boolean casado = true; //apenas recebe true ou false
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(sexo);
		System.out.println(casado);
		
		
		byte b = 127; //apenas representa ate o numero 127
		short s = (short) 32768; //apenas representa ate o numero 32768
		//short s2 = 32_768; //tambem é possivel separar para tornar mais legivel o codigo 
		int i = 2_000_000_000; //suporta ate 2 bilhoes
		//long l = 9_000_000_000_000_000_000; //suporta ate 9 quintilhoes
		long l = 9_000_000_000_000_000_000L; //os numeros podem ter a inclusao de letras para representar o tipo 
		double d = 1.7976931348623157E+308; //padrao IEEE 754 - define os numeros de ponto flutuante devem ser tratados pelo o computador
		double d2 = 1.7976931348623157E+308D;	
		float f = 123F;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(f);
		
		
		//Sistema de numeros binarios
		byte bb = 0b01010101; //ocupa 8 bits/1 byte 
		short ss = 0b0101010101010101; //ocupa 16 bits/2 bytes
		int ii = 0b01010101010101010101010101010101; //ocupa 32 bits/4 bytes
		System.out.println(bb);
		System.out.println(ss);
		System.out.println(ii);
		
		
		//Cast Implicito
		i = s; //convertendo um short para inteiro
		System.out.println(s);
		System.out.println(i);
		
		//Cast Explicito - forçar uma conversão 
		i = (int) l; //convertendo um long para inteiro
		System.out.println(l);
		System.out.println(i);
		
	}
	

	
}