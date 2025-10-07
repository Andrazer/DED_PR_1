package edu.uoc.ds.adt.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.FileReader;
import java.io.IOException;


public class CSVReader {

    public static CSVParser getCVSParser(String s) {

        // Devuelve un CSVParser con los datos del archivo CSV

        try {

            FileReader reader = new FileReader("src/test/java/edu/uoc/ds/adt/weatherData.csv");
            CSVFormat format = CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).build();

            return new CSVParser(reader, format);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
