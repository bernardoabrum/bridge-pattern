package org.example.PlanosStreaming;

import org.example.PlanoStreaming;

public class Intermediario extends PlanoStreaming {

    private static final double mensalidadeBase = 25.00;
    private static final int numeroTelas = 3;

    public Intermediario() {
        super(mensalidadeBase);
    }

    public double exibirMensalidade() {
        return this.mensalidade;
    }

    public int exibirNumeroTelas() {
        return numeroTelas;
    }
}
