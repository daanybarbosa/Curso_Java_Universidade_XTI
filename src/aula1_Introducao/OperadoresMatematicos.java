package aula1_Introducao;

/* OPERADORES MATEMATICOS
 * 
 *  +  | Adição
 *  -  | Subtração
 *  *  | Multiplicação
 *  /  | Divisão
 *  %  | Modulo - mostra o resto da divisao de dois numeros
 *  +  | Positivo
 *  -  | Negativo
 *  ++ | Incremento +1
 *  -- | Decremento -1
 * 
 * */

public class OperadoresMatematicos {
	
	public static void main(String[] args) {
		
		double a = 7 + 3; //soma
		String a1 = "Oi " + "Programador Java"; //concatenar Strings
		
		System.out.println(a);
		System.out.println(a1);
		
		double b = 7 * 3; //multiplicacao
		System.out.println(b);
		
		double c = 7 - 3; //subtracao
		System.out.println(c);
		
		double d = 7 / 3; //divisao
		System.out.println(d);
		
		double e = 7 % 3; //modulo - - é utilizado para encontrar numeros pares ou impares
		System.out.println(e); //o resto é impar = 1
		
		double f = 4 % 2; //modulo - é utilizado para encontrar numeros pares ou impares
		System.out.println(f); //o resto é par = 0
		
		//operadores que declaram que o numero é positivo ou converte o numero para negativo
		double g = +3; //numero positivo
		System.out.println(g);
		
		double g1 = -3; //numero negativo - muda o sinal do valor
		System.out.println(g1);
		
		double g2 = -(+3);
		System.out.println(g2);
		
		double g3 = -(-3);
		System.out.println(g3);
		
		//operadores de incremento e decremento
		
		//incremento
		int h = 6;
		int i = ++h; //h = h + 1 - pré-incremento
		
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		
		int h1 = 6;
		int i1 = h1++; //h = h + 1 - pós-incremento - 1 vai atribuir o valor de h do jeito que esta e so na proxima linha que vai efeturar o incremento.
		
		System.out.println("h1 = " + h1); 
		System.out.println("i1 = " + i1); //vai receber o incremento apos a proxima linha
		
		//decremento
		int h2 = 6;
		int i2 = --h2; //h = h - 1 - pré-incremento
		
		System.out.println("h2 = " + h2);
		System.out.println("i2 = " + i2);
		
		int h3 = 6;
		int i3 = h3--; //h = h + 1 - pós-incremento - 1 vai atribuir o valor de h do jeito que esta e so na proxima linha que vai efeturar o incremento.
		
		System.out.println("h3 = " + h3); 
		System.out.println("i3 = " + i3); 
		
	}
}
