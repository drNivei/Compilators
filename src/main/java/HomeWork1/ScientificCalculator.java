package HomeWork1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.LongStream;

public class ScientificCalculator extends Calculator {

    public double power(double a, double b){
        return Math.pow(a,b);
    }

    public double sqrt(double a) throws IllegalArgumentException{
        return Math.sqrt(a);
    }

    public double factorial(int n) throws IllegalArgumentException{
        return LongStream.rangeClosed(1, n).reduce(1, (long x, long y) -> x * y);
    }

    public double evaluateExpression(String expr) throws IllegalArgumentException{
        List<String> str = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(expr);
        String op = st.nextToken();
        String mid = "";

        while(st.hasMoreTokens()){
                mid = mid + " " + op;
                op = st.nextToken();
                if(op.equals("+") || op.equals("-")){
                    str.add(mid);
                    mid = "";
                }
        }
        str.add(mid + " " + op);
        str.set(0,"+" + str.get(0));
        //System.out.println(str);
        return parseDivMult(str);
    }

    public double parseDivMult(List<String> str){
        double total_res = 0;

        for(String x: str){

            StringTokenizer stt = new StringTokenizer(x);

            String sign = stt.nextToken();
            double res = Integer.parseInt(stt.nextToken());

            String op1 = "";
            double mid1 = 0;

            while (stt.hasMoreTokens()){
                op1 = stt.nextToken();
               //System.out.println("Operation " + op1);
                mid1 = Integer.parseInt(stt.nextToken());
                //System.out.println("Number " + mid1);
                if(op1.equals("*")){
                    res = multiplyCalc(res, mid1);
                    //System.out.println("Total " + res);
                }else if(op1.equals("/")){
                    res = divideCalc(res, mid1);
                    //System.out.println("Total " + res);
                }else {
                    throw new IllegalArgumentException("Unsupported operator: " + mid1);
                }
            }
            if (sign.equals("+")){
                total_res = addCalc(total_res,res);
            } else if (sign.equals("-")) {
                total_res = subtractCalc(total_res,res);
            }else {
                throw new IllegalArgumentException("Unsupported operator: " + mid1);
            }
        }
        return total_res;
    }

}


