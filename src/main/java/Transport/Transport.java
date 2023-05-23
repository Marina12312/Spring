package Transport;

import lombok.Getter;

@Getter
public abstract class Transport {
    private String model;

    public Transport (String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }
    public abstract void start();

    @Override
    public String toString() {
        return model ;
    }
}
