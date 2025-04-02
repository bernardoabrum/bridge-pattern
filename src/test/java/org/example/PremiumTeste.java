package org.example;

import org.example.PlanosStreaming.Premium;
import org.example.TiposConteudo.Filmes;
import org.example.TiposConteudo.Lives;
import org.example.TiposConteudo.Podcasts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiumTeste {

    @Test
    void deveRetornarInformacaoPlanoPremium1() {
        PlanoStreaming plano = new Premium();
        TipoConteudo filmes = new Filmes();
        plano.adicionarConteudo(filmes);
        assertEquals(50.00, plano.exibirMensalidade());
        assertEquals(4, plano.exibirNumeroTelas());
    }

    @Test
    void deveRetornarInformacaoPlanoPremium2() {
        PlanoStreaming plano = new Premium();
        TipoConteudo filmes = new Filmes();
        TipoConteudo lives = new Lives();
        plano.adicionarConteudo(filmes);
        plano.adicionarConteudo(lives);
        assertEquals(60.00, plano.exibirMensalidade());
        assertEquals(4, plano.exibirNumeroTelas());
    }

    @Test
    void deveRetornarInformacaoPlanoPremium3() {
        PlanoStreaming plano = new Premium();
        TipoConteudo filmes = new Filmes();
        TipoConteudo lives = new Lives();
        TipoConteudo podcasts = new Podcasts();
        plano.adicionarConteudo(filmes);
        plano.adicionarConteudo(lives);
        plano.adicionarConteudo(podcasts);
        assertEquals(65.00, plano.exibirMensalidade());
        assertEquals(4, plano.exibirNumeroTelas());
    }
}
