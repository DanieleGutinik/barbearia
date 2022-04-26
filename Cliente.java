/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Daniele_38
 */
public class Cliente extends Pessoa{
	
	private String endereco;
	private String Cep;

	public Cliente(int id, String nome, char sexo,String dataNascimento,String Telefone, String email, 
		       String rg, String endereco, String Cep){  
		       
		super(id, nome, sexo, dataNascimento, Telefone, email, rg);
		this.endereco = endereco;
		this.Cep = Cep;
	}

	public Cliente(int id, String nome, String endereco, String Cep) {
		super(id, nome);
		this.endereco = endereco;
		this.Cep = Cep;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String Cep) {
		this.Cep = Cep;
	}
	
	@Override
	public String toString(){	
		return getNome();
	
	}
			
}
