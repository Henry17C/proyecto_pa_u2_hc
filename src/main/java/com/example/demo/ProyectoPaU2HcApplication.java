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
		// TODO Auto-generated method stub
//		Estudiante estu= new Estudiante();
//		estu.setApellido("Coyago");
//		estu.setCedula("1755536511");
//		estu.setCiudad("Quito");
//		estu.setGenero("M");
////		estu.setId(4); ya no la necesito pues uso secuencias
//		estu.setNombre("Pedro");;
//		this.estudianteService.agregar(estu);
//		this.estudianteService.modificar(estu);
//		this.estudianteService.borrar(4);
//		
		
//		Estudiante estu1= this.estudianteService.buscar(4);
//		System.out.println(estu1);
		//si quiero actualizar siempre debo tener en cuenta que  tiene que estar presente la primary key en la consulta 
		
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
		   Ciudadano ciudadano2= this.ciudadanoService.buscar(13);
		   ciudadano2.setApellido("Reinoso");
		   ciudadanoService.actualizar(ciudadano2);
		   ciudadanoService.eliminar(11);
//		   System.out.println(ciudadano2);
		   
		   
		   
		 //OPERACIONES CRUD EMPLEADO
//		   //this.empleadoService.insertar(empleado);
//		   Empleado empleado2=this.empleadoService.buscar(5);
//		   empleado2.setSalario(new BigDecimal(300));
//		   this.empleadoService.actualizar(empleado2);
//		   //this.empleadoService.buscar();
		   
		  
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  // ciudadanoService.insertar(ciudadano);//esta
//		   Ciudadano c=ciudadanoService.buscar(8);
//		   c.setApellido("Reinos");
//		   ciudadanoService.actualizar(c);
//		   ciudadanoService.eliminar(8);
		   
		   
//		   empleadoService.insertar(empleado);
//		   empleadoService.eliminar(1);
			  
//		   Empleado e= empleadoService.buscar(2);
//		   System.out.println("Salario: "+e.getSalario());
//		   e.setSalario(new BigDecimal(20000));
//		   empleadoService.actualizar(e);
		   
		  // System.out.println(e);
		  
		   
		   
		   
		 
		   
		
	}

}
