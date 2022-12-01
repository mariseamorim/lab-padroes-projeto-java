package one.digitalinnovation.gof.singleton;

/**
 * Sigleton "Lazy Holder"
 * Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
 */
public class SingletonLazyHolder {
    private static class  InstanceHolder{
        private static  SingletonLazyHolder instancia  = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return  InstanceHolder.instancia;
    }
}
