/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele_38
 */
public class Agendamento {
	
	private int id;
	private Cliente cliente;
	private Servico Servico;
	private float valor;
	private Date data;
	private String observacao;
	

	public Agendamento(int id, Cliente cliente, Servico Servico, float valor, String data) {
		this.id = id;
		this.cliente = cliente;
		this.Servico = Servico;
		this.valor = valor;
		try {
			this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data);
				} catch (ParseException ex) {
			Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public Agendamento(int id, Cliente cliente, Servico Servico, float valor, String data, String observacao){
		this(id,cliente,Servico,valor,data);
		this.observacao = observacao;
		
		
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servico getServico() {
		return Servico;
	}

	public void setServico(Servico Servico) {
		this.Servico = Servico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}
	public String getDataFormatada(){
		return new SimpleDateFormat("dd/MM/yyyy").format(data);
	}
	
	public String getHoraFormatada(){
		return new SimpleDateFormat("HH:mm").format(data);
	
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	
	
	
	
}
