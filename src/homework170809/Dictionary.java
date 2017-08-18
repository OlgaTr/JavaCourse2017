package homework170809;

import homework170809.Dictionary.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dictionary <K, V> implements Iterable <Pair>{

    private static final int MAX = 2;


    public static class Pair<K, V>  {
        public Pair(K key2, V value2) {
            key = key2;
            value = value2;
        }

        K key;
        V value;
    }

    List<Pair>[] data = new List[MAX];

    public void put (K key, V value) {

        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) counter ++;
        }
        if (counter >= 0.75 * data.length) resize();

        Pair pair = getPair(key);

        if (pair == null) {
            int index = hash(key);
            if (data[index] == null) {
                data[index] = new ArrayList<>();
            }
            data[index].add(new Pair(key, value));
            return;
        }
        pair.value = value;
    }

    public V delete (K key) {
        Pair pair = getPair(key);

        if (pair == null) return null;

        int index = hash(key);
        V value = (V) pair.value;
        data[index].remove(pair);
        return value;
    }

    private int hash(K key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    public V get (K key) {
        Pair pair = getPair(key);
        return pair == null ? null : (V) pair.value;
    }

    private Pair getPair(K key) {
        int index = hash(key);
        List<Pair> list = data[index];
        if (list == null) {
            return null;
        }
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }
        return null;
    }

    private void resize() {
        List<Pair> auxiliary = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) continue;
            for (Pair pair : data[i]) {
                auxiliary.add(pair);
            }
        }
        data = new List[data.length * 2];
        for (Pair pair : auxiliary) {
            int index = hash((K)pair.key);
            if (data[index] == null) {
                data[index] = new ArrayList<>();
            }
            data[index].add(new Pair(pair.key, pair.value));
        }
    }

    public int getSize () {
        return data.length;
    }

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Pair>() {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {

                if ((listIterator != null && listIterator.hasNext())) {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null && currentElement < data.length; currentElement++) {
                    List<Pair> list = data[currentElement];
                    if (list == null) {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        continue;
                    }
                    return listIterator.hasNext();
                }
                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }
}
