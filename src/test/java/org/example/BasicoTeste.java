package org.example;

import org.example.PlanosStreaming.Basico;
import org.example.TiposConteudo.Filmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicoTeste {

    @Test
    void deveRetornarInformacaoPlanoBasico1() {
        PlanoStreaming plano = new Basico();
        TipoConteudo filmes = new Filmes();
        plano.adicionarConteudo(filmes);
        assertEquals(30.00, plano.exibirMensalidade());
        assertEquals(2, plano.exibirNumeroTelas());
    }
}
