package com.k1rard.projectjsf.services;

import java.util.LinkedList;
import java.util.List;

import com.k1rard.projectjsf.entities.Empleado;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * @author k1rard
 * Clase que permite realizar la logica de negocio para empleados
 */
@Named
@RequestScoped
public class EmpleadoService {

	/**
	 * Metodo que permite consultar la lista de empleados de empresas TI
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new LinkedList<>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesus");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architecto");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
}
