package practise_2;

public class Laptop {
    String name;
    int price;
    String currency;

    Laptop(String name, int price, String currency){
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getCurrency() {
        return currency;
    }
    public int getPrice() {
        return price;
    }

    public void printInfo(){
        System.out.println(" Данный ноутбук " + name + " cтоит " +price +  " в валюте "  + currency);
    }
}
