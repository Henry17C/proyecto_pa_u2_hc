package com.example.demo.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		entityManager.merge(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Hotel.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Hotel hotel=this.buscar(id);
		entityManager.remove(hotel);
		
	}

}
