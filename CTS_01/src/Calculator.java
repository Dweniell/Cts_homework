import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    //implementat
    public double calculateX5PlusY7() throws IOException {
        double result = 0.0;
        System.out.println("X:");
        double firstParam =readParam();
        System.out.println("Y:");
        double secondParam =readParam();
        double pow5 =pow(firstParam,5);
        double pow7= pow(secondParam,7);
        result = pow5 + pow7;

        return result;
    }
    public double readParam() throws IOException {
        double result=0.0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        result = Double.parseDouble(reader.readLine());
        return result;
    }
    public double pow(double parameter,int power){
        for (int i = 1; i <power; i++) {
            parameter *=parameter;
        }
        return parameter;
    }
    public static void main(String[] args) throws IOException {
        Calculator object=new Calculator();
        System.out.println(object.calculateX5PlusY7());
    }

}
