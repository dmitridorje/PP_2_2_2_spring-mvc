package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDao = carDAO;
    }

    @Override
    public List<Car> getMyCars(int count) {
        if (count < 1 || count > 5) {
            return carDao.getMyCars();
        }
        return carDao.getMyCars().stream().limit(count).collect(Collectors.toList());
    }
}
