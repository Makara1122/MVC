package model;

public class Engine {
    private String brandEngine;
    private Integer year;
    private Float price;

    public String getBrandEngine(){
        return this.brandEngine;
    }

    public void setBrandEngine(String brandEngine) {
        this.brandEngine = brandEngine;
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

    public void speed(){
        System.out.println("500 host power and 120 kh/h ");
    }
    public void sound(){
        System.out.println("Deep sound terrrrrrrrrr .... ");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "brandEngine='" + brandEngine + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
