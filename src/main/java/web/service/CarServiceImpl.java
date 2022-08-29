package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private CarDaoImpl carDaoImpl;

    public CarServiceImpl(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @Override
    public List<Car> getCarsCount(int count) {

            return carDaoImpl.getCarsCount(count);
        }

    }

