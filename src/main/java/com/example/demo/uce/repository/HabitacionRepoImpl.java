package com.example.demo.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion habitacion) {
		entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		entityManager.merge(habitacion);
		
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Habitacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Habitacion ha= this.buscar(id);
		this.entityManager.remove(ha);
		
	}
	
	
	

}
