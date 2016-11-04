package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "emailsfilev1.txt";
        ArrayList<String> mailList = mailListReader.read(filename);
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
