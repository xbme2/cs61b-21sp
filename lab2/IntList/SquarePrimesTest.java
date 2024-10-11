package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesempty() {
        IntList lst = IntList.of();
        boolean changed = IntListExercises.squarePrimes(lst);
        assertTrue(!changed);
    }

    @Test
    public void testSquarePrimesHard1() {
        IntList lst = IntList.of(14, 15, 16, 20, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 20 -> 18", lst.toString());
        assertTrue(!changed);
    }

    @Test
    public void testSquarePrimesHard2() {
        IntList lst = IntList.of(2, 2, 2, 2, 2);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 4 -> 4 -> 4 -> 4", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard3() {
        IntList lst = IntList.of(23, 23, 23, 23, 23);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("529 -> 529 -> 529 -> 529 -> 529", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard4() {
        IntList lst = IntList.of(24, 24, 24, 24, 24);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("24 -> 24 -> 24 -> 24 -> 24", lst.toString());
        assertTrue(!changed);
    }

    @Test
    public void testSquarePrimesHard5() {
        IntList lst = IntList.of(4);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4", lst.toString());
        assertTrue(!changed);
    }

    @Test
    public void testSquarePrimesHard6() {
        IntList lst = IntList.of(3);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("9", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard7() {
        IntList lst = IntList.of(4,4,4,4,3);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 4 -> 4 -> 4 -> 9", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard8() {
        IntList lst = IntList.of(3,4,4,4,4);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("9 -> 4 -> 4 -> 4 -> 4", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesHard9() {
        IntList lst = IntList.of(new int[]{3, 4, 3, 4, 3});
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("9 -> 4 -> 9 -> 4 -> 9", lst.toString());
        assertTrue(changed);
    }

}
