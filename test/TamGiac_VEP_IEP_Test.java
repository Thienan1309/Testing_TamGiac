
import static org.junit.Assert.*;        
import testing_tamgiac.Testing_TamGiac;

public class TamGiac_VEP_IEP_Test {
    
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(TamGiac_VEP_IEP_Test.class);
    }
    
    private String run(double a, double b, double c) {
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        return tg.xacThuc();
    }

    // ===== IEP =====
    @org.junit.Test
    public void test_IEP1() {
        double a = 5d, b = 10d, c = 25d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @org.junit.Test
    public void test_IEP2() {
        double a = 25d, b = 5d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @org.junit.Test
    public void test_IEP3() {
        double a = 10d, b = 25d, c = 5d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @org.junit.Test
    public void test_IEP4() {
        double a = -5d, b = 10d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @org.junit.Test
    public void test_IEP5() {
        double a = 10d, b = -5d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @org.junit.Test
    public void test_IEP6() {
        double a = 10d, b = 10d, c = -5d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @org.junit.Test
    public void test_IEP7() {
        double a = 0d, b = 0d, c = 0d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @org.junit.Test
    public void test_IEP8() {
        double a = -1d, b = -5d, c = -10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @org.junit.Test
    public void test_IEP9() {
        double a = 201d, b = 100d, c = 100d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    // ===== VEP (match output SUT) =====
    @org.junit.Test
    public void test_VEP1() {
        double a = 100d, b = 100d, c = 100d;
        String actual = run(a, b, c);
        assertEquals("Tam giac Deu", actual);
    }

    @org.junit.Test
    public void test_VEP2() {
        double a = 50d, b = 50d, c = 80d;
        String actual = run(a, b, c);
        assertEquals("Tam gia can", actual);
    }

    @org.junit.Test
    public void test_VEP3() {
        double a = 80d, b = 50d, c = 80d;
        String actual = run(a, b, c);
        assertEquals("Tam gia can", actual);
    }

    @org.junit.Test
    public void test_VEP4() {
        double a = 50d, b = 80d, c = 80d;
        String actual = run(a, b, c);
        assertEquals("Tam gia can", actual);
    }

    @org.junit.Test
    public void test_VEP5() {
        double a = 30d, b = 40d, c = 50d;
        String actual = run(a, b, c);
        assertEquals("Tam giac thuong", actual);
    }
}
