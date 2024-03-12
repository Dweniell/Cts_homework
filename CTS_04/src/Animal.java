public interface Animal {
void sound();
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("barf");
    }
}
class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("mew");
    }
}
class AnimalFactory{
    public static Animal createAnimal(String type){
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        }else if("Cat".equalsIgnoreCase(type)){
            return new Cat();
        }else {
            throw new IllegalArgumentException("invalid animal type");
        }
    }
}

