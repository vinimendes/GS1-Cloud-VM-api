package br.com.fiap.Global.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.Global.dto.PublicacaoDto;
import br.com.fiap.Global.model.PublicacaoModel;
import br.com.fiap.Global.services.PublicacaoService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/publicacao")
public class PublicacaoController {

	final PublicacaoService publicacaoService;
	
	
	public PublicacaoController(PublicacaoService publicacaoService) {
		this.publicacaoService = publicacaoService;
	}
	
	@PostMapping
	public ResponseEntity<Object> savePublicacao(@RequestBody @Valid PublicacaoDto publicacaoDto) {
		var PublicacaoModel = new PublicacaoModel();
		BeanUtils.copyProperties(publicacaoDto, PublicacaoModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(publicacaoService.save(PublicacaoModel));	
	}
	
	@GetMapping
	public ResponseEntity<List<PublicacaoModel>> getAllUsuario() {
		return ResponseEntity.status(HttpStatus.OK).body(publicacaoService.findAll());
	}
	
}
