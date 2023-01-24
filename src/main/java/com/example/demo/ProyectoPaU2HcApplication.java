package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IEstudianteRepo;
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
	

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2HcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Hotel hotel= new Hotel();
		hotel.setNombre("Hilton colon");
		hotel.setDireccion("Av asdas");
			
		Habitacion habi=new Habitacion();
		habi.setNumero("1A");
		
		 List<Habitacion> h= new ArrayList<>();
		 h.add(habi);
		hotel.setHabitaciones(h);
		habi.setHotel(hotel);
		hotelService.insertar(hotel);
		Hotel hotel1=hotelService.buscar(5);
		hotel1.setNombre("Gran Colombia"); 
		
		hotelService.actualizar(hotel1);   
		hotelService.borrar(1);

		  
		   
		   
		   
		 
		   
		
	}

}
