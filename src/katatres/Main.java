
package katatres;

import katatres.control.CalculateHistogramControl;

public class Main {

    public static void main(String[] args) {
        Integer array[]={1,2,1,5,1,2,3};
        CalculateHistogramControl control = new CalculateHistogramControl(array);
        control.execute();
    }
    
    
}
