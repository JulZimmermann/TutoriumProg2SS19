package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class MyCoolMathTest {

    MyCoolMath myCoolMath;

    @Before
    void init() {
        myCoolMath = new MyCoolMath();
    }

    @Test
    void add2Values() {
        int erg = myCoolMath.add(2, 2);

        assertEquals(4, erg);
    }
}