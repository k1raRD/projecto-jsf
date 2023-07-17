package com.k1rard.projectjsf.controllers;

import java.io.IOException;
import java.io.Serializable;

import com.k1rard.projectjsf.dto.UsuarioDto;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

/**
 * @author k1rard
 * Clase que se encarga de mantenr la informacion del usuario que ingresa al aplicativo
 * en sesion.
 */
@Named
@SessionScoped
public class SessionController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Usuario que se mantendra en sesion
	 */
	private UsuarioDto usuarioDto;
	
	/**
	 * Inicializa la sesion del usuario
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion...");
	}
	
	/**
	 * Metodo que permite cerrar la sesion del usuario
	 */
	public void cerrarSesion() {
		
		System.out.println("Cerrando la sesion");
		
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.invalidateSession();
		
		System.out.println("Sesion cerrada");
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionar 
	 * @throws IOException Exception en caso de error al encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}


	/**
	 * @return the usuarioDto
	 */
	public UsuarioDto getUsuarioDto() {
		return usuarioDto;
	}

	/**
	 * @param usuarioDto the usuarioDto to set
	 */
	public void setUsuarioDto(UsuarioDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}
	
	
}
