package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarDao {
    public List<Car> getCarsCount(int count);
}
