import Config.AppConfig;
import Transport.Transport;
import driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Transport transport = context.getBean("Car", Transport.class);
        Transport transport1 = context.getBean("Bus", Transport.class);
        Transport transport2 = context.getBean("Pickup", Transport.class);

        System.out.println(transport + " готов");
        System.out.println(transport1 + " готов");
        System.out.println(transport2 + " готов");

        Driver driver = context.getBean("driverCar", Driver.class);
        Driver driver1 = context.getBean("driverBus", Driver.class);
        Driver driver2 = context.getBean("driverPickup", Driver.class);

        System.out.println(driver);
        System.out.println(driver1);
        System.out.println(driver2);

    }
}
