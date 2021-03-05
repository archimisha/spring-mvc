package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Service
@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> listOfCars(int count) {
        List<Car> carList = new LinkedList<>();
        carList.add(new Car(1, "BMW", "black"));
        carList.add(new Car(2, "Lada", "red"));
        carList.add(new Car(3, "Toyota", "yellow"));
        carList.add(new Car(4, "Ferrari", "white"));
        carList.add(new Car(5, "Volga", "brown"));
        if (count > 5) {
            return carList;
        }
        List<Car> resultList = carList.subList(0, count);
        return resultList;
    }
}
