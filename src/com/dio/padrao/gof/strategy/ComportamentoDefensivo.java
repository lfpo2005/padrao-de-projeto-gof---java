package com.dio.padrao.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void Mover() {
        System.out.println("Movendo-se Defensivamente...");
    }
}
