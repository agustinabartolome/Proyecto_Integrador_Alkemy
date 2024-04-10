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

public class Libro {
	
	private String titulo;
	
	private String autor;
	
	private String ISBN;
	
	private String genero;
	
	private boolean disponible;
	
	
	public Libro(String titulo, String autor, String ISBN, String genero) {

		this.titulo = titulo;
	
		this.autor = autor;
		
		this.ISBN = ISBN;
		
		this.genero = genero;
		
		this.disponible = true;
	
	}

	public Libro() {
		
	}

	public String getTitulo() {
	
		return titulo;
	
	}

	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	
	}

	public String getAutor() {

		return autor;
	
	}

	public void setAutor(String autor) {

		this.autor = autor;
	
	}

	public String getISBN() {
	
		return ISBN;
	
	}

	public void setISBN(String ISBN) {
	
		this.ISBN = ISBN;
	
	}

	public String getGenero() {
	
		return genero;
	
	}

	public void setGenero(String genero) {
	
		this.genero = genero;
	
	}

	public boolean isDisponible() {
	
		return disponible;
	
	}

	public void setDisponible(boolean disponible) {
	
		this.disponible = disponible;
	
	}

	@Override

	public String toString() {
	
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", genero=" + genero
		
				+ ", disponible=" + disponible + "]";
	
	}

	public void setNuevoTitulo(String nuevoTitulo) {
			
	}

	public void setNuevoAutor(String nuevoAutor) {
			
	}

	public void setNuevoGenero(String nuevoGenero) {
		
	}
	
	public static void inicializarLibros(ArrayList<Libro> libros) {
	    
		libros.add(new Libro("Los lobos del águila", "Simon Scarrow", "9788435018760", "Ficción histórica"));
	    
		libros.add(new Libro("Un lugar soleado para gente sombria", "Mariana Enriquez", "9788433922861", "Ficción moderna y contemporánea"));
	    
	}
	
	
	
	
}
