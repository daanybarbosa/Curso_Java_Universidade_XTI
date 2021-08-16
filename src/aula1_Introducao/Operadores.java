package aula1_Introducao;

/* OPERADORES JAVA
 * + (soma) 
 * - (subtratir) 
 * * (multiplicar)
 * / (divisao)
 *  
 *  OPERADORES
 *  Operador e Operando:
 *  	2 + 3; //operador binario (+ é operador, 2 e 3 são operandos, e o conjunto deles se forma uma expressao)
 *  	-2 //operador unario
 *  	true ? "sim" : "nao" //operador ternario
 *
 *  
 *  Lista de Operadores:
 *  Operador			| Finalidade
 *  	+, -, *, /, % 	| Soma, subtrai, multiplica, divide, modulo
 *  	+ 				| Concatena strings
 *  	+, - 			| Operador unario mais e menos
 *  	<, >, <=, >= 	| Comparar, menor que, maior que, menor igual que, maior igual que
 *  	++, -- 			| Pré ou pós incremento
 *  	==, != 			| Comparar se é igual ou diferente
 *  	&&, || 			| Concatenação logica e, concatenação
 *  	. 				| Acessar propriedades de um objeto
 *  	[] 				| Indexar arrays
 *  	() 				| Chamar método
 *  	?: 				| Ternário, retorna um booleano em uma
 *  	<<, >>, >>>		| Operar bit numerico
 *  	˜				| complemento unario sobre bits
 *  	! 				| complemento logico
 *  	&, |, ˆ			| Operadores bit AND, OR, XoR
 *  	, 				| Separar valores
 *  	= 				| Atribuir valor
 *  	+=, -=, *=, /= 	| Atribuir valores somando, subtraindo, multiplicando, dividindo
 *  	<<=, >>=, >>>= 	| Operador de bytes (unario)
 *  	&=, |=, ^= 		| Operador de bytes AND, OR, XoR
 *  	instanceof 		| Verifica o tipo do objeto
 *  	new 			| Criar objeto
 *  	(tipo) 			| Coerção unária	 
 *  
 *  Denominação (binario = 2 operandos, unario = 1 operando, ternario = 3 operandos)
 *  
 *  Conversao de Dados
 *  
 *  Precedencia
 *  
 *  Tipos:	
 *  	- matematicos
 *  	- de comparacao
 *  	- logicos
 *  	- bits
 *  	- atribuição (=)
 *  
 * */


public class Operadores {
	
	public static void main(String[] args) {

		//int x = 9 + 4; // = é um operador de atribuição
		//System.out.println(x);
		
		String x = "9" + "4"; //concatenar strings
		System.out.println(x);
		
		//double y = 7 - 4 + 3 * 2; //precedencia
		//System.out.println(y);
		
		double y = (7 - 4 + 3) * 2;
		System.out.println(y);
	}
}
