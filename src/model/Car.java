package model;

public class Car {
    private String brand;
    private Integer year;
    private Float price;
    private Engine engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(){}
    public Car(Engine engine){
        this.engine = engine;
    }
    public void showEngineSpeed(){
        engine.speed();
    }
    public void showEngineSound(){
        engine.sound();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}
