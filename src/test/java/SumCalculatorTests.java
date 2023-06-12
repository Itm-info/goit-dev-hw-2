import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTests {
    private SumCalculator calc;

    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }

    @Test
    public void testSumCalculator_3(){
        Assertions.assertEquals(-5, calc.sum(-3) );
    }
    @Test
    public void testSumCalculator1(){
        Assertions.assertEquals(1, calc.sum(1) );
    }
    @Test
    public void testSumCalculator4(){
        Assertions.assertEquals(10, calc.sum(4) );
    }
    @Test
    public void testSumCalculator0(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
