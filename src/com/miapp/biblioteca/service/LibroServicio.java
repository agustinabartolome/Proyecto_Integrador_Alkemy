/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * PROYECTO INTEGRADOR - POO EN JAVA - ALKEMY
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Mentor: Martin Oviedo
 * Comision: 26
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Alumna: Agustina Bartolomé
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.miapp.biblioteca.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.miapp.biblioteca.Libro;
import com.miapp.biblioteca.Usuario;

public class LibroServicio {

private ArrayList<Libro> miBiblioteca;
	
	public LibroServicio(ArrayList<Libro> miBiblioteca) {

		this.miBiblioteca = miBiblioteca;

	}

	public void crearLibro(String titulo, String autor, String ISBN, String genero) {
		
		Libro libro = new Libro();
		
		libro.setTitulo(titulo);
	
		libro.setAutor(autor);
		
		libro.setISBN(ISBN);
		
		libro.setGenero(genero);
		
		miBiblioteca.add(libro);
		
	}
		
	public ArrayList<Libro> obtenerDatosDelLibro(){
			
			return miBiblioteca;
		
	}
			
	public void actualizarDatosDelLibro( String nuevoTitulo, String nuevoAutor, String ISBN, String nuevoGenero ) { 
			
		boolean libroEncontrado = false;
	    
		for (Libro libro : miBiblioteca) {
	    
			if (libro.getISBN().equals(ISBN)) {
	        
				libro.setTitulo(nuevoTitulo);
	            
				libro.setAutor(nuevoAutor);
	            
				libro.setGenero(nuevoGenero);
	            
				libroEncontrado = true;
	            
				System.out.println("Datos del libro actualizados correctamente:");
	            
				System.out.println(libro);
	            
				break;
	        
			}
	    
		}
	    
		if (!libroEncontrado) {
	    
			System.out.println("Libro con ISBN " + ISBN + " no encontrado en la biblioteca.");
	    
		}
	
	}
	
	/*
		for (Libro libro : miBiblioteca) {
			if (libro.getISBN().equals(ISBN)) {
				
				libro.setNuevoTitulo(nuevoTitulo);
				libro.setNuevoAutor(nuevoAutor);
				libro.setNuevoGenero(nuevoGenero);
					
				}
			}	
		}
		*/
			
	public void eliminarDatosDelLibro (String ISBN) {
			
		Iterator<Libro> it = miBiblioteca.iterator();
		
		 boolean encontrado = false;
			
		 while (it.hasNext()) {
	
			 Libro libro = it.next();
		     
			 if (libro.getISBN().equals(ISBN)) {
		     
				 it.remove();
		         
				 System.out.println("Libro eliminado correctamente.");
		         
				 encontrado = true; 
		         
				 break; 
		        
			 }
		    
		 }

		    if (!encontrado) {
		 
		    	System.out.println("Ese ISBN no se encuentra en nuestra biblioteca.");
		    
		    }
	
	}
		
	public Libro buscarLibroPorISBN (String ISBN) {		

		for (Libro libro : miBiblioteca) {
					
			if (libro.getISBN().equals(ISBN)) {
					
				return libro;
						
				}
				
			}
				
		return null;
		
	}
					
	public ArrayList<Libro> buscarLibroPorTitulo (String titulo){
				
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
				
			for (Libro libro : miBiblioteca) {
					
				if(libro.getTitulo().equalsIgnoreCase(titulo)) {
						
					librosEncontrados.add(libro);
	
					}
			
			}
				
				 return librosEncontrados;
	
	}
			
	public ArrayList<Libro> buscarLibroPorAutor (String autor){
				
			ArrayList<Libro> librosEncontrados = new ArrayList<>();
				
			for (Libro libro : miBiblioteca) {
					
				if(libro.getAutor().equalsIgnoreCase(autor)) {
						
					librosEncontrados.add(libro);
	
					}

			}
				
		 return librosEncontrados;
		
	}
			
	public ArrayList<Libro> buscarLibroPorGenero (String genero){
				
		ArrayList<Libro> librosEncontrados = new ArrayList<>();
				
			for (Libro libro : miBiblioteca) {
					
				if(libro.getGenero().equalsIgnoreCase(genero)) {
						
					librosEncontrados.add(libro);
	
					}
			
			}
				
			return librosEncontrados;
			
	}
			
	public boolean verificarDisponibilidadDelLibro(Libro libro) {
				
			return libro.isDisponible();
	
	}

	public ArrayList<Libro> obtenerTodosLosLibros() {
		
		return miBiblioteca;
	
	}
			
}




