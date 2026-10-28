package or2;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: renamed from: or2.n0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC28184n0 {

    /* JADX INFO: renamed from: a */
    private static final DateTimeFormatter f113905a = new DateTimeFormatterBuilder().appendTimeZoneOffset("+0000", false, 2, 2).toFormatter();

    /* JADX INFO: renamed from: a */
    public static LocalDate m85303a(String str, DateTimeZone dateTimeZone) {
        return ISODateTimeFormat.dateTimeParser().withZone(dateTimeZone).parseLocalDate(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m85304b(DateTime dateTime) {
        return ISODateTimeFormat.dateTime().print(dateTime);
    }

    /* JADX INFO: renamed from: c */
    public static String m85305c(DateTime dateTime) {
        return f113905a.print(dateTime);
    }

    /* JADX INFO: renamed from: d */
    public static DateTimeZone m85306d(String str) {
        int i13 = str.charAt(0) == '+' ? 1 : -1;
        String strSubstring = str.substring(1);
        int i14 = Integer.parseInt(strSubstring.substring(0, 2)) * i13;
        int i15 = Integer.parseInt(strSubstring.substring(2));
        if (i14 == 0) {
            i15 *= i13;
        }
        return DateTimeZone.forOffsetHoursMinutes(i14, i15);
    }
}
