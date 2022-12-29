import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionTest {

    private letterGrade tester;
    @Before
    public void setup(){
        tester = new letterGrade();
    }
    @Test
    public void TestPartition_1() {
        assertEquals('F', tester.letterGrade(0));
    }

    @Test
    public void TestPartition_2() {
        assertEquals('F', tester.letterGrade(59));
    }

    @Test
    public void TestPartition_3() {
        assertEquals('D', tester.letterGrade(60));
    }

    @Test
    public void TestPartition_4() {
        assertEquals('D', tester.letterGrade(69));
    }

    @Test
    public void TestPartition_5() {
        assertEquals('C', tester.letterGrade(70));
    }

    @Test
    public void TestPartition_6() {
        assertEquals('C', tester.letterGrade(79));
    }

    @Test
    public void TestPartition_7() {
        assertEquals('B', tester.letterGrade(80));
    }

    @Test
    public void TestPartition_8() {
        assertEquals('B', tester.letterGrade(89));
    }

    @Test
    public void TestPartition_9() {
        assertEquals('A', tester.letterGrade(90));
    }

    @Test
    public void TestPartition_10() {
        assertEquals('A', tester.letterGrade(100));
    }

    @Test
    public void TestPartition_11() {
        assertEquals('X', tester.letterGrade(-1));
    }

    @Test
    public void TestPartition_12() {
        assertEquals('X', tester.letterGrade(101));
    }
}