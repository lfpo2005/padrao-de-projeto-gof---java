package com.dio.padrao.gof.singleton;
/*
* Singleton "apressado"
* @author lfpo2005
* */
public class SingletonEager {

    private static SingletonEager instancia  = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
