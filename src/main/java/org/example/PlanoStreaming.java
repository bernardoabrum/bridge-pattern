package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class PlanoStreaming {

    protected List<TipoConteudo> conteudos;
    protected double mensalidade;

    public PlanoStreaming(double mensalidadeBase) {
        this.mensalidade = mensalidadeBase;
        this.conteudos = new ArrayList<>();
    }

    public void adicionarConteudo(TipoConteudo conteudo) {
        this.conteudos.add(conteudo);
        this.mensalidade += conteudo.custo();
    }

    public abstract double exibirMensalidade();
    public abstract int exibirNumeroTelas();
}
