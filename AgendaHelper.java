/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import static Model.DAO.Banco.cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniele_38
 */
public class AgendaHelper implements IHelper{
	
	private final Agenda view;
	private String idString;

	public AgendaHelper(Agenda view) {
		this.view = view;
	}

	public void preencherTabela(ArrayList<Agendamento> agendamentos) {
		DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
		tableModel.setNumRows(0);
		
		// Percorrer a lista preenchendo o table model
		
		for (Agendamento agendamento : agendamentos) {
			tableModel.addRow(new Object[]{
				
				agendamento.getId(),
				agendamento.getCliente().getNome(),
				agendamento.getServico().getDescricao(),
				agendamento.getValor(),
				agendamento.getDataFormatada(),
				agendamento.getHoraFormatada(),
				agendamento.getObservacao()		
			});
			
		}
			
	}

	public void preecherClientes(ArrayList<Cliente> Clientes) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
				
		for (Cliente Cliente: Clientes) {
			
			comboBoxModel.addElement(cliente); // Popula combox clientes.
			
		}
	}

	public void preencherServico(ArrayList<Servico> servicos) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
		
		for (Servico servico : servicos) {
			comboBoxModel.addElement(servico);
			
		}
		
		
	}
	public Cliente obterCliente() {
		return(Cliente) view.getjComboBoxCliente().getSelectedItem();
		
	}

	public Servico obterServico() {
		return(Servico) view.getjComboBoxServico().getSelectedItem();
		
	}

	public void setarValor(float valor) {
		view.getjTextFieldValor().setText(valor+"");// concatenação Float para String
		
	}

	@Override
	public Agendamento ObterModelo() {
		//new Agendamento;
		
		String idString = view.getjTextFieldId().getText();
		int id = Integer.parseInt(idString);
		Cliente cliente = obterCliente();
		Servico servico = obterServico();
		String valorString = view.getjTextFieldValor().getText();
		float valor = Float.parseFloat(valorString);
		String data = view.getjTextFieldData().getText();
		String hora = view.getjTextFieldHora().getText();
		String dataHora = data + " " + hora;
		String Observacao = view.getjTextPaneObs().getText();
		
		Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, Observacao);
		return agendamento;
		
	}

	@Override
	public void limparTela() {
		view.getjTextFieldId().setText("0");
		view.getjTextFieldData().setText("");
		view.getjTextFieldHora().setText("");
		view.getjTextPaneObs().setText("");			
	}
		
}
