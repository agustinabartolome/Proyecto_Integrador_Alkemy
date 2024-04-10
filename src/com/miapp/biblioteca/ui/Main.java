/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * PROYECTO INTEGRADOR - POO EN JAVA - ALKEMY
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Mentor: Martin Oviedo
 * Comision: 26
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Alumna: Agustina Bartolomé
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.miapp.biblioteca.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.miapp.biblioteca.Libro;
import com.miapp.biblioteca.Usuario;
import com.miapp.biblioteca.service.LibroServicio;
import com.miapp.biblioteca.service.UsuarioServicio;

public class Main {

    public static void main(String[] args) {

        ArrayList<Libro> miBiblioteca = new ArrayList<>();
        LibroServicio libroServicio = new LibroServicio(miBiblioteca);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        UsuarioServicio usuarioServicio = new UsuarioServicio(usuarios);

        Libro.inicializarLibros(miBiblioteca);
        Usuario.inicializarUsuarios(usuarios);

        
        Scanner scan = new Scanner(System.in);

        String titulo;
        String autor;
        String ISBN;
        String genero;

        String nuevoTitulo;
        String nuevoAutor;
        String nuevoISBN;
        String nuevoGenero;
        
        String buscarTitulo;
        String buscarAutor;
        String buscarISBN;
        String buscarGenero;

        String eliminarISBN;

        String nombre;
        String numeroDeIdentificacion;

        String nuevoNombre;
        String nuevoNumeroDeIdentificacion;

        String numeroDeIdentificacionUsuario;
        
        String buscarNumeroIdentificacion;
        
        String eliminarNumeroDeIdentificacion;
        
        String isbnPrestamo;
        
        String numeroDeIdentificacionUsuarioIndicado;
        
        String isbnDevolucion;

        char eleccion;
        
        do {
            
        	System.out.println("*********************************************");
            
        	System.out.println("**** BIENVENIDOS A LA BIBLIOTECA VIRTUAL ****");
            
        	System.out.println("*********************************************");
            
        	System.out.println("****** Elija una opción para comenzar  ******");
            
        	System.out.println("A: Sección libros");
            
        	System.out.println("B: Sección usuarios");
            
        	System.out.println("C: Salir");
            
        	System.out.println("Ingrese su opción: ");
            
        	eleccion = scan.next().charAt(0);

            switch (eleccion) {

                case 'A':
                    int opcionLibros;
                    
                    ArrayList<Libro> librosCreados;

                    do {
            
                    	System.out.println("*********************************************************");
                        
                    	System.out.println("**Menú de opciones de la sección libros de la biblioteca**");
                        
                    	System.out.println("*********************************************************");
    					
                    	System.out.println("****** Elija una opción para comenzar  ******");
                        
                    	System.out.println("1. Agregar un libro a la biblioteca");
                        
                    	System.out.println("2. Actualizar los datos de un libro de la biblioteca");
                        
                    	System.out.println("3. Buscar un libro por el título");
                        
                    	System.out.println("4. Buscar un libro por el autor");
                        
                    	System.out.println("5. Buscar un libro por el ISBN");
                        
                    	System.out.println("6. Buscar un libro por género");
                        
                    	System.out.println("7. Eliminar los datos de un libro de la biblioteca");
                        
                    	System.out.println("8. Mostrar un listado de todos los libros de la biblioteca");
                        
                    	System.out.println("9. Salir");
                        
                    	System.out.println("Ingrese su opción: ");

                        opcionLibros = scan.nextInt();
                        
                        scan.nextLine();

                        switch (opcionLibros) {

                            case 1:
                            	
                                System.out.println("Ingrese el título del libro: ");
                                titulo = scan.nextLine();

                                System.out.println("Ingrese el autor del libro: ");
                                autor = scan.nextLine();

                                System.out.println("Ingrese el ISBN del libro: ");
                                ISBN = scan.nextLine();

                                System.out.println("Ingrese el genero del libro: ");
                                genero = scan.nextLine();

                                libroServicio.crearLibro(titulo, autor, ISBN, genero);

                                librosCreados = libroServicio.obtenerDatosDelLibro();

                                for (Libro libro : librosCreados) {
                        
                                	System.out.println(libro);
                                }

                            break;

                            case 2:
                            //Actualizar datos de un libro
                            
                            	System.out.println("Ingrese el título del nuevo libro: ");
                                nuevoTitulo = scan.nextLine();

                                System.out.println("Ingrese el autor del nuevo libro: ");
                                nuevoAutor = scan.nextLine();

                                System.out.println("Ingrese el ISBN del nuevo libro: ");
                                nuevoISBN = scan.nextLine();

                                System.out.println("Ingrese el genero del nuevo libro: ");
                                nuevoGenero = scan.nextLine();

                                libroServicio.actualizarDatosDelLibro(nuevoTitulo, nuevoAutor, nuevoISBN, nuevoGenero);

                                //librosCreados = libroServicio.obtenerDatosDelLibro();

                                /*
                                  
                                for (Libro libro : librosCreados) {
                                    System.out.println(libro);
                                }
                                
                                */

                            break;

                            case 3:
                            //Buscar libro por titulo
                                
                            	System.out.println("Ingrese el título del libro que desea buscar: ");
                                
                            	//scan.nextLine(); 
                                
                            	buscarTitulo = scan.nextLine();
                                
                            	ArrayList<Libro> librosPorTitulo = libroServicio.buscarLibroPorTitulo(buscarTitulo);

                                if (!librosPorTitulo.isEmpty()) {
                                
                                	System.out.println("Hemos encontrado los siguientes títulos: ");
                                    
                                	for (Libro libro : librosPorTitulo) {
                                    
                                		//System.out.println(libro.getTitulo() + (" ") + libro.getAutor());
                                        
                                		System.out.println("Título: " + libro.getTitulo() + ",  Autor: " + libro.getAutor());
                                    
                                	}
                                
                                } else {
                                
                                	System.out.println("Ningún libro encontrado con ese título.");
                                }

                            break;

                            case 4:
							//Buscar un libro por el autor
                            		
								System.out.println("Ingrese el autor del libro que desea buscar: ");
								buscarAutor = scan.nextLine();
								
								ArrayList <Libro> librosPorAutor = libroServicio.buscarLibroPorAutor(buscarAutor);
								
								if (!librosPorAutor.isEmpty()) {
								
									System.out.println("Hemos encontrado los siguientes títulos del autor: " );
									
									for (Libro libro : librosPorAutor) {
									
										//System.out.println(libro.getAutor( )+ (" ") + libro.getTitulo());
										
										System.out.println("Autor: " + libro.getAutor() + ",  Titulo: " + libro.getTitulo());
									
									}
									
									} else {
									
										System.out.println("Ningún libro encontrado correspondiente a ese autor");
									
									}
							break;
							
                            case 5:
							//Buscar un libro por el ISBN
								
								System.out.println("Ingrese el ISBN del libro que desea buscar: ");
								buscarISBN = scan.nextLine();
								
								Libro libroISBN = libroServicio.buscarLibroPorISBN(buscarISBN);
								
								if (libroISBN != null) {
								
									System.out.println("Hemos encontrado el libro: " + libroISBN.getTitulo());
									
								} else {
								
									System.out.println("No se pudo encontrar el libro.");
									
								}
								
							break;
							
							case 6:
							
							//Buscar un libro por el género
								
								System.out.println("Ingrese el género del libro que desea buscar: ");
								buscarGenero = scan.nextLine();

								ArrayList <Libro> libroGenero = libroServicio.buscarLibroPorGenero(buscarGenero);
								
								if (libroGenero != null) {
								
									System.out.println("Hemos encontrado los siguientes libros del genero '" + buscarGenero + "':");
									
									for (Libro libro : libroGenero) {
									
										System.out.println("Título: " + libro.getTitulo() + ",  Autor: " + libro.getAutor());
									
									}
									
								} else {
								
									System.out.println("No se pudo encontrar libros del genero '" + buscarGenero + "'.");
									
								}
								
							break;
							
							case 7:
							//Eliminar los datos de un libro
								
								System.out.println("Ingrese el ISBN del libro que desea eliminar: ");
								eliminarISBN = //scan.next();
										scan.nextLine();
								
								libroServicio.eliminarDatosDelLibro(eliminarISBN);
								
								librosCreados = libroServicio.obtenerDatosDelLibro();
										
										for (Libro libro : librosCreados) {
											
											System.out.println("El nuevo listado de libros es el siguiente: " + libro.getTitulo() + libro.getAutor() + libro.getISBN() + libro.getGenero());
											//System.out.println(libro);
											
										}			
								
							break;
							
							case 8:
							//Mostrar un listado de todos los libros de la biblioteca
								
								ArrayList<Libro> listaDeLibros = libroServicio.obtenerTodosLosLibros();
							
								for (Libro libro : listaDeLibros) {
								
									System.out.println(libro.getTitulo() + "(Autor:" + libro.getAutor() + (" ISBN:")  +  libro.getISBN() + (" Genero:")  +  libro.getGenero() + ")");
									
								}
								
							break;

                            case 9:
                                
                            	System.out.println("Gracias por utilzar la sección de libros de la Biblioteca.");
                            
                            break;

                            default:
                            
                            	System.out.println("Opción inválida. Intente nuevamente.");
                           
                            break;
                        
                        }

                    } while (opcionLibros != 9);

                    break;

			
			case 'B':
				//Seccion usuario
					
					int opcionUsuarios;

					do {
					
						System.out.println("***********************************************************");
					
						System.out.println("**Menú de opciones de la sección usuarios de la biblioteca**");
					
						System.out.println("************************************************************");
					
						System.out.println("****** Elija una opción para comenzar  ******");
					
						System.out.println("1. Agregar un usuario a la biblioteca");
			        
						System.out.println("2. Actualizar los datos de un usuario de la biblioteca");
			        
						System.out.println("3. Buscar un usuario por el número de identificacion");
			        
						System.out.println("4. Eliminar los datos de un usuario de la biblioteca");
			        
						System.out.println("5. Mostrar un listado de todos los usuarios de la biblioteca");
			        
						System.out.println("6. Prestamos de libros por un usuario de la biblioteca");
			    
						System.out.println("7. Devoluciones de libros por un usuario de la biblioteca");
			        
						System.out.println("8. Salir");
			
						System.out.println("Ingrese su opción: ");
					
					opcionUsuarios =  scan.nextInt();
					//scan.nextInt();
					scan.nextLine();
					
					switch (opcionUsuarios) {
					
					case 1: 
						//Agregar un usuario a la biblioteca
						
						System.out.println("Ingrese el nombre del usuario: ");
						nombre = scan.nextLine();
						
						System.out.println("Ingrese el numero de identificacion del usuario: ");
						numeroDeIdentificacion = scan.nextLine();
						
						usuarioServicio.crearUsuario(nombre, numeroDeIdentificacion);
						
						ArrayList<Usuario> usuariosCreados = usuarioServicio.obtenerDatosDelUsuario();
						
						for (Usuario usuario : usuariosCreados) {
							
							System.out.println(usuario);
							
						}
						
					break;
					
					case 2: 
					//Actualizar los datos de un usuario de la biblioteca
						
						System.out.println("Ingrese el número de identificación del usuario que desea actualizar: ");
					    numeroDeIdentificacion = scan.nextLine();
					
					    System.out.println("Ingrese el nombre del nuevo usuario: ");
					    nuevoNombre = scan.nextLine();
					    
					    System.out.println("Ingrese el nuevo número de identificación del usuario: ");
					    nuevoNumeroDeIdentificacion = scan.nextLine();
					    
					    usuarioServicio.actualizarDatosDelUsuario(numeroDeIdentificacion, nuevoNombre, nuevoNumeroDeIdentificacion);
					    
					break;
					
					case 3:
					//Buscar un usuario por el numero de identificacion
						
						System.out.println("Ingrese el numero de identificacion del usuario que desea buscar: ");
						buscarNumeroIdentificacion = scan.nextLine();
					
						Usuario usuarioIdentificacion = usuarioServicio.buscarUsuarioPorNumeroDeIdentificacion(buscarNumeroIdentificacion);
						
						if (usuarioIdentificacion != null) {
						
							System.out.println("Hemos encontrado el usuario " + usuarioIdentificacion.getNombre());
							
						} else {
						
							System.out.println("No se pudo encontrar el usuario.");
							
						}
						
					break;
					
					case 4: 
					//Eliminar los datos de un usuario de la biblioteca
						
						System.out.println("Ingrese el numero de identificacion del usuario que desea eliminar: ");
						eliminarNumeroDeIdentificacion = //scan.next();
								scan.nextLine();
								
						usuarioServicio.eliminarDatosDelUsuario(eliminarNumeroDeIdentificacion);
						
						usuariosCreados = usuarioServicio.obtenerDatosDelUsuario();
						
						System.out.println("El nuevo listado de usuarios es el siguiente: ");
								
								for (Usuario usuario : usuariosCreados) {
									
									System.out.println(usuario);
									
								}
								
					break;

					case 5:
					//Mostrar un listado de todos los usuarios de la biblioteca
						
						ArrayList<Usuario> listaDeUsuarios = usuarioServicio.obtenerTodosLosUusarios();
					
						for (Usuario usuario : listaDeUsuarios) {
						
							System.out.println("Usuario: " + usuario.getNumeroDeIdentificacion() + "(" + usuario.getNombre() + ")");
							
						}
						
					break;
					
					case 6: 
					//Prestamos
					
						System.out.println("Ingrese el número de identificación del usuario: ");
						numeroDeIdentificacionUsuario = scan.nextLine();
						
						Usuario usuarioPrestamo = usuarioServicio.buscarUsuarioPorNumeroDeIdentificacion(numeroDeIdentificacionUsuario);
						
						if (usuarioPrestamo != null) {
						
							System.out.println("Ingrese ISBN del libro a prestar: ");
							
							isbnPrestamo = scan.nextLine();
							
							Libro libroPrestamo = libroServicio.buscarLibroPorISBN(isbnPrestamo);
							
							if (libroPrestamo != null) {
							
								if(libroServicio.verificarDisponibilidadDelLibro(libroPrestamo)) {
								
									usuarioServicio.prestarLibro(usuarioPrestamo, libroPrestamo);
									
									//System.out.println("El préstamo ha sido exitoso. El libro fue adquirido por " + usuarioPrestamo.getNombre());
								
								}else {
								
									System.out.println("El libro no se encuentra disponible para préstamo.");
								
								}
					
							}else {
							
								System.out.println("Libro no encontrado en el sistema de la biblioteca");
							
							}
				
						} else {
						
							System.out.println("Usuario no encontrado en el sistema de la biblioteca");
						
						}
						
					break;
				
					case 7: 
					//Devoluciones
					
						System.out.println("Ingrese el número de identificación del usuario: ");
						numeroDeIdentificacionUsuarioIndicado = scan.nextLine();
						
						Usuario usuarioDevolucion = usuarioServicio.buscarUsuarioPorNumeroDeIdentificacion(numeroDeIdentificacionUsuarioIndicado);
						
						if (usuarioDevolucion != null) {
						
							System.out.println("Ingrese ISBN del libro a devolver: ");
							
							isbnDevolucion = scan.nextLine();
							
							Libro libroDevolucion = libroServicio.buscarLibroPorISBN(isbnDevolucion);
							
							if (libroDevolucion != null) {
							
								usuarioServicio.devolverLibro(usuarioDevolucion, libroDevolucion);
								
								//System.out.println("La devolución se ha completado correctamente. El libro ha sido devuelto por " + usuarioDevolucion.getNombre());
							
							} else {
							
								System.out.println("El libro con el ISBN no se ha encontrado en la biblioteca.");
							
							}
							
						} else { 
						
							System.out.println("Usuario con numero de identificacion " + numeroDeIdentificacionUsuarioIndicado + " no se ha encontrado en la biblioteca.");
							
						}
					
					break;
					
					case 8: 
					
						System.out.println("Gracias por utilzar la sección de usuarios de la Biblioteca.");
					
					break;
					
					default:
					
						System.out.println("Opcioón inválida. Intente nuevamente.");
			  
					}
			
			        
					} while (opcionUsuarios != 8);
			
			        
					break;
			
                case 'C':
            
                	System.out.println("Gracias por consultar la biblioteca.");
                    
                break;

                default:
                
                	System.out.println("Opción inválida. Intente nuevamente.");
                
                break;
            
            }

        } while (eleccion != 'C');
        
        scan.close(); 
    
        }
    
}
