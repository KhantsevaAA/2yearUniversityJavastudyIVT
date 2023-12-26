package org.example.lab1.task4;

class BuilderService {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println("\nCar built:\n" + car.getCarType());        
        System.out.println(car.toString());


        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.0, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car1 = builder.getResult();
        System.out.println("\nCar built:\n" + car1.getCarType());        
        System.out.println(car1.toString());
        
        // Создание второго объекта
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
        builder.setEngine(new Engine(3.5, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator("New York to Los Angeles"));
        Car car2 = builder.getResult();
        System.out.println("\nCar built:\n" + car2.getCarType());        
        System.out.println(car2.toString());
    }
}