package aula1_Introducao;

/* OPERADORES DE ATRIBUICAO - simplifica o processo
 * 
 * += | Adicao
 * -= | Subtracao
 * *= | Multiplicacao
 * /= | Divisao
 * %= | Modulo
 * 
 * */


public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int x = 6;
		x += 3; //x = x + 3;
		System.out.println("Soma: " + x);
		x -= 3; //x = x - 3;
		System.out.println("Subtracao: " + x);
		x *= 3; //x = x * 3;
		System.out.println("Multiplicacao: " + x);
		x /= 3; //x = x / 3;
		System.out.println("Divisao: " + x);
		x %= 3; //x = x % 3;
		System.out.println("Modulo: " + x);
		
	}
}
