import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private Kata kata;


    @BeforeEach
    public void setUp() {
        kata = new Kata();
    }
    @Test
    public void test1(){
        assertEquals(21,kata.nextBiggerNumber(12));
    }

    @Test
    public void test2(){
        assertEquals(19009,kata.nextBiggerNumber(10990));
    }
    @Test
    public void test3(){
        assertEquals(414,kata.nextBiggerNumber(144));
    }
    @Test
    public void test4(){
        assertEquals(-1,kata.nextBiggerNumber(111));
    }
    @Test
    public void test5(){
        assertEquals(-1,kata.nextBiggerNumber(9));
    }
    @Test
    public void testRand(){
        assertEquals(1393196014,kata.nextBiggerNumber(1393194610));
    }
    @Test
    public void testRand2(){
        assertEquals(2039651204,kata.nextBiggerNumber(2039651042));
    }

}