import org.junit.Test;
import static org.junit.Assert.*;
import testing_tamgiac.Testing_TamGiac;

public class TamGiac_BVA_Test {
    private String run(double a, double b, double c) {
        Testing_TamGiac tg = new Testing_TamGiac(a, b, c);
        return tg.xacThuc();
    }

    @Test
    public void BVA01() {
        double a = -1d, b = 10d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA02() {
        double a = 10d, b = -1d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA03() {
        double a = 10d, b = 10d, c = -1d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA04() {
        double a = 0d, b = 10d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA05() {
        double a = 10d, b = 0d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA06() {
        double a = 10d, b = 10d, c = 0d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA07() {
        double a = 0d, b = 0d, c = 0d;
        String actual = run(a, b, c);
        assertEquals("InvalidInput", actual);
    }

    @Test
    public void BVA08() {
    double a = 1d, b = 10d, c = 10d;
    String actual = run(a, b, c);
    assertEquals("Tam gia can", actual);
}

    @Test
    public void BVA09() {
    double a = 10d, b = 1d, c = 10d;
    String actual = run(a, b, c);
    assertEquals("Tam gia can", actual);
}

    @Test
    public void BVA10() {
    double a = 10d, b = 10d, c = 1d;
    String actual = run(a, b, c);
    assertEquals("Tam gia can", actual);
}

    @Test
    public void BVA11() {
    double a = 1d, b = 1d, c = 1d;
    String actual = run(a, b, c);
    assertEquals("Tam giac Deu", actual);
}

    @Test
    public void BVA12() {
        double a = 2d, b = 3d, c = 6d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA13() {
        double a = 6d, b = 2d, c = 3d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA14() {
        double a = 3d, b = 6d, c = 2d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA15() {
        double a = 2d, b = 3d, c = 5d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA16() {
        double a = 5d, b = 2d, c = 3d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA17() {
        double a = 3d, b = 5d, c = 2d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA18() {
        double a = 5d, b = 5d, c = 10d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA19() {
        double a = 10d, b = 5d, c = 5d;
        String actual = run(a, b, c);
        assertEquals("NotATriangle", actual);
    }

    @Test
    public void BVA20() {
        double a = 2d, b = 3d, c = 4d;
        String actual = run(a, b, c);
        assertEquals("Tam giac thuong", actual);
    }

    @Test
    public void BVA21() {
        double a = 4d, b = 2d, c = 3d;
        String actual = run(a, b, c);
        assertEquals("Tam giac thuong", actual);
    }

    @Test
    public void BVA22() {
        double a = 3d, b = 4d, c = 2d;
        String actual = run(a, b, c);
        assertEquals("Tam giac thuong", actual);
    }

    @Test
    public void BVA23() {
    double a = 5d, b = 5d, c = 9d;
    String actual = run(a, b, c);
    assertEquals("Tam gia can", actual);
}

    @Test
    public void BVA24() {
    double a = 9d, b = 5d, c = 5d;
    String actual = run(a, b, c);
    assertEquals("Tam gia can", actual);
}

    @Test
    public void BVA25() {
    double a = 5d, b = 5d, c = 5d;
    String actual = run(a, b, c);
    assertEquals("Tam giac Deu", actual);
}

}