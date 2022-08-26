package web.service;

import web.Dao.CarDao;
import Model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDao();


    @Override
    public List<Car> getCarsCount(List<Car> cars, int count) {
        if(count > 5) {
            carDao.getCarList();
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
