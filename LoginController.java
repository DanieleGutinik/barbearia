/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
	
/**
 *
 * @author Daniele_38
 */
public class LoginController {

	private final Login view;
	private LoginHelper helper;

	public LoginController(Login view) {
		this.view = view;
		this.helper = new LoginHelper(view);
	}
		
	public void entrarNoSistema(){
		
		// Pegar um usario da View
		Usuario usuario = helper.ObterModelo();
		
		//Pesquisa Usuário no Banco
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
		
		if(usuarioAutenticado != null){
		 //Navegar para o menu principal
			MenuPrincipal menu = new MenuPrincipal();
			menu.setVisible(true);
			this.view.dispose();
		}else{
			view.exibeMensagem("Usuário e Senha Inválidos.");
		}
		
		//Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco direcionar para o                              menu principal
		//senão mostrar uma mensagem ao usuario "Usuário ou senha invalido";
	
	}
	
	//public void fizTarefa(){
	//	System.out.println("Busquei algo do banco de dados");	
	//	this.view.exibeMensagem("Excutei o fiz tarefa.");
		
	//}
				
}
