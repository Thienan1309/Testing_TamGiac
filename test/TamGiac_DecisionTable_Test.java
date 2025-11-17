
import org.junit.Test;
import static org.junit.Assert.*;
import testing_tamgiac.Testing_TamGiac;

public class TamGiac_DecisionTable_Test {
    private String run(double a, double b, double c) {
        return new Testing_TamGiac(a, b, c).xacThuc();
    }

    // =========================
    // A) RULE-BASED (A1..A5)
    // =========================

    // A1: C1 = F  => InvalidInput
    @Test public void DT_A1_InvalidInput() {
        double a = 0, b = 5, c = 5;              // C1: false (có 0)
        assertEquals("InvalidInput", run(a,b,c));
    }

    // A2: C1=T, C2=F  => NotATriangle
    @Test public void DT_A2_NotATriangle() {
        double a = 2, b = 3, c = 5;              // a+b=c
        assertEquals("NotATriangle", run(a,b,c));
    }

    // A3: C1=T, C2=T, C3=T => Tam giac Deu
    @Test public void DT_A3_Equilateral() {
        double a = 5, b = 5, c = 5;
        assertEquals("Tam giac Deu", run(a,b,c));
    }

    // A4: C1=T, C2=T, C3=F, C4=T => Tam gia can
    @Test public void DT_A4_Isosceles() {
        double a = 5, b = 5, c = 7;
        assertEquals("Tam gia can", run(a,b,c)); // match SUT
    }

    // A5: C1=T, C2=T, C3=F, C4=F => Tam giac thuong
    @Test public void DT_A5_Scalene() {
        double a = 3, b = 4, c = 5;
        assertEquals("Tam giac thuong", run(a,b,c));
    }

    // ==========================================
    // B) CONDITION COVERAGE (C1..C4 True/False)
    // ==========================================

    // C1: a>0,b>0,c>0?
    @Test public void DT_C1_False() {
        double a = 0, b = 6, c = 7;              // C1 = F
        assertEquals("InvalidInput", run(a,b,c));
    }
    @Test public void DT_C1_True() {
        double a = 2, b = 3, c = 4;              // C1 = T
        assertEquals("Tam giac thuong", run(a,b,c));
    }

    // C2: Bất đẳng thức tam giác?
    @Test public void DT_C2_False() {
        double a = 2, b = 3, c = 5;              // C2 = F (a+b=c)
        assertEquals("NotATriangle", run(a,b,c));
    }
    @Test public void DT_C2_True() {
        double a = 3, b = 4, c = 5;              // C2 = T
        assertEquals("Tam giac thuong", run(a,b,c));
    }

    // C3: a=b=c?
    @Test public void DT_C3_True() {
        double a = 6, b = 6, c = 6;              // C3 = T
        assertEquals("Tam giac Deu", run(a,b,c));
    }
    @Test public void DT_C3_False() {
        double a = 6, b = 6, c = 8;              // C3 = F
        assertEquals("Tam gia can", run(a,b,c)); // vì C4 = T
    }

    // C4: a=b || b=c || a=c?
    @Test public void DT_C4_True() {
        double a = 5, b = 7, c = 7;              // C4 = T
        assertEquals("Tam gia can", run(a,b,c));
    }
    @Test public void DT_C4_False() {
        double a = 4, b = 5, c = 6;              // C4 = F
        assertEquals("Tam giac thuong", run(a,b,c));
    }

    // (Optional) C5 nếu bạn muốn định nghĩa: "ba cạnh khác nhau"
    // Thực chất tương đương !C3 && !C4 ⇒ dùng 3-4-5 cho minh họa.
    @Test public void DT_C5_AllDifferent() {
        double a = 3, b = 4, c = 5;
        assertEquals("Tam giac thuong", run(a,b,c));
    }
}
