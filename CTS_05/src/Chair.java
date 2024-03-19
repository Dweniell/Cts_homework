public interface Chair {
    String sitOn();
}

class ModernChair implements Chair{
    @Override
    public String sitOn() {
return "modernchair";
    }
}
class VictorianChair implements Chair{
    @Override
    public String sitOn() {
        return "victorianChair";
    }
}
interface Sofa{
    String lieOn();
}
class ModernSofa implements Sofa{
    @Override
    public String lieOn() {
        return "modernsofa";
    }
}
class VictorianSofa implements Sofa{
    @Override
    public String lieOn() {
        return "victorianSofa";
    }
}
interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}
class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
class Client {
    private final FurnitureFactory furnitureFactory;
    public Client(FurnitureFactory furnitureFactory){
        this.furnitureFactory =furnitureFactory;
    }
    public void useFurniture(){
        Chair chair = furnitureFactory
    }
}
class mainex1{

public static void main(String[] args) {
    FurnitureFactory modernFactory = new ModernFurnitureFactory();
    FurnitureFactory victorianFactory =new VictorianFurnitureFactory();
    System.out.println("client uses modern furniture");
    Client client1
}
        }