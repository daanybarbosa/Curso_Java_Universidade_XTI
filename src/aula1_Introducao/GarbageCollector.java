package aula1_Introducao;

public class GarbageCollector {
	
	static String[] teste = {"iouoi"};
	

	public static void main(String[] args) {
		
		//Variavel Primitiva
		int x = 7;
		x = 9; //substitui o valor anterior
		System.out.println(x);
		
		//Variavel de Referencia - toda variavel que aponta para um objeto
		String y = "XTI";
		y = "xti.com.br"; //substitui o valor anterior, porem continua na memoria
		y = null; //valor nulo 
		System.out.println(y);
				
		
	}
}
