package one.digitalinnovation.gof.singleton;

public class TesteSigleton {
    public static void main(String[] args) {
        //Testes relacionados ao desing pattern singleton:

        SigletonLazy lazy = SigletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SigletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

    }
}
