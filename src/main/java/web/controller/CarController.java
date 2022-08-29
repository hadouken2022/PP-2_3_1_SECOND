package web.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

@Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping( "/cars")
    public String getCar(@RequestParam(value = "count",defaultValue = "5") int count, ModelMap model){
    model.addAttribute("cars",carService.getCarsCount(count));
    return "cars";
}
}
