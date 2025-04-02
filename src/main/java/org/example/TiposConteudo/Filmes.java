package org.example.TiposConteudo;

import org.example.TipoConteudo;

public class Filmes implements TipoConteudo {

    public String descricao() {
        return "Filmes";
    }

    public double custo() {
        return 15.00;
    }
}
