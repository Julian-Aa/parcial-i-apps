package com.eam.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Perro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPerro;
    private String nombre;
    private String raza;
    private String nombreDueno;
	/**
	 * 
	 */
	public Perro() {
		super();
	}
	/**
	 * @param idPerro
	 * @param nombre
	 * @param raza
	 * @param nombreDueno
	 */
	public Perro(long idPerro, String nombre, String raza, String nombreDueno) {
		super();
		this.idPerro = idPerro;
		this.nombre = nombre;
		this.raza = raza;
		this.nombreDueno = nombreDueno;
	}
	/**
	 * @return the idPerro
	 */
	public long getIdPerro() {
		return idPerro;
	}
	/**
	 * @param idPerro the idPerro to set
	 */
	public void setIdPerro(long idPerro) {
		this.idPerro = idPerro;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * @return the nombreDueno
	 */
	public String getNombreDueno() {
		return nombreDueno;
	}
	/**
	 * @param nombreDueno the nombreDueno to set
	 */
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
    
    String idDueño;
}
