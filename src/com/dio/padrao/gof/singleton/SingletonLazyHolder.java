package com.dio.padrao.gof.singleton;
/*
* Singleton "Lazy Holder"
*
*@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
*
* @author lfpo2005
* */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
