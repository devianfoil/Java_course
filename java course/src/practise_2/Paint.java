package practise_2;

public class Paint {
    int x;
    int y;

    Paint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println("Координаты по Осям:" + x + y);
    }
}