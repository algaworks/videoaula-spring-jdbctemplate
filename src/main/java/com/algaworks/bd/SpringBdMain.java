package com.algaworks.bd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.algaworks.bd.repositorio.UsuarioRepositorio;

public class SpringBdMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBdMain.class.getPackage().getName());
		
		UsuarioRepositorio repo = applicationContext.getBean(UsuarioRepositorio.class);
		
		repo.listar().forEach(u -> System.out.println("Método listar(): " + u));
		
		System.out.println("Método buscar(Integer): " + repo.buscar(4));
		
		applicationContext.close();
		
		System.out.println("Fim!");
	}
}
