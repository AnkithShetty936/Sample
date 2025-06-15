public class Calculator {
   // int sum;

    public int Add(int a,int b){
         int sum=a+b;
         //System.out.println(sum);
         return sum;
    }
    public double Sub(float a, float b){
        double result= a-b;
        //System.out.println(result);
        return result;
    }
    public double Mul(long a, long b){
        double result= a*b;
        return result;
    }
    public float Div(float a, float b){
        double result= a/b;
        return(float) result;
    }


    public static void main(String[] args){
        Calculator a1= new Calculator();
        //a1.Add(4,2);
        System.out.println("Addition operation="+a1.Add(4,2));
        //a1.Sub(8,4);
        System.out.println("Subtraction operation="+a1.Sub(4,2));
        System.out.println("Multiplication operation="+a1.Mul(4,2));
        System.out.println("Multiplication operation="+a1.Div(4,2));
    }
}
