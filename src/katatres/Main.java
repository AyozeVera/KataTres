
package katatres;

import katatres.control.CalculateEmailDomainHistogramControl;
import katatres.control.CalculateIntegerHistogramControl;

public class Main {

    public static void main(String[] args) {
        Integer array[]={1,2,1,5,1,2,3};
        CalculateIntegerHistogramControl control = new CalculateIntegerHistogramControl(array);
        control.execute();
    
        String filename="C:\\Users\\Ayoze\\Proyectos NetBeans\\KataTres\\Correos";
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
        control2.execute();
    }
    
    
}
