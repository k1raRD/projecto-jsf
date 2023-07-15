package com.k1rard.projectjsf.controllers;

import java.io.Serializable;
import java.util.List;

import com.k1rard.projectjsf.entities.Empleado;
import com.k1rard.projectjsf.services.EmpleadoService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * @author k1rard
 * Clase controller que se encarga de procesar informacion para la pantalla principal.xhtml 
 */
@Named
@ViewScoped
public class PrincipalController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Lista de empleados para la tabla.
	 */
	private List<Empleado> empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	@Inject
	private EmpleadoService empleadoService;
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		consultarEmpleados();
	}
	
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
