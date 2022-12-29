import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoundaryTest {
    private letterGrade tester;
    @Before
    public void setup(){
        tester = new letterGrade();
    }

    @Test
    public void TestBoundary_1() {
        assertEquals('F', tester.letterGrade(0));
    }

    @Test
    public void TestBoundary_2() {
        assertEquals('D', tester.letterGrade(60));
    }

    @Test
    public void TestBoundary_3() {
        assertEquals('C', tester.letterGrade(70));
    }

    @Test
    public void TestBoundary_4() {
        assertEquals('B', tester.letterGrade(80));
    }

    @Test
    public void TestBoundary_5() {
        assertEquals('A', tester.letterGrade(90));
    }

    @Test
    public void TestBoundary_6() {
        assertEquals('A', tester.letterGrade(100));
    }
}