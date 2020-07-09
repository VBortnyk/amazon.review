package springboot.starter;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileParser {

    public List<String[]> getDataFromCsvFile(String path) {
        List<String[]> dataFromCsv = new ArrayList<>();
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            String[] line;
            while ((line = reader.readNext()) != null) {
                dataFromCsv.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return dataFromCsv;
    }
}
