package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    Car car1 = new Car(1, "BMW", "Green");
    Car car2 = new Car(2, "Lada", "White");
    Car car3 = new Car(3, "Ferrari", "Red");
    Car car4 = new Car(4, "Belaz", "Yellow");
    Car car5 = new Car(5, "Toyota", "Black");

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam("count") int count,
                            ModelMap model) {
        List<Car> cars = new ArrayList<>();
        switch (count) {
            case 1:
                cars.add(car1);
                break;
            case 2:
                cars.add(car1);
                cars.add(car2);
                break;
            case 3:
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                break;
            case 4:
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);
                break;
            default:
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);
                cars.add(car5);
                break;
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
