package br.com.fiap.Global.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.Global.model.UsuarioModel;
import br.com.fiap.Global.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class UsuarioService {
	
	final UsuarioRepository usuarioRepository;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Transactional
	public UsuarioModel save(UsuarioModel bairroModel) {
		
		return usuarioRepository.save(bairroModel);
		
	}


	public List<UsuarioModel> findAll() {
		return usuarioRepository.findAll();
	}
	
	
	public Optional<UsuarioModel> findByEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}
	
}
