package edu.uoc.ds.adt.util;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static @NotNull LocalDateTime getLocalDateTime(String lastUpdated) {

        // Convierte un string en un LocalDataTime

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        return LocalDateTime.parse(lastUpdated, formatter);
    }
}
