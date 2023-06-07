package br.com.fiap.Global.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.Global.dto.UsuarioDto;
import br.com.fiap.Global.model.UsuarioModel;
import br.com.fiap.Global.services.UsuarioService;
import jakarta.validation.Valid;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	final UsuarioService usuarioService;
	
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<Object> saveUsuario(@RequestBody @Valid UsuarioDto usuariodto) {
		var UsuarioModel = new UsuarioModel();
		BeanUtils.copyProperties(usuariodto, UsuarioModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(UsuarioModel));	
	}
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> getAllUsuario() {
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<Object> getByEmail(@PathVariable(value = "email") String email) {
		Optional<UsuarioModel> UsuarioModelOptional = usuarioService.findByEmail(email);
		if(!UsuarioModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(UsuarioModelOptional.get());
		
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Object> getByEmail(@PathVariable(value = "id") int id) {
		Optional<UsuarioModel> UsuarioModelOptional = usuarioService.findById(id);
		if(!UsuarioModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		}
		return ResponseEntity.status(HttpStatus.OK).body(UsuarioModelOptional.get());
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUsuario(@PathVariable(value = "id") int id) {
		Optional<UsuarioModel> UsuarioModelOptional = usuarioService.findById(id);
		if(!UsuarioModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
		}
		usuarioService.delete(UsuarioModelOptional.get());
		return ResponseEntity.status(HttpStatus.OK).body("Usuario deleted."); 
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> putUsuario(@PathVariable(value = "id") int id,
											@RequestBody @Valid UsuarioDto usuarioDto) {

		Optional<UsuarioModel> UsuarioModelOptional = usuarioService.findById(id);
		if(!UsuarioModelOptional.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario Not Found");
		}
		
		var UsuarioModel = new UsuarioModel();
		BeanUtils.copyProperties(usuarioDto, UsuarioModel);
		return ResponseEntity.status(HttpStatus.OK).body(usuarioService.save(UsuarioModel));
		
	}
	
	
}
