public class Main {
    //private static Enum BodyType;

    public static void main(String[] args) {

        Car car1 = new Car("Tesla", 2019, 67000, BodyType.SEDAN);
        Car car2 = new Car("Honda", 2020, 27000, BodyType.HATCHBACK);
        Car car3 = new Car("Camry", 2021, 87000, BodyType.CROSSOVER);
        Car car4 = new Car("Lexus", 2022, 347000, BodyType.SUV);
        Car car5 = new Car("Opel", 2023, 70000, BodyType.STATION_WAGON);


        Car[] cars = {car1, car2, car3,car4,car5};
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("YearOfManufacture SEDAN:  "+car1.determinationoYearOfManufacture());
        System.out.println("YearOfManufacture HATCHBACK:  "+car2.determinationoYearOfManufacture());
        System.out.println("YearOfManufacture CROSSOVER:   "+car3.determinationoYearOfManufacture());
        System.out.println("YearOfManufacture SUV:  "+car4.determinationoYearOfManufacture());
        System.out.println("YearOfManufacture STATION_WAGON: "+car5.determinationoYearOfManufacture());

        System.out.println("SEDAN:  "+car1.bodyTypeIdentification());
        System.out.println(" HATCHBACK:  "+car2.bodyTypeIdentification());
        System.out.println("CROSSOVER: "+car3.bodyTypeIdentification());
        System.out.println("SUV:  "+car4.bodyTypeIdentification());
        System.out.println("STATION_WAGON:  "+car5.bodyTypeIdentification());
    }


  /*  public Main(String[] args, int yearOfManufacture) {


    }*/
}