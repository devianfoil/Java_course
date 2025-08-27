class Calculator{
     int sum(int x,int y){
        return x +y;
    }

    int minus(int x,int y){
         return x-y;
    }

    int delenie(int x1,int y1){
         return x1/y1;
    }

    public static void main(String[] args) {
         Calculator pasha = new Calculator();
        int sum1 = pasha.sum(10,20);


        int minus1 = pasha.minus(40,50);

        System.out.println(sum1);
        System.out.println(minus1);

    }


    }
