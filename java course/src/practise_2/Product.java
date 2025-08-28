package practise_2;

public class Product {
    String name;
    int price;

    Product(String name,int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int applyDiscount(int discount){
        return this.price = this.price - (this.price * discount / 100);
    }

    public void printInfo(){
        System.out.println("Текущая цена у товара" + name + "равна"+price);
    }

}
