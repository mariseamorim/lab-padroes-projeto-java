package one.digitalinnovation.gof.singleton;

/**
 * Sigleton "apressado"
 * Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
 */
public class SingletonEager {
    private static  SingletonEager instancia  = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return  instancia;
    }
}
