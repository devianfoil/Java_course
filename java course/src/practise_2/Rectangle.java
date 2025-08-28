package practise_2;

public class Rectangle {
    int width;
    int height;


    Rectangle(int somewidth,int someheight){
        this.width = somewidth;
        this.height = someheight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    int SetWitght(int randomwight ){
        this.width = randomwight;
        return randomwight;
    }


    public int CalculateArea(){
        return this.width * this.height;
    }
}
