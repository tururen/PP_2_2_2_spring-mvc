package service;

import dao.CarDaoImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars(int count) {
        return new CarDaoImpl().listCars(count);
    }
}
