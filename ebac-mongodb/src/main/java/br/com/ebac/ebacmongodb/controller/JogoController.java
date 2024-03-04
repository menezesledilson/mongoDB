package br.com.ebac.ebacmongodb.controller;

import br.com.ebac.ebacmongodb.modelo.Jogo;
import br.com.ebac.ebacmongodb.servico.ServicoJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/jogos")
public class JogoController {
    @Autowired
    private ServicoJogo servicoJogo;

    @PostMapping
    public Jogo criaJogo(@RequestBody Jogo jogo) {
        return servicoJogo.criaJogo(jogo);
    }
    @GetMapping("/count")
    public Long contaJogos() {
        return  servicoJogo.count();
    }
}
