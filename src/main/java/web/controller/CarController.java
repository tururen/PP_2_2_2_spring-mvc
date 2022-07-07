package web.controller;

import dao.CarDaoImpl;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService service = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = service.listCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
