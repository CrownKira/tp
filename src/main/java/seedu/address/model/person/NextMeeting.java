package seedu.address.model.person;

import java.time.LocalDateTime;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

public class NextMeeting {
    public static final String MESSAGE_CONSTRAINTS = "Next meeting should be in this format: YYYY-MM-DD HH:mm"

    public final LocalDateTime date;

    public NextMeeting(String dateString) {
        requireNonNull(dateString);
        checkArgument(isValidNextMeeting(dateString), MESSAGE_CONSTRAINTS);
        date = LocalDateTime.parse(dateString);
    }

    public static boolean isValidNextMeeting(String test) {
//        return
    }

    @Override
    public boolean equals(Object other) {
        return other == this || (other instanceof NextMeeting && date.equals((NextMeeting) other).date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }

}


