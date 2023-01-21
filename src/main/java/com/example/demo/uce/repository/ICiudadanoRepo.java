package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Estudiante;

public interface ICiudadanoRepo {
	
	public  void insertar (Ciudadano ciudadano);
	public  void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);//siempre por pk
	public void eliminar (Integer id); //siempre por pk


}
