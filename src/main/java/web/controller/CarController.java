package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;
    private final CarDao carDao;
@Autowired
    public CarController(CarServiceImpl carService, CarDao carDao) {
        this.carService = carService;
        this.carDao = carDao;
    }

    @GetMapping( "/cars")
    public String getCar(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model){
    model.addAttribute("cars",carService.getCarsCount(carDao.getCarList(),count));
    return "cars";
}
}
