public class Typecast {
    public static void main(String args[]){
    byte a = 10;
    byte b = 5;
    byte c = 5;
    int d = a * b /c;
    System.out.println(d);

     byte byteV = 42;
     char charV = 'a';//97
     short shortV = 1024;
     int intV = 50_000;
     float floatV = 5.5f;
     double doubleV= .5d;
     double result = (floatV * byteV) + (intV / charV) - (doubleV * shortV);
     System.out.println("(floatV * byteV= "+ (floatV * byteV) + "+ (intV / charV) +" + (intV / charV) + " - (doubleV * shortV)" + (doubleV * shortV) );
    System.out.println("result=" + result);
    System.out.println(intV);
    }
}
