public class Main {

    public  static boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 ==0);
    }
    public static  int daysInMonth(int year, String month){
        int days = 0;
        switch (month){
            case "Jan":
            case "Mar":
            case "May":
                days = 31;
                break;
            case "Apr":
            case "Jul":
                days=30;
                break;
            case "Feb":
                days = isLeapYear(year) ? 29 :28;
                break;
            default:
                days = -1;
        }
        return days;
    }

    public  static  void quadratceqation(double a ,double b ,double c ) {
        if (a == 0){
            System.out.println("no can do");
        }

        double d = Math.pow(b , 2) - 4 * a * c;
        if (d < 0){
            System.out.println("no real roots");
        }
        else if (d == 0 ){
            double root = -b / ( 2 * a );
            System.out.println("root 1  " + root);
        }
        else {
            double root1=(-b +Math.sqrt(d))/ (2 * a);
            double root2=(-b +Math.sqrt(d))/ (2 * a);
            System.out.println("root1 " + root1);
            System.out.println("root2 " + root2);
        }
    }

    public  static void diplayEvenNumbers(int bottom, int top){
        if (bottom > top){
            System.out.println("invalid");
        }
        else {
            if (bottom % 2 !=0){
                bottom++;
            }
            for (int i = bottom; i <= top; i+=2){

                    System.out.print(i+" ");

            }
        }
}

    public  static double average (int bottom , int top){
        double sum = 0;
        int counter = 0;
        if ( bottom % 5 != 0 ){
            bottom += 5 - (bottom % 5);
        }
        for (int i = bottom; i <= top; i+=5){
            if (i % 3 != 0 ){
                sum += i;
                counter++;

            }
        }
        return  sum / counter;
    }
    public  static void displayDivisors(int number){
        for (int i = 1; i <= number/2 ;i++){

           if (number % i ==0) {System.out.print(i + " ");}
        }
    }
    public  static int sumDivisors(int number){
        int sum = 0;
        for (int i = 1; i <= number/2 ;i++){

            if (number % i ==0) {
                sum +=i;
            }
        }
        return sum;
    }

    public  static boolean isPerfect(int number){
        return  number == sumDivisors(number);
    }
    public static void diplayPerfectNumbers(int boottom , int top){
        for (int i = boottom; i<= top; i++){
            if (isPerfect(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        //task 1
            int year = 2022 ;
            System.out.println("is " + year + " leap? " + isLeapYear(year));
            int leapYear = isLeapYear(year) ? year : -1;
            System.out.println("leap Year " + leapYear);

        // task 2
        String month = "Feb";
        System.out.println("there are "+daysInMonth(year,month) + " in " + month);

        // task 3
        // a * x ^ 2 + b * x + c = 0

        quadratceqation(2,4,2);

        // task 4
        int bottom=51;
        int top = 150;
        diplayEvenNumbers(bottom , top);

        // task 5
        bottom = 1;
        top= 19;
        System.out.println();
        System.out.println("avr " +average(bottom, top));
        // task 5
        int number = 28;
        displayDivisors(number);

        //task 7
        System.out.println("sum of div" + number + "is " + sumDivisors(number));

        // task 8
        System.out.println("is perfect " + number + " ? "+isPerfect(number));
        //task 9
        diplayPerfectNumbers(1,1000);
    }
}