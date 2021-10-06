package seedu.address.model.person;

import java.time.LocalDateTime;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;
import static seedu.address.commons.util.DateTimeUtil.isDateValid;
import static seedu.address.commons.util.DateTimeUtil.parseToDateTime;

public class LastMet {
    public static final String MESSAGE_CONSTRAINTS = "Last met date and time should be in this format: YYYY-MM-DD HH:mm";

    public final LocalDateTime date;

    /**
     * Constructs a {@code CreatedAt}.
     *
     * @param str A valid dateTime.
     */
    public LastMet(String str) {
        requireNonNull(str);
        checkArgument(isValidLastMet(str), MESSAGE_CONSTRAINTS);
        date = parseToDateTime(str);
    }

    /**
     * Returns true if a given string is a valid dateTime.
     */
    public static boolean isValidLastMet(String test) {
        return isDateValid(test);
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof LastMet && date.equals(((LastMet) other).date));
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }

}


