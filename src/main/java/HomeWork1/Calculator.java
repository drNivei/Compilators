package HomeWork1;


public class Calculator {

    public double addCalc(double a, double b){
        return a+b;
    }

    public double subtractCalc(double a, double b){
        return a-b;

    }

    public double multiplyCalc(double a, double b){
        return a * b;

    }

    public double divideCalc(double a, double b) {
        if(b==0){
            throw new ArithmeticException("На ноль делить нельзя!");
        }else{
            return a / b;
        }
    }

}


