package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.api.model.CozinhasXMLWrapper;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @GetMapping()
    public List<Cozinha> listar(){
        return cozinhaRepository.listar();

    }
    @GetMapping("/{cozinhaId}")
    public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId){
        Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
        if (cozinha != null){
            return ResponseEntity.ok(cozinha);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public CozinhasXMLWrapper listarXML(){
        return new CozinhasXMLWrapper(cozinhaRepository.listar());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionar(@RequestBody Cozinha cozinha){
        cozinhaRepository.salvar(cozinha);
    }
}
