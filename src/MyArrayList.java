import java.util.Comparator;

public class MyArrayList<T> implements Comparator<Object> {

    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

    public T get(int index) {
        if (index >= pointer) {
            throw new IndexOutOfBoundsException("Invalid index " + index + ". The size of current list is " + pointer);
        }

        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer] = null;
        pointer--;

        if (INIT_SIZE < array.length && pointer < array.length / CUT_RATE) {
            resize(array.length / 2);
        }
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void sort() {
        for (int i = 0; i < pointer - 1; i++) {

            for (int j = 0; j < pointer - i - 1; j++) {
                if (compare(array[j], array[j + 1]) > 0) {
                    Object temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof Number && o2 instanceof Number) {
            return (int) (((Number) o1).doubleValue() - ((Number) o2).doubleValue());
        }

        return o1.toString().compareTo(o2.toString());
    }
}
