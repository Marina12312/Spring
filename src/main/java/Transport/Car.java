package Transport;

public class Car extends Transport {
    public Car (String model){
        super(model);
    }

    @Override
    public void start() {
        System.out.println(this.getModel() + " старт");

    }


}
