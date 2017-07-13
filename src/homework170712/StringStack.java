package homework170712;

import java.util.Arrays;

public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 3;
    private String[] elements;
    private int size;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String string) {
        if (size >= elements.length) {
            return false;
        }
        elements[size++] = string;
        return true;
    }


    public String pop() {
        if (this.size <= 0) {
            return null;
        }
        String res = this.elements[--size];
        elements[size] = null;
        return res;
    }

    public int size() {
        return size;
    }

    public String tos() {
        return size == 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
