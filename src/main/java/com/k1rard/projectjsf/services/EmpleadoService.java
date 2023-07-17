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
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloite = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		// :::::::::::::::::::::
		
		empleadoNetflix.setNombre("Diego");
		empleadoNetflix.setPrimerApellido("paniagua");
		empleadoNetflix.setSegundoApellido("Lopez");
		empleadoNetflix.setPuesto("Senior Developer Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoDeloite.setNombre("Luis Jesus");
		empleadoDeloite.setPrimerApellido("Lopez");
		empleadoDeloite.setSegundoApellido("Romero");
		empleadoDeloite.setPuesto("CEO");
		empleadoDeloite.setEstatus(true);
		
		empleadoDisney.setNombre("Daniel");
		empleadoDisney.setPrimerApellido("Lopez");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architecto");
		empleadoDisney.setEstatus(true);
		
		empleadoHP.setNombre("Diego");
		empleadoHP.setPrimerApellido("paniagua");
		empleadoHP.setSegundoApellido("Lopez");
		empleadoHP.setPuesto("Senior Developer Java");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Luis Jesus");
		empleadoOracle.setPrimerApellido("Lopez");
		empleadoOracle.setSegundoApellido("Romero");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(true);
		
		empleadoAmazon.setNombre("Daniel");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("Architecto");
		empleadoAmazon.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoDeloite);
		empleados.add(empleadoDisney);
		empleados.add(empleadoHP);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoOracle);
		
		return empleados;
	}
}
