package junit.test.testbasic.calculator;


public class Calculator {

    public double sum(double... numbers){

        double sum = 0;

        if(numbers.length > 0){
            for(double number: numbers){
                sum += number;
            }
        }

         return sum;
    }

    public double squareRoot(double number){
        if(number < 0 ){
            throw new IllegalArgumentException("Não existe raiz quadrada real para numeros negativos!");
        }
        return Math.sqrt(number);
    }

    public Boolean issOdd(int number){
        if (number % 2 != 0){
            return true;
        }
        return false;
    }



}
