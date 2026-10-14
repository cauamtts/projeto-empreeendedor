package br.com.senai.infoa.backend.projeto_empreendedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_empreendedor.repositories.Empreendedorrepository;

@Service 
public class EmpreendedorService {
    
    @Autowired 
    private Empreendedorrepository empreendedorRepository;

        public Long contar () {
        return empreendedorRepository.count();
    }
}