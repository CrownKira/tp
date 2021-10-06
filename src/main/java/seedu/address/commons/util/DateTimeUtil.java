package seedu.address.commons.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

    /**
     * Parses and returns a {@code LocalDateTime} object from {@code str}
     * given that it is in this format: yyyy-MM-dd HH:mm
     *
     * @param str string to be parsed
     * @return {@code LocalDateTime} representation of {@code str}
     */
    public static LocalDateTime parseToDateTime(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(str, formatter);
    }
}
