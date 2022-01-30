package com.dio.padrao.gof.singleton;
/*
* Singleton "preguiçoso"
* @author lfpo2005
* */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
