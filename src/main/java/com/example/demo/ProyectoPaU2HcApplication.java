package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repository.IEstudianteRepo;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2HcApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*
		//CIUDADANO
		Ciudadano ciudadano=  new Ciudadano();
		 ciudadano.setNombre("Henry");
		 ciudadano.setApellido("Coyago");
		 //this.ciudadanoService.insertar(ciudadano);
		 
		 //EMPLEADO
		  Empleado empleado= new Empleado();
		   empleado.setSalario(new BigDecimal(20));
		   empleado.setFechaIngreso(LocalDateTime.now());
		   
		   
		   empleado.setCiudadano(ciudadano); 
		   ciudadano.setEmpleado(empleado);
		   
		  //OPERACIONES CRUD CIUDADANO
		   Ciudadano ciudadano2= this.ciudadanoService.buscar(12);
		   ciudadano2.setApellido("Reinoso");
		   ciudadanoService.actualizar(ciudadano2);
		   ciudadanoService.eliminar(12);
//		   System.out.println(ciudadano2);
		   
		*/ 
		
		/*
		   Empleado empleado2= new Empleado();
		   empleado2.setSalario(new BigDecimal(20));
		   empleado2.setFechaIngreso(LocalDateTime.now());
		   
		   empleadoService.insertar(empleado2);
		   */
		   
		   //INSET CON CASCADA
//		Ciudadano ciudadano=  new Ciudadano();
//		 ciudadano.setNombre("Henry");
//		 ciudadano.setApellido("Coyago");
//		 //this.ciudadanoService.insertar(ciudadano);
//		 
//		 //EMPLEADO
//		  Empleado empleado= new Empleado();
//		   empleado.setSalario(new BigDecimal(20));
//		   empleado.setFechaIngreso(LocalDateTime.now());
//		   
//		   empleado.setCiudadano(ciudadano); 
//		   ciudadano.setEmpleado(empleado);
//		   //ciudadanoService.insertar(ciudadano);
//		   empleadoService.insertar(empleado);

			
		   
		   
		   
		   
		   

		  
		   
		   
		   
		 
		   
		
	}

}
