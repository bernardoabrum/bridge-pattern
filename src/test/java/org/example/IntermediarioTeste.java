package org.example;

import org.example.PlanosStreaming.Intermediario;
import org.example.TiposConteudo.Filmes;
import org.example.TiposConteudo.Lives;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntermediarioTeste {

    @Test
    void deveRetornarInformacaoPlanoIntermediario1() {
        PlanoStreaming plano = new Intermediario();
        TipoConteudo filmes = new Filmes();
        plano.adicionarConteudo(filmes);
        assertEquals(40.00, plano.exibirMensalidade());
        assertEquals(3, plano.exibirNumeroTelas());
    }

    @Test
    void deveRetornarInformacaoPlanoIntermediario2() {
        PlanoStreaming plano = new Intermediario();
        TipoConteudo filmes = new Filmes();
        TipoConteudo lives = new Lives();
        plano.adicionarConteudo(filmes);
        plano.adicionarConteudo(lives);
        assertEquals(50.00, plano.exibirMensalidade());
        assertEquals(3, plano.exibirNumeroTelas());
    }
}
