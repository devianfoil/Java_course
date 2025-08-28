package practise_2;

public class Circle {
    int radius;


    Circle(int radius){
        this.radius=radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int  getRadius(){
        return  radius;
    }

    public double calculateArea(){
        return radius * Math.pow(Math.PI, 2);
    }

    public double calculateCircumference(){
        return radius * Math.PI*2;
    }

}
