package br.com.ebac.ebacmongodb.servico;


import br.com.ebac.ebacmongodb.Repositorio.RepositorioJogo;
import br.com.ebac.ebacmongodb.modelo.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = RepositorioJogo.class)
public class ServicoJogo {
    @Autowired
    private RepositorioJogo repositorioJogo;
    public Jogo criaJogo(Jogo jogo){
        return repositorioJogo.insert(jogo);

    }
    public long count(){
        return repositorioJogo.count();
    }
}
