import java.time.LocalDate;

public class Car {
    private String makeCar;
    private int yearOfManufacture;
    private double price;
    private BodyType bodyType;


    public Car(String make, int yearOfManufacture, double price, Enum bodyType) {
        this.makeCar = String.valueOf(make);
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.bodyType = (BodyType) bodyType;
    }

    public void setMakeCar(String makeCar) {
        this.makeCar = makeCar;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String getMakeCar() {
        return makeCar;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }




    public Object bodyTypeIdentification() {

        switch (bodyType) {
            case SEDAN:
                return "легковой классындагы машина";
            case HATCHBACK:
                return "легковой классындагы машина2";
            case CROSSOVER:
                return "внедорожник классындагы машина";
            case SUV:
                return "внедорожник классындагы машина2";
            case STATION_WAGON:
                return "универсал классындагы машина";
            default:
                return "Башка типтеги машина жок";
        }


        //determinationoYearOfManufacture методу, азыркы жыл LocalDate now getYear
    }
    public int  determinationoYearOfManufacture(){
        LocalDate now = LocalDate.now();
        return now.getYear() - yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make: " + makeCar + '\'' +
                ", yearOfManufacture:  " + yearOfManufacture +
                ", price:  " + price +
                ", bodyType:  " + bodyType +
                '}';
    }
}
