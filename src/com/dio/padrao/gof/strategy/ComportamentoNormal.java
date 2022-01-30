package com.dio.padrao.gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void Mover() {
        System.out.println("Movendo-se Normalmente...");
    }
}
