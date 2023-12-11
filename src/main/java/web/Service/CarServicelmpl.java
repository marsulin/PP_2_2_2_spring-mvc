package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServicelmpl implements CarService {
  private List<Car> car;

  {
    car = new ArrayList<>();

    car.add(new Car(1, "VW", "White"));
    car.add(new Car(2, "Mercedes", "Red"));
    car.add(new Car(3, "Lada", "Orange"));
    car.add(new Car(4, "Naval", "Black"));
    car.add(new Car(5, "Nissan", "Green"));
  }
  public List<Car> certainCars(int numberOfCars){


    if(numberOfCars <= 0 || numberOfCars > 5){
      return car;
    } else {
      return car.stream().limit(numberOfCars).collect(Collectors.toList());
    }
  }
}