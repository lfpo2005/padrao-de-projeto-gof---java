package com.dio.padrao.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void Mover() {
        System.out.println("Movendo-se Agressivamente...");
    }
}
