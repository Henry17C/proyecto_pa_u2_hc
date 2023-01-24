package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacionRepo;
	
	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		habitacionRepo.insertar(habitacion);
		
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		habitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return habitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		habitacionRepo.eliminar(id);
		
	}

}
