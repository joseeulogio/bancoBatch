package com.beeva.bancoBatch.job.fileProcessor.process;



import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.bancoBatch.job.fileProcessor.model.Cliente;
import com.beeva.bancoBatch.job.fileProcessor.model.ClienteDatos;








@Component
public  class FileProcess implements ItemProcessor <Cliente,ClienteDatos>{

	public ClienteDatos process(Cliente cli) throws Exception {
		ClienteDatos cliDa=new ClienteDatos();
		cliDa.setNombre(cli.getNombre());
		cliDa.setApellido(cli.getApellido());
		
		return cliDa;
	}

}