package Utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyCsvReader {

    public void kuku() throws IOException {
        Reader reader;

        reader = Files.newBufferedReader(
                Paths.get(".../data.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        // CSVReader csvReader = new CSVReader(reader);
        String nextRecord[];
        while ((nextRecord = csvReader.readNext()) != null) {
            System.out.println("Dana1 : " + nextRecord[0]);
            System.out.println("Dana2 : " + nextRecord[1]);
            System.out.println("Dana3 : " + nextRecord[2]);
            System.out.println("Dana4 : " + nextRecord[3]);
            System.out.println("==========================");
        }
    }
}
