/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Daniele_38
 */
public class MenuPrincipalController {

	private final MenuPrincipal View;

	public MenuPrincipalController(MenuPrincipal View) {
		this.View = View;
	}
	
	
	public void navegarParaAgenda(){
		Agenda agenda = new Agenda();
		agenda.setVisible(true);
	
	
	}
	
	
	
	
	
}
