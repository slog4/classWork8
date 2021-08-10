import com.company.Car;
import com.company.Plane;
import com.company.Ship;
import com.company.Vehicle;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Vehicle vehicle = new Vehicle(100,1000,90,date);
        System.out.println(vehicle);
        System.out.println("_____________________________");
        Plane plane = new Plane(200,1500,400,date,1900,300);
        System.out.println(plane);
        System.out.println("---------------------------------------------------");
        Car car = new Car(100,2,80,date,3000);
        System.out.println(car);
        System.out.println("---------------------------------------------------");
        Ship ship = new Ship(3000,300,120,date,5000, "Odessa");
        System.out.println(ship);
        System.out.println("\n");

        Vehicle[] garaje = new Vehicle[4];
        garaje[0] = vehicle;
        garaje[1]= plane;
        garaje[2]= car;
        garaje[3]=ship;
        for (int i = 0; i < garaje.length ; i++) {
            System.out.println(garaje[i]);

        }

    }
}
