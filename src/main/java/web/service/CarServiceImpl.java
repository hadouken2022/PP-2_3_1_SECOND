package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsCount(int count) {

        return carDao.getCarsCount(count);
    }

}

