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

public class UsuarioServicio {
	
private ArrayList<Usuario> usuarios;
	
	public UsuarioServicio(ArrayList<Usuario> usuarios) {

		this.usuarios = usuarios;

	}

	public void crearUsuario(String nombre, String numeroDeIdentificacion) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre(nombre);
	
		usuario.setNumeroDeIdentificacion(numeroDeIdentificacion);

		usuarios.add(usuario);
		
	}
		
		public ArrayList<Usuario> obtenerDatosDelUsuario(){
			
			return usuarios;

		}
		
		public void actualizarDatosDelUsuario(String numeroDeIdentificacion, String nuevoNombre, String nuevoNumeroDeIdentificacion) {
		
			boolean usuarioEncontrado = false;
		    
			for (Usuario usuario : usuarios) {
		    
				if (usuario.getNumeroDeIdentificacion().equals(numeroDeIdentificacion)) {
		        
					usuario.setNombre(nuevoNombre);
		            
					usuario.setNumeroDeIdentificacion(nuevoNumeroDeIdentificacion);
		            
					System.out.println("Datos del usuario actualizados correctamente:");
		            
					System.out.println(usuario);
		            
					usuarioEncontrado = true;
		            
					break;
		        
				}
		    
			}
		    
			if (!usuarioEncontrado) {
		    
				System.out.println("Usuario con número de identificación " + numeroDeIdentificacion + " no encontrado en la biblioteca.");
		    
			}
		
		}
	
		public void eliminarDatosDelUsuario (String numeroDeIdentificacion) {
			
			Iterator<Usuario> it = usuarios.iterator();
			
			boolean usuarioEncontrado = false;
			
			while (it.hasNext()) {

				Usuario usuario = it.next();
				
				if(usuario.getNumeroDeIdentificacion().equals(numeroDeIdentificacion)){
				
					it.remove();
					
					System.out.println("Usuario eliminado correctamente.");
		            
					usuarioEncontrado = true; 
		            
					break; 
					
				}
				
			}
			
			if (!usuarioEncontrado) {
			
				System.out.println("Ese numero de identificacion no se encuentra en nuestra biblioteca.");
				
			}
			
			}
		
			public void prestarLibro(Usuario usuario, Libro libro) {
		
				if (usuario != null && libro != null)
				{
			        if (verificarDisponibilidadDelLibro(libro)) {
			           
			        	usuario.getLibrosPrestados().add(libro); 
			            
			        	libro.setDisponible(false); 
			            
			        	System.out.println("El préstamo ha sido exitoso. El libro fue adquirido por " + usuario.getNombre());
			        
			        } else {
			        
			        	System.out.println("El libro no se encuentra disponible para préstamo.");
			        
			        }
			    
				} else {
			    
					System.out.println("El usuario o libro no se encuentran en nuestra biblioteca.");
			    
				}
				
			}
			
		private boolean verificarDisponibilidadDelLibro(Libro libro) {
				
				return true;
			}

		public Usuario buscarUsuarioPorNumeroDeIdentificacion(String numeroDeIdentificacion) {
			
			for (Usuario usuario : usuarios) {
				
				if (usuario.getNumeroDeIdentificacion().equals(numeroDeIdentificacion))  {
					
					return usuario;
				}
		
			}
			
			return null;
		}	
			
		public void devolverLibro(Usuario usuario, Libro libro) {
			
			if (usuario != null && libro != null) {
			
			if(usuario.getLibrosPrestados().contains(libro)) {
				
				usuario.getLibrosPrestados().remove(libro);
				
				libro.setDisponible(true);
				
				System.out.println("La devolución del libro se ha completado correctamente. El libro ha sido devuelto por " + usuario.getNombre());
			
			} else {
				
				System.out.println("El usuario no tiene prestado el libro con el ISBN ingresado.");
			
			}
			
			} else {
				
				System.out.println("El usuario o el libro no se encuentran en nuestra biblioteca.");
		    }
		
		}
						
		public ArrayList<Libro> obtenerLibrosPrestados(Usuario usuario){
			
			return usuario.getLibrosPrestados();
			
		}

		public ArrayList<Usuario> obtenerTodosLosUusarios() {
			
			return usuarios;
		
		}

}
