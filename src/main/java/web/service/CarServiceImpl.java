package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDao = carDAO;
    }

    @Override
    public List<Car> getMyCars(int count) {
        return carDao.getMyCars(count);
    }
}
