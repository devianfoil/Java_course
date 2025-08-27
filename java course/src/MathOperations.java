public class MathOperations {
    static int add(int x,int y){
        return x+y;
    }

    static int subsctarct(int z,int u){
        return  z-u;
    }

    static  int multiply(int c,int s){
        return c * s;
    }


    static int divide(int b,int n) {
        return b / n;
    }


    //static int findMax(int a,int b){
    //    if (a > b) {
     //       return a;
     //   }
     //   else return b;
    //}


    static int findMaxv2(int a,int b){
        return Math.max(a,b);
    }

    static int difference(int x,int y){
        int z = x - y;
        return Math.abs(z);
    }


    static int squareArea(int side){
      int  squareArea1 = (side*side);
        return squareArea1;
    }

    static  int squarePerimeter(int side){
        int perimetr = side * 4;
        return perimetr;
    }

    static double convertSecondsToMinutes(int seconds){
      double  minutes = seconds/60.0;

        return minutes;
    }


    static double averageSpeed(double distance, double time){
        if (time == 0){
            System.out.println("Время не может быть равно 0");
        }


        double averagesp = distance/time;

        return  averagesp;

    }


    static String findHypotenuse(double a, double b){
        if (a<=0|| b<=0){

            return "Невалидный треуольник";
        }
        return "Гипотенуза равна"+ Math.sqrt(a*a + b*b);

    }


    static double circleCircumference(double radius){
        if (radius<0){
            System.out.println("Невалидный круг");
            return Double.NaN;
        }

        if (radius==0){
            return 0;
        }
        return radius*2*Math.PI;
        }


        static double calculatePercentage(double total, double part) {
            if (total < part) {
                System.out.println("Тотал меньше части");
                return Double.NaN;

            }
            else if  (total < 0) {
                System.out.println(" Тотал меньше 0");
                return Double.NaN;
            }
            else if (total == 0) {
                return 0;
            }


             else if (part == 0) {
                System.out.println(" Делить на 0 нельзя");
                return Double.NaN;
            }

             else if (part < 0) {
                System.out.println(" Часть меньше 0");
                return Double.NaN;
            }



           else return total / part;
        }


        static double celsiusToFahrenheit(double c){
        return c * 9/5 + 32;
        }

    static double fahrenheitToCelsius(double f){
        return (f - 32)*5/9;
    }















    public static void main(String[] args)  {


        //System.out.println(celsiusToFahrenheit(30.8));
        //System.out.println(celsiusToFahrenheit(-67));

       // System.out.println(fahrenheitToCelsius(30.8));
      //  System.out.println(fahrenheitToCelsius(-44.7));
       // System.out.println(fahrenheitToCelsius(0));
      //  System.out.println(celsiusToFahrenheit(0));










        System.out.println(calculatePercentage(200,0));
        System.out.println(calculatePercentage(-5,40));
        System.out.println(calculatePercentage(100,250));
        System.out.println(calculatePercentage(266,46.5));







         //System.out.println(findHypotenuse(0,100));
        //System.out.println(findHypotenuse(0,-10));
        // System.out.println(findHypotenuse(8,9));






        // System.out.println(averageSpeed(5432.42300,5.5));
        //System.out.println(averageSpeed(500,5.5));
        //System.out.println(averageSpeed(7543.12,0));





       // System.out.println(squareArea(5));
        //System.out.println(squarePerimeter(5));

        //System.out.println(findMaxv2(30,40));
        //System.out.println(difference(50,100));


        //System.out.println(add(10,20));
        //System.out.println(subsctarct(10,20));
        //System.out.println(multiply(100,3));
        //System.out.println(divide(100,5));


    }

    }

