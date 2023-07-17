/**
 * 
 */
package com.k1rard.projectjsf.controllers;

import java.io.IOException;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * @author k1rard
 * Clase que permite controlar el funcionamiento con la pantalla de login.xhtml
 */
@Named
@RequestScoped
public class LoginController {

	/**
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * Password ingresada en el login
	 */
	private String password;
	
	
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		
		if(usuario.equals("k1rard") && password.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario incorrecto", ""));
		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
