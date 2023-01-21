package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {
	public  void insertar (Ciudadano ciudadano);
	public  void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);//siempre por pk
	public void eliminar (Integer id); //siempre por pk


}
