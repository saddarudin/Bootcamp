import com.bootcamp.Addition;

import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void sum() {
        int result=Addition.sum(77,34);
        int correct=111;
        assertEquals(correct,result);
    }
}