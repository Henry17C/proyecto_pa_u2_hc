package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prof_sec")//generarlo como secuencia
	@SequenceGenerator(name = "prof_sec", sequenceName = "prof_sec", allocationSize = 1)
	@Column(name="prof_id")
	private int id;
	
	@Column(name="prof_nombre")
	private String nombre;
	
	@Column(name="prof_apellido")
	private String apellido;
	
	@Column(name="prof_genero")
	private String genero;
	
	@Column(name="prof_cedula")
	private String cedula;
	
	@Column(name="prof_ciudad")
	private String ciudad;
	
	
	//GET Y SET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + ", ciudad=" + ciudad + "]";
	}
	
	
	
	

}
