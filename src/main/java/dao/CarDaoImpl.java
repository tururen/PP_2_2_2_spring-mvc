package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("mercedex", "sl500", 1950));
        cars.add(new Car("BMP", "gl500", 2100));
        cars.add(new Car("Audo", "A1", 2022));
        cars.add(new Car("Lada", "vespa", 2000));
        cars.add(new Car("Ford", "Fotus", 1990));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return new ArrayList<Car>(cars.stream().limit(count).toList());
    }
}

