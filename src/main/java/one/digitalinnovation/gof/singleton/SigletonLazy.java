package one.digitalinnovation.gof.singleton;

/**
 * Sigleton "preguiçoso"
 * Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
 */

public class SigletonLazy {
    private static  SigletonLazy instancia;

    private SigletonLazy(){
        super();
    }

    public static SigletonLazy getInstance(){
        if(instancia  == null){
            instancia = new SigletonLazy();
        }
        return  instancia;
    }
}
