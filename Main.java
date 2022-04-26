/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Daniele_38
 */
public class Main {

		
	public static void main(String[] args) {
		String nome = "Daniele";
		System.out.println(nome);
		
		Servico servico = new Servico(1, "Barba", 30);
		
		System.out.println(servico.getDescricao());
		System.out.println(servico.getValor());
		
		//Cliente Cliente = new Cliente(1," Daniele ", "rua teste", "1265474");
				
		//System.out.println(Cliente.getId());
		
		Usuario usuario = new Usuario(1," BARBEIRO ", "SENHA");
		
		
		//System.out.println(Cliente.getNome());
		System.out.print(usuario.getNome());
		
		//Agendamento agentamento = new Agendamento(1,Cliente, servico, 30, "20/04/2022 08:00");
		
		//System.out.println(agentamento.getCliente().getNome());
		
		
	
	}


}
