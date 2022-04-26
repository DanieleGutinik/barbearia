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
abstract public class Pessoa {
	protected int id;
	protected String nome;
	protected char sexo;
	protected Date dataNascimento;
	protected String Telefone;
	protected String email;
	protected String rg;

	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Pessoa(int id, String nome, char sexo, String dataNascimento, String Telefone, String email,
		      String rg) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		try {
			this.dataNascimento = new SimpleDateFormat("dd/mm/yyyy").parse(dataNascimento);
		} catch (ParseException ex) {
			Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
		}
		this.Telefone = Telefone;
		this.email = email;
		this.rg = rg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
}
