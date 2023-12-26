package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("XRay", "белый", "хетчбек"));
        cars.add(new Car("Citroen", "чёрный", "седан"));
        cars.add(new Car("Ford", "зелёный", "SUV"));
        cars.add(new Car("Kia", "оранжевый", "универсал"));
        cars.add(new Car("Toyota", "красный", "4WD"));
    }

    @Override
    public List<Car> getMyCars(int count) {
        if (count < 1 || count > 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
