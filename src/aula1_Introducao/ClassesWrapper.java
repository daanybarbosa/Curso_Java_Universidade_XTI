package aula1_Introducao;

/* Classes Wrapper
 * 
 * Wrappers Primitivas
 * 	Integer = int | Byte | Short
 * 	Long | Float | Double 
 * 	Character = char | Void | Boolean
 * 
 * elas oferecem alguns recursos de conversão para a linguagem Java
 * por exemplo, converter um valor do tipo Stringo para um valor do tipo double
 *  
 * */

public class ClassesWrapper {
	
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		
		Integer idade = new Integer(25); //construtor descontinuado 
		
		//Double preco = new Double(12.45);
		Double preco = new Double("12.45"); //construtor descontinuado 
		double d = preco.doubleValue(); //retornar um valor double desse preco
		int i = preco.intValue(); //retornar um valor inteiro
		byte b = preco.byteValue(); //retorna um valor do tipo byte
		System.out.println(preco);
		System.out.println(d);
		System.out.println(i);
		System.out.println(b);
		
		char sexo = 'M';
		System.out.println(sexo);
		
		boolean casado = true;
		Boolean casado1 = new Boolean(true); //valor primitivo
		Boolean casado2 = new Boolean("true"); //string
		Boolean casado3 = new Boolean("yes"); //tambem podera usar o yes
		
		//CONVERSAO ESTÁTICA
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		int i2 = Integer.valueOf("101011", 2); //base binaria - esse metodo permite passar um valor binario e qual é a base de conversao - decimal, binaria, hexadecimal ou octal 
		System.out.println(i2);
		
	}
}
