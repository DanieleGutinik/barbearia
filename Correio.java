/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author Daniele_38
 */
public class Correio {
	
	public void notificarPorEmail(Agendamento agendamento){
		String emailFormatado = formatarEmail(agendamento);
		String destinatario = agendamento.getCliente().getEmail();
		
		// uso da classe de email
		Email email = new Email("Agendamento", emailFormatado, destinatario);
		email.enviar();			
	}
	
	private String formatarEmail(Agendamento agendamento) {
		
		String nomeCliente = agendamento.getCliente().getNome();
		String servico = agendamento.getServico().getDescricao();
		String dataAgendamento = agendamento.getDataFormatada();
		String horaAgendamento = agendamento.getHoraFormatada();
		float valor = agendamento.getValor();
		
		return "Ola " + nomeCliente + "Seu agendamento para " +
			servico + ", esta marcado para o dia " + dataAgendamento +
			"ás " + horaAgendamento + "com " + valor + "Obrigado.";		
	}
	
}
