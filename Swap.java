public class Swap {
    public static void main(String[] args){
        int a,b,temp;
        a=5;
        b=3;
        System.out.println("Value of a before swap="+a);
        System.out.println("Value of b before swap="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after swap="+a);
        System.out.println("Value of b after swap"+b);
    }
}
