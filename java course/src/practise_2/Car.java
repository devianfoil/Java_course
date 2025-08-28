package practise_2;

public class Car {
    String brand;
    int year;


    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    String getBrand(){
        return brand;
    }

    int getYear(){
        return year;
    }

    String setBrand(String newBrand){
        this.brand = newBrand;
        return newBrand;
    }

    int setYear(int newyear){
        this.year = newyear;
        return newyear;
    }



}
