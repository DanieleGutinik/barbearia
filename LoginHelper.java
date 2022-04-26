/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author Daniele_38
 */
public class LoginHelper implements IHelper{
	
	private final Login view;

	public LoginHelper(Login view) {
		this.view = view;
	}
	
	public Usuario ObterModelo(){
		String nome = view.getjTextFieldUsuario().getText();
		String senha = view.getjPasswordSenha().getText();		
		Usuario modelo = new Usuario(0, nome, senha);
		return modelo;		
	}
	
	public void setarModelo(Usuario modelo){
		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		
		view.getjTextFieldUsuario().setText(nome);
		view.getjPasswordSenha().setText(senha);	
	}
	
	public void limparTela(){
		view.getjTextFieldUsuario().setText("");
		view.getjPasswordSenha().setText("");
		
	
	}
				
}
