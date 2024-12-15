package HW5_3;

import java.util.List;

public class CarTask {
    public void repairPower(List<Car> cars) {
        cars.stream().limit(cars.size()/2).forEach(car -> car.setPower((int)(car.getPower()*1.1)));
    }

    public void chekDriver(List<Car> cars) {
        cars.forEach(car -> {
            Owner owner = car.getOwner();
            if (owner.getDrivingEXP()<5 && owner.getAge()>25){
                owner.setDrivingEXP(owner.getDrivingEXP()+1);
                System.out.println("Водій"+" "+owner.getName()+" "+ "на курсах");
            }
        });
    }

    public double calcTotalPrice(List<Car> cars) {
        return cars.stream().mapToDouble(Car::getPrice).sum();
    }
}
