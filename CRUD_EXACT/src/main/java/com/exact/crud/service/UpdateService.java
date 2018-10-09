package com.exact.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
	
	private final Logger logger = LoggerFactory.getLogger(UpdateService.class);
	
	private final String mensaje = "Está actualizando"; 
		
	public String update() {
		logger.info(mensaje);
		return mensaje;
	}
	
	public void chauMundo() {
		logger.info("Chau Mundo");
    
	public void holaMundoExact() {
	}
}
