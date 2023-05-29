package Transport;

public class Pickup extends Transport {

    public Pickup(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(this.getModel() + " старт");
    }
}
