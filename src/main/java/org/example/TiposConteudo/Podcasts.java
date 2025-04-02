package org.example.TiposConteudo;

import org.example.TipoConteudo;

public class Podcasts implements TipoConteudo {

    public String descricao() {
        return "Podcasts";
    }

    public double custo() {
        return 5.00;
    }
}
