package homework170710;

public class StringLinkedList {

    Node first;
    Node last;
    int size;

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public boolean remove(String value) {

        boolean result = false;
        Node current = first;
        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;
        }
        if (first == null) {
            last = null;
        }
        return result;
    }

    public String remove (int index) {
        if (index < 0 || index > size - 1) return null;

        Node current = first;
        Node prev = null;
        String removed = "";

        for (int i = 0; i < size; i++) {
            if (i == index) {
                removed = current.value;
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                break;
            }
            prev = current;
            current = current.next;
        }
        if (first == null) {
            last = null;
        }
        return removed;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder().append("[");

        if (first != null) {
            builder.append(first.value);

            Node current = first.next;

            while (current != null) {
                builder.append(", " + current.value);
                current = current.next;
            }
        }

        builder.append("]");

        return builder.toString();
    }
}
