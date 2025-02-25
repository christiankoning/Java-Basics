public class InheritanceAndPolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(90, 60);
        vehicle1.drive();

        Car car1 = new Car("Mercedes", 120, 80);
        car1.drive();

        Vehicle vehicle2 = new Car("Audi", 80, 50);
        vehicle2.drive();
    }
}

class Vehicle {
    int speed;
    int fuel;

    public Vehicle(int speed, int fuel) {
        setSpeed(speed);
        setFuel(fuel);
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 300) {
            System.out.println("Invalid speed.");
        }
        else {
            this.speed = speed;
        }
    }

    public void setFuel(int fuel) {
        if (fuel < 0 || fuel > 100) {
            System.out.println("Invalid fuel.");
        } else {
            this.fuel = fuel;
        }
    }

    public void drive()
    {
        System.out.println("This vehicle is driving. Speed: " + speed + " Fuel: " + fuel);
    }
}

class Car extends Vehicle {

    String brand;

    public Car(String brand, int speed, int fuel) {
        super(speed, fuel);
        setBrand(brand);
    }

    public void setBrand(String brand) {
        if (brand == null || brand.length() < 2 || brand.length() > 50 || !brand.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid brand.");
        }
        else {
            this.brand = brand;
            System.out.println("Brand is updated to: " + brand);
        }
    }

    @Override
    public void drive() {
        System.out.println("The car is driving. Speed: " + speed + " Fuel: " + fuel);
    }
}
