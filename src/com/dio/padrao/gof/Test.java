package com.dio.padrao.gof;

import com.dio.padrao.gof.facade.Facade;
import com.dio.padrao.gof.singleton.SingletonEager;
import com.dio.padrao.gof.singleton.SingletonLazy;
import com.dio.padrao.gof.singleton.SingletonLazyHolder;
import com.dio.padrao.gof.strategy.*;

import java.awt.*;

public class Test {
    public static void main(String[] args) {

        //  Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("------------------------------------------");

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("------------------------------------------");

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        System.out.println("------------------------------------------");
        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();
        System.out.println("------------------------------------------");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println("------------------------------------------");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("------------------------------------------");

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Fernando", "14600-000");





    }

}
