package com.algaworks.algafood.api.controller;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("cozinhas/por-nome")
    public List<Cozinha> cozinhasPorNome( String nome){
            return cozinhaRepository.findTodasByNomeContaining(nome);
    }

    @GetMapping("cozinhas/unico-por-nome")
    public Optional <Cozinha> cozinhaPorNome(String nome){
        return cozinhaRepository.findByNome(nome);
    }

    @GetMapping("restaurantes/por-taxa-frete")
    public List <Restaurante> restaurantesPorTaxaFrete(BigDecimal taxaInicial, BigDecimal taxaFinal){
        return restauranteRepository.findByTaxaFreteBetween(taxaInicial, taxaFinal);
    }

    @GetMapping("restaurantes/por-nome")
    public List <Restaurante> restaurantesNomeCozinha(String nome, Long cozinhaId){
        return restauranteRepository.findByNomeContainingAndCozinhaId(nome, cozinhaId);
    }

    @GetMapping("restaurantes/por-nome-e-frete")
    public List <Restaurante> restaurantesNomeFrete(String nome, BigDecimal taxaInicial, BigDecimal taxaFinal){
        return restauranteRepository.find(nome, taxaInicial, taxaFinal);
    }


    @GetMapping("restaurantes/com-frete-gratis")
    public List <Restaurante> restaurantesNomeFrete(String nome){

        return restauranteRepository.findAllFreteGratis(nome);
    }


    @GetMapping("restaurantes/primeiro")
    public Optional<Restaurante> restaurantesPrimeiro(){

        return restauranteRepository.buscarPrimeiro();
    }

}
