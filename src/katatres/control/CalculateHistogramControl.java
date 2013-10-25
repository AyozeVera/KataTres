
package katatres.control;

import katatres.model.HistogramBuilder;
import katatres.ui.HistogramViewer;


public class CalculateHistogramControl {
    Integer[] array;

    public CalculateHistogramControl(Integer[] array) {
        this.array = array;
    }
    
    public void execute(){
        HistogramBuilder<Integer> builder = new HistogramBuilder();
        builder.calculate(array);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
