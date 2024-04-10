/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * PROYECTO INTEGRADOR - POO EN JAVA - ALKEMY
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Mentor: Martin Oviedo
 * Comision: 26
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Alumna: Agustina Bartolomé
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.miapp.biblioteca;

import java.util.ArrayList;

public class Usuario {

	private String nombre;
	
	private String numeroDeIdentificacion;
	
	private ArrayList<Libro> librosPrestados;


    public Usuario() {
    	
        this.librosPrestados = new ArrayList<>();
    }

	public Usuario(String nombre, String numeroDeIdentificacion) {
		
		this.nombre = nombre;
		
		this.numeroDeIdentificacion = numeroDeIdentificacion;
		
		this.librosPrestados = new ArrayList<>();
	
	}
	
	/*
	public Usuario() {
		
	}
	*/

	public String getNombre() {
	
		return nombre;
	
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	
	}

	public String getNumeroDeIdentificacion() {

		return numeroDeIdentificacion;
	
	}

	public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {

		this.numeroDeIdentificacion = numeroDeIdentificacion;
	
	}

	public ArrayList<Libro> getLibrosPrestados() {

		return librosPrestados;
	
	}

	public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {

		this.librosPrestados = librosPrestados;
	
	}

	@Override

	public String toString() {
	
		return "Usuario [nombre=" + nombre + ", numeroDeIdentificacion=" + numeroDeIdentificacion +  "]";
	
	}

	public void setNuevoNombre(String nuevoNombre) {
		
	}
	
	 public static void inicializarUsuarios(ArrayList<Usuario> usuarios) {
	  
		 usuarios.add(new Usuario("Joaquín Ruíz", "12349"));
	     
		 usuarios.add(new Usuario("Camila Muñoz", "56738"));
		 
		 usuarios.add(new Usuario("Luca Fernandez", "90876"));
		 
	 }

	public void add(ArrayList<Usuario> usuarios) {
		
	}
	
}
