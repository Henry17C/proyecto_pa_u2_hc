package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.repository.IEstudianteRepo;
import com.example.demo.uce.service.IAutorService;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2HcApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	@Autowired
	private IAutorService autorService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		//Autor
		Autor autor= new Autor();
		autor.setNombre("WS");
		
		
		//Libros
		Libro libro1= new Libro();
		libro1.setNombre("P.Web");
		libro1.setEditorial("Pearson");
		
		Libro libro2= new Libro();
		libro2.setNombre("Redes");
		libro2.setEditorial("Bosco");
		
		Set<Libro> libros = new HashSet<>();
		Set<Autor> autores = new HashSet<>();
		
		
		
		libros.add(libro1);
		libros.add(libro2);
		autores.add(autor);
		
		libro1.setAutores(autores);
		autor.setLibros(libros);
		autorService.insertar(autor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   
		
	}

}
