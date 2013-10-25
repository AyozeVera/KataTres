
package katatres.model;

public class HistogramBuilder<Key>{
    private Histogram<Key> histogram;

    public Histogram<Key> getHistogram() {
        return histogram;
    }
    
    public void calculate(Key[] array) {
        histogram = new Histogram<>();
        for (Key item : array) {
            histogram.put(item, getCurrentCount(item) + 1);
        }
    }

    private int getCurrentCount(Key item) {
        Integer count = histogram.get(item);
        if (count == null) {
            count = 0;
        }
        return count;
    }
}
