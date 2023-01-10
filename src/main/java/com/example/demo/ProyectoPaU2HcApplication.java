package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.repository.IEstudianteRepo;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2HcApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu= new Estudiante();
		estu.setApellido("Coyago");
		estu.setCedula("1755536511");
		estu.setCiudad("Quito");
		estu.setGenero("M");
//		estu.setId(4); ya no la necesito pues uso secuencias
		estu.setNombre("Pedro");;
		this.estudianteService.agregar(estu);
//		this.estudianteService.modificar(estu);
//		this.estudianteService.borrar(4);
//		
		
//		Estudiante estu1= this.estudianteService.buscar(4);
//		System.out.println(estu1);
		//si quiero actualizar siempre debo tener en cuenta que  tiene que estar presente la primary key en la consulta 
		
	}

}
