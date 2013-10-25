
package katatres.control;

import katatres.model.HistogramBuilder;
import katatres.ui.HistogramViewer;


public class CalculateHistogramControl {
    public void execute(){
        int[] array = {1,2,1,5,1,2,3};
        HistogramBuilder builder = new HistogramBuilder();
        builder.calculate(array);
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
