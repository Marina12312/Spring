package Transport;

public class Bus extends  Transport{

    public Bus(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(this.getModel() + " старт");
    }
}
