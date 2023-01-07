package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	
	//CRUD BASICO
	public  void insertar (Estudiante estudiante);
	public  void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);//siempre por pk
	public void eliminar (Integer id); //siempre por pk

}
