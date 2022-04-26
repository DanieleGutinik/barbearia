/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Daniele_38
 */
public class AgendaController {
	
	private final Agenda view;
	private final AgendaHelper helper;

	public AgendaController(Agenda view) {
		this.view = view;
		this.helper = new AgendaHelper(view);
	}
	
	public void atualizaTabela(){
		// Busca Lista com agendamento do Banco de Dados
		AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
		ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
		
		//Exibir esta lista na View
		helper.preencherTabela(agendamentos);
	}
	
	public void atualizaCliente(){
		
		//Buscar Cliente do Banco de Dados
		ClienteDAO clienteDAO = new ClienteDAO();
		ArrayList<Cliente> Clientes = clienteDAO.selectAll();
	
		//Exibir Clientes no combobox Cliente	
		helper.preecherClientes(Clientes);	
	
	}
	
	public void atualizaServico(){
		ServicoDAO servicoDAO = new ServicoDAO();
		ArrayList<Servico> servicos =servicoDAO.selectAll();
		
		helper.preencherServico(servicos);	
	}
	public void atualizaValor(){
		Servico servico = helper.obterServico();
		helper.setarValor(servico.getValor());
		
	}
	public void agendar(){
		//buscar objeto Agendamento da tela;
		Agendamento agendamento = helper.ObterModelo();
		
		//Salva Objeto no banco de dados.
		new AgendamentoDAO().insert(agendamento);
		
		Correio correio = new Correio();
		correio.notificarPorEmail(agendamento);
		
		// inserir elemento na tabela 
		atualizaTabela();
		helper.limparTela();
	
		
	
	}
	
}
