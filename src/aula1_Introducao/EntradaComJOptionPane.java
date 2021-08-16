package aula1_Introducao;

import javax.swing.JOptionPane;

/* Entradas do Usuario: 
 * 	JOptionPane (javax.swing) - pacote
 * */

public class EntradaComJOptionPane {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? ");
		//System.out.println(nome); //imprime o resultado 
		JOptionPane.showMessageDialog(null, nome); //ira abrir uma janela com a mensagem, esse metodo recebe dois parametros: 1 - null, 2 - mensagem que deseja apresentar para o usuario
	
	}
}
