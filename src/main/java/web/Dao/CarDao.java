package web.Dao;

import Model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    List<Car> cars = new ArrayList<>();
    {

        cars.add(new Car(110,1,"Audi"));
        cars.add(new Car(120,2,"BMW"));
        cars.add(new Car(130,3,"Volkswagen"));
        cars.add(new Car(140,4,"Renault"));
        cars.add(new Car(150,5,"Mazda"));
    }
    public List<Car> getCarList(){
        return cars;
    }
}
