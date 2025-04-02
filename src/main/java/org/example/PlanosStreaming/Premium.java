package org.example.PlanosStreaming;

import org.example.PlanoStreaming;

public class Premium extends PlanoStreaming {

    private static final double mensalidadeBase = 35.00;
    private static final int numeroTelas = 4;

    public Premium() {
        super(mensalidadeBase);
    }

    public double exibirMensalidade() {
        return this.mensalidade;
    }

    public int exibirNumeroTelas() {
        return numeroTelas;
    }
}
