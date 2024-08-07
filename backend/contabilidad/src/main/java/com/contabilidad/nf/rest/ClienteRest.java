package com.contabilidad.nf.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contabilidad.nf.domain.model.Cliente;
import com.contabilidad.nf.service.ClienteService;

@RestController
@RequestMapping(value="/Clientes")
public class ClienteRest {
	
		@Autowired
		private ClienteService clienteService;
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Long id) {
			
			Cliente cliente = clienteService.buscar(id);
			return ResponseEntity.ok().body(cliente);
			//return "Rest está funcionando";
		}	
		
}
