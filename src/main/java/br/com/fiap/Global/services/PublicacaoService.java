package br.com.fiap.Global.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.Global.model.PublicacaoModel;
import br.com.fiap.Global.repositories.PublicacaorRepository;
import jakarta.transaction.Transactional;

@Service
public class PublicacaoService {

	final PublicacaorRepository publicacaoRepository;
	
	public PublicacaoService(PublicacaorRepository publicacaoRepository) {
		this.publicacaoRepository = publicacaoRepository;
	}
	
	@Transactional
	public PublicacaoModel save(PublicacaoModel publicacaoModel) {
		
		return publicacaoRepository.save(publicacaoModel);
		
	}


	public List<PublicacaoModel> findAll() {
		return publicacaoRepository.findAll();
	}
	
	
}
