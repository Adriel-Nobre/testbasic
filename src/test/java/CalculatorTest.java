import junit.test.testbasic.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorTest {



    @Test
    public void retornarZero_Quando_NaoTer_parametros(){

        Calculator calculator = new Calculator();

        double sum = calculator.sum();

        Assertions.assertEquals(0, sum);

    }

    @Test
    public void retornaroSomatorio_Quando_Sum_RecebeValores(){

        Calculator calculator = new Calculator();

        double sum = calculator.sum(3,6);

        Assertions.assertEquals(9, sum);
    }

    @Test
    public void dispara_Exception_quando_numeroMenorQueZero(){

        Calculator calculator = new Calculator();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

        Assertions.assertEquals("Não existe raiz quadrada real para numeros negativos!", exception.getMessage());

    }

    @Test
    public void retorna_Valor_RaizQuadrada(){
        Calculator calculator = new Calculator();

        double result = calculator.squareRoot(4);

        Assertions.assertEquals(2, result);

    }

    @Test
    public void retorna_True_Quando_Numero_Impar(){
        Calculator calculator = new Calculator();

        Boolean impar = calculator.issOdd(3);

        Assertions.assertTrue(impar);
    }

    @Test
    public void retorna_False_Quando_Numero_Par(){
        Calculator calculator = new Calculator();

        Boolean impar = calculator.issOdd(2);

        Assertions.assertFalse(impar);
    }

}



