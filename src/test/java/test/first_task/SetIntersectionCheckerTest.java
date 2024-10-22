package test.first_task;
import first_task.SetIntersectionChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetIntersectionCheckerTest {

    @Test
    public void testNoIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertFalse(checker.isIntersecting(set1, set2));
    }

    @Test
    public void testWithIntersection() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertTrue(checker.isIntersecting(set1, set2));
    }

    @Test
    public void testEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertFalse(checker.isIntersecting(set1, set2));
    }

    @Test
    public void testOneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertFalse(checker.isIntersecting(set1, set2));
    }

    @Test
    public void testSameElements() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertTrue(checker.isIntersecting(set1, set2));
    }

    @Test
    public void testLargeSets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            set1.add(i);
            set2.add(i + 5000);
        }

        SetIntersectionChecker checker = new SetIntersectionChecker();
        Assertions.assertTrue(checker.isIntersecting(set1, set2));
    }
}
