package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoService {
	public  void insertar (Empleado empleado);
	public  void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);//siempre por pk
	public void eliminar (Integer id); //siempre por pk

}
