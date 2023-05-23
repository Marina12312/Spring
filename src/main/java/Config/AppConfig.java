package Config;

import Transport.Bus;
import Transport.Car;
import Transport.Pickup;
import driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
   public Car getCarBean(){
        return new Car("CAR");
    }
    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Pickup");
    }
    @Bean
    public Bus getBusBean() {
        return new Bus("BUS");
    }
    @Bean(name = "driverCar")
    public Driver getDriverCarBean() {
        return new Driver("Mari", getCarBean());
    }
    @Bean(name = "driverBus")
    public Driver getDriverBusBean() {
        return new Driver("Vasyl", getBusBean());
    }

    @Bean(name = "driverPickup")
    public Driver getDriverPickupBean() {
        return new Driver("Petya", getPickupBean());
    }

}
