package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    //List<Car> cars = new ArrayList<>();
    {

        cars.add(new Car(110,1,"Audi"));
        cars.add(new Car(120,2,"BMW"));
        cars.add(new Car(130,3,"Volkswagen"));
        cars.add(new Car(140,4,"Renault"));
        cars.add(new Car(150,5,"Mazda"));
    }
//    public List<Car> getCarList(){
//        return cars;
//    }
    public List<Car> getCarsCount(int count) {
        if(count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
