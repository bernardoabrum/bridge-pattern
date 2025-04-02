package org.example.PlanosStreaming;

import org.example.PlanoStreaming;

public class Basico extends PlanoStreaming {

    private static final double mensalidadeBase = 15.00;
    private static final int numeroTelas = 2;

    public Basico() {
        super(mensalidadeBase);
    }

    public double exibirMensalidade() {
        return this.mensalidade;
    }

    public int exibirNumeroTelas() {
        return numeroTelas;
    }
}

