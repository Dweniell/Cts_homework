public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton instance = Singleton.getInstance();
        instance.doSomething();

        Animal dawg = AnimalFactory.createAnimal("Dog");
        dawg.sound();
    }

}