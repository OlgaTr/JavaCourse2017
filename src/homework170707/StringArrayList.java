package homework170707;


import java.util.Arrays;

public class StringArrayList {

    static final int DEFAULT_SIZE = 10;

    String[] elements = new String[DEFAULT_SIZE];

    int size = 0;

    public void add (String string) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = string;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    public void remove(int i) {
        if (i >= size || i < 0) {
            return;
        }

        System.arraycopy(elements, i+1, elements, i, --size - i);
        elements[size] = null;
    }

    public boolean remove(String string) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(string)) index = i;
        }
        if (index == -1) return false;

        System.arraycopy(elements,index+1, elements, index, --size - index);
        elements[size] = null;
        return true;
    }

    public String get(int i) {
        if (i >= size || i < 0) {
            return null;
        }

        return elements[i];
    }

    public void set(int i, String string) {
        if (i >= size || i < 0) {
            return;
        }

        elements[i] = string;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
