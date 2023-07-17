package com.k1rard.projectjsf.dto;

/**
 * @author k1rard
 * clase que permitira contener la informacion del usuario en sesion
 */
public class UsuarioDto {

	/**
	 * nickname
	 */
	private String usuario;
	/**
	 * paswword
	 */
	private String password;
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
