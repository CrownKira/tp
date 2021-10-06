package seedu.address.model.person;

import java.time.LocalDateTime;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;
import static seedu.address.commons.util.DateTimeUtil.isDateValid;
import static seedu.address.commons.util.DateTimeUtil.parseToDateTime;

public class NextMeeting {
    public static final String MESSAGE_CONSTRAINTS = "Meeting date and time should be in this format: YYYY-MM-DD HH:mm";

    public final LocalDateTime date;

    /**
     * Constructs a {@code CreatedAt}.
     *
     * @param str A valid dateTime.
     */
    public NextMeeting(String str) {
        requireNonNull(str);
        checkArgument(isValidNextMeeting(str), MESSAGE_CONSTRAINTS);
        date = parseToDateTime(str);
    }

    /**
     * Returns true if a given string is a valid dateTime.
     */
    public static boolean isValidNextMeeting(String test) {
        return isDateValid(test);
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof NextMeeting && date.equals(((NextMeeting) other).date));
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }

}


