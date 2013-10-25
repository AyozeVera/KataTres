
package katatres;

import katatres.control.CalculateIntegerHistogramControl;

public class Main {

    public static void main(String[] args) {
        Integer array[]={1,2,1,5,1,2,3};
        CalculateIntegerHistogramControl control = new CalculateIntegerHistogramControl(array);
        control.execute();
    }
    
    
}
