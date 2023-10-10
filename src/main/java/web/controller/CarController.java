package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;


@Controller
@RequestMapping
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, ModelMap modelMap) {
        modelMap.addAttribute("carList", carService.getCars(count));
        return "cars";

    }
}
