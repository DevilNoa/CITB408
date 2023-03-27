public class Bool {
    public static void main(String args[]){
        boolean b;
        b = false;
        System.out.println("b is b "+ b);
        b = true;
        System.out.println("b is b "+ b);
        if (b) System.out.println("expected");
        b = false;
        if (b) System.out.println("unexpected");
        System.out.println("10 > 9 is " +(10>9));
    }
}
