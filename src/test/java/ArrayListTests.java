import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTests {

    @Test
    public void addElemAndCheckSize() {
        MyArrayList<Object> objList = new MyArrayList<>();
        objList.add(new Object());
        assertEquals(1, objList.size());
    }

    @Test
    public void getElem() {
        MyArrayList<String> list = new MyArrayList<>();
        String hi = "Hi";
        String bye = "Bye";
        list.add(hi);
        list.add(bye);
        assertEquals(list.get(1), bye);
    }

    @Test
    public void setElem() {
        MyArrayList<Double> list = new MyArrayList<>();
        double a = 2.0;
        double b = 5.5;
        double c = -21.1;
        double d = 4.9;

        list.add(a);
        list.add(b);
        list.add(c);

        assertEquals(3, list.size());
        assertEquals(a, list.get(0));
        assertEquals(b, list.get(1));
        assertEquals(c, list.get(2));

        list.set(1, d);

        assertEquals(4, list.size());
        assertEquals(a, list.get(0));
        assertEquals(d, list.get(1));
        assertEquals(b, list.get(2));
        assertEquals(c, list.get(3));

    }

    @Test
    public void removeElem() {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        list.remove(2);

        assertEquals(3, list.size());
    }


    @Test
    public void sortList() {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        list.sort();

        assertSame(0, list.get(0));
        assertSame(1, list.get(1));
        assertSame(2, list.get(2));
        assertSame(3, list.get(3));
    }
}
