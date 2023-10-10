package service;

import org.springframework.stereotype.Service;
import model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private static final List<Car> carList = List.of(
            new Car(1999, "Mazda", 111),
            new Car(2000, "Audi", 222),
            new Car(1900, "Reno", 333),
            new Car(1995, "BMW", 444),
            new Car(2001, "Porshe", 555)
    );


    @Override
    public List<Car> getCars(int count) {
        if (count == 2) {
            return carList.subList(0, 2);
        } else if (count == 3) {
            return carList.subList(0, 3);
        } else {
         return carList;
        }
    }



}
