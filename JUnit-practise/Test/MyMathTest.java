import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {
    MyMath myMath=new MyMath();

    @Test
    public void sum1() {
        assertEquals(6,myMath.sum(new int[] {1,2,3}));
    }
    @Test
    public void sum2() {
        assertEquals(0,myMath.sum(new int[] {}));
    }
}