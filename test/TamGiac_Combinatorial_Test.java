

import org.junit.Test;
import static org.junit.Assert.*;
import testing_tamgiac.Testing_TamGiac;

public class TamGiac_Combinatorial_Test {

    @Test
    public void TH01() {
        double a = 3, b = 4, c = 5;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("Tam giac thuong", actual);
    }

    @Test
    public void TH02() {
        double a = -5, b = -2, c = -3;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH03() {
        double a = 0, b = 0, c = 0;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH04() {
        double a = 10, b = 0, c = -5;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH05() {
        double a = 10, b = -5, c = 0;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH06() {
        double a = 0, b = 10, c = -5;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH07() {
        double a = -5, b = 0, c = 10;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH08() {
        double a = 0, b = -5, c = 10;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void TH09() {
        double a = -5, b = 10, c = 0;
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        String actual = tg.xacThuc();
        assertEquals("InvalidInput", actual);
    }
}
