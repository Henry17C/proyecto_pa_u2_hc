package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHotelRepo;
@Service
public class HotelServiceImpl implements IHotelService{

	
	@Autowired
	private IHotelRepo hotelRepo;
	
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepo.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return hotelRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		hotelRepo.borrar(id);
		
	}

}
