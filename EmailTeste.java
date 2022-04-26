/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Daniele_38
 */
public class EmailTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        Email email = new Email
		("Senha e Usuário Sistema Service Desk", 
		 "Segue usuário e senha para acesso ao sistema de auditoria\n"+"Usuario:FelipeSoster\n"+"Senha: 123456",
		 "danielegutinik@gmail.com");
        
        email.enviar();
        

    }
    
}
