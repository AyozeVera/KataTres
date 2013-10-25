
package katatres.ui;

import katatres.model.Histogram;


public class HistogramViewer {
    private Histogram histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }
    
    public void show(){
        for (Integer item : histogram.keySet()) {
            System.out.println(item + ": " + histogram.get(item));
        }
    }
    
    
    
}
