import calculator.operations.Difference;
import calculator.operations.Divide;
import calculator.operations.Multiply;
import calculator.operations.Sum;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void gettingZeroWithZeroValuesSum() {
        Sum sum1 = new Sum(0,0);
        Assert.assertEquals("0 + 0 должен равняться 0", 0, sum1.getResult(0,0), 0);
    }

    @Test
    public void gettingZeroWithZeroValuesDifference() {
        Difference diff1 = new Difference(0,0);
        Assert.assertEquals("0 - 0 должен равняться 0", 0, diff1.getResult(0,0), 0);
    }

    @Test
    public void gettingExceptionWithZeroValuesDivide() {
        Divide div1 = new Divide(0,0);
        Assert.assertEquals("0 / 0 не должен давать никакого результата", Double.NaN, div1.getResult(0,0), 0);
    }

    @Test
    public void gettingZeroWithZeroValuesMultiply() {
        Multiply mult1 = new Multiply(0,0);
        Assert.assertEquals("0 * 0 должен равняться 0", 0, mult1.getResult(0,0), 0);
    }

    @Test
    public void gettingNegativeResultSum() {
        Sum sum1 = new Sum(0,0);
        Assert.assertEquals("1 + (-9) должен равняться -8", -8, sum1.getResult(1,-9), 0);
    }

    @Test
    public void gettingNegativeResultDifference() {
        Difference diff1 = new Difference(0,0);
        Assert.assertEquals("12 - 18 должен равняться -6", -6, diff1.getResult(12,18), 0);
    }

    @Test
    public void gettingNegativeResultDivide() {
        Divide div1 = new Divide(0,0);
        Assert.assertEquals("100 / (-25) должен равняться -4", -4, div1.getResult(100,-25), 0);
    }

    @Test
    public void gettingNegativeResultMultiply() {
        Multiply mult1 = new Multiply(0,0);
        Assert.assertEquals("-140 * 0.1 должен равняться -14.0", -14.0, mult1.getResult(-140,0.1), 0);
    }

    @Test
    public void gettingPositiveResultSum() {
        Sum sum1 = new Sum(0,0);
        Assert.assertEquals("4 + 116 должен равняться 120", 120, sum1.getResult(4,116), 0);
    }

    @Test
    public void gettingPositiveResultDifference() {
        Difference diff1 = new Difference(0,0);
        Assert.assertEquals("-3 - (-38) должен равняться 35", 35, diff1.getResult(-3,-38), 0);
    }

    @Test
    public void gettingPositiveResultDivide() {
        Divide div1 = new Divide(0,0);
        Assert.assertEquals("80 / 10 должен равняться 8", 8, div1.getResult(80,10), 0);
    }

    @Test
    public void gettingPositiveResultMultiply() {
        Multiply mult1 = new Multiply(0,0);
        Assert.assertEquals("3.5 * 11.1 должен равняться 38.85", 38.85, mult1.getResult(3.5,11.1), 0);
    }

}