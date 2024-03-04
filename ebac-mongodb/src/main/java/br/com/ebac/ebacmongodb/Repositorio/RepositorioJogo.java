package br.com.ebac.ebacmongodb.Repositorio;

import br.com.ebac.ebacmongodb.modelo.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioJogo extends MongoRepository<Jogo, String> {
    long count();
}
