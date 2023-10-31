import org.concordion.integration.junit4.ConcordionRunner;
import org.example.Calculadora;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class CalculadoraTest {
    private Calculadora calculator = new Calculadora();

    public int somar(int a, int b) {
        return calculator.somar(a, b);
    }

    public int subtrair(int a, int b) {
        return calculator.subtrair(a, b);
    }

}