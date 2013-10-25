
package katatres.control;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import katatres.model.HistogramBuilder;
import katatres.persistence.MailReader;
import katatres.ui.HistogramViewer;


public class CalculateEmailDomainHistogramControl {
   
    private String filename;

    public CalculateEmailDomainHistogramControl() {
        this.filename = filename;
    }
    
    public void execute(){
        HistogramBuilder <String> builder = new HistogramBuilder<>();
        builder.calculate(readDomains());
        HistogramViewer <String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
        
    }

    private String[] readDomains() {
        MailReader reader = new MailReader();
        try {
            return reader.readDomains(filename);
        } catch (FileNotFoundException ex) {
            return new String[0];
        }
        
    }
    
}
