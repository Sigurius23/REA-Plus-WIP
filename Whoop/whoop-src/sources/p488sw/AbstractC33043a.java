package p488sw;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sw.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33043a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f137723a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    public static boolean m104581a(String str, int i13, char c3) {
        return i13 < str.length() && str.charAt(i13) == c3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01da A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:41:0x00a8, B:43:0x00ae, B:48:0x00bb, B:51:0x00c6, B:62:0x00f1, B:64:0x00f7, B:90:0x01a9, B:72:0x0109, B:73:0x0124, B:74:0x0125, B:78:0x0142, B:80:0x014f, B:83:0x0158, B:85:0x0177, B:88:0x0186, B:89:0x01a8, B:77:0x0131, B:92:0x01da, B:93:0x01e1, B:55:0x00d6, B:56:0x00d9, B:50:0x00c2), top: B:104:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x01fa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x0131, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static Date m104582b(String str, ParsePosition parsePosition) throws ParseException {
        String strM95633i;
        String message;
        int i13;
        int i14;
        int iM104583c;
        int iM104583c2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id4;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int iM104583c3 = m104583c(str, index, i15);
            if (m104581a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int iM104583c4 = m104583c(str, i15, i16);
            if (m104581a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int iM104583c5 = m104583c(str, i16, i17);
            boolean zM104581a = m104581a(str, i17, 'T');
            if (!zM104581a && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM104583c3, iM104583c4 - 1, iM104583c5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (zM104581a) {
                int i18 = i16 + 5;
                int iM104583c6 = m104583c(str, i16 + 3, i18);
                if (m104581a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int iM104583c7 = m104583c(str, i18, i19);
                if (m104581a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() <= i19 || (cCharAt2 = str.charAt(i19)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i17 = i19;
                    i13 = iM104583c6;
                    i14 = iM104583c7;
                } else {
                    int i24 = i19 + 2;
                    iM104583c2 = m104583c(str, i19, i24);
                    if (iM104583c2 > 59 && iM104583c2 < 63) {
                        iM104583c2 = 59;
                    }
                    if (m104581a(str, i24, '.')) {
                        int i25 = i19 + 3;
                        int i26 = i19 + 4;
                        while (true) {
                            if (i26 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i26);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i26++;
                            }
                            length2 = i26;
                            break;
                        }
                        int iMin = Math.min(length2, i19 + 6);
                        iM104583c = m104583c(str, i25, iMin);
                        int i27 = iMin - i25;
                        if (i27 == 1) {
                            iM104583c *= 100;
                        } else if (i27 == 2) {
                            iM104583c *= 10;
                        }
                        i13 = iM104583c6;
                        i17 = length2;
                        i14 = iM104583c7;
                    } else {
                        i13 = iM104583c6;
                        i17 = i24;
                        i14 = iM104583c7;
                        iM104583c = 0;
                    }
                }
                if (str.length() > i17) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i17);
                timeZone = f137723a;
                if (cCharAt == 'Z') {
                    length = i17 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i17);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i17 + strSubstring.length();
                    if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id4 = timeZone.getID();
                        if (!id4.equals(str2) && !id4.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iM104583c3);
                gregorianCalendar2.set(2, iM104583c4 - 1);
                gregorianCalendar2.set(5, iM104583c5);
                gregorianCalendar2.set(11, i13);
                gregorianCalendar2.set(12, i14);
                gregorianCalendar2.set(13, iM104583c2);
                gregorianCalendar2.set(14, iM104583c);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i13 = 0;
            i14 = 0;
            iM104583c = 0;
            iM104583c2 = 0;
            if (str.length() > i17) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i17);
            timeZone = f137723a;
            if (cCharAt == 'Z') {
                length = i17 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i17);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i17 + strSubstring.length();
                if (!strSubstring.equals("+0000")) {
                    str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    id4 = timeZone.getID();
                    if (!id4.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iM104583c3);
            gregorianCalendar3.set(2, iM104583c4 - 1);
            gregorianCalendar3.set(5, iM104583c5);
            gregorianCalendar3.set(11, i13);
            gregorianCalendar3.set(12, i14);
            gregorianCalendar3.set(13, iM104583c2);
            gregorianCalendar3.set(14, iM104583c);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e5) {
            e = e5;
            if (str == null) {
                strM95633i = null;
            } else {
                strM95633i = AbstractC31061c.m95633i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(AbstractC31061c.m95640p("Failed to parse date [", strM95633i, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e13) {
            e = e13;
            if (str == null) {
                strM95633i = null;
            } else {
                strM95633i = AbstractC31061c.m95633i('\"', "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(AbstractC31061c.m95640p("Failed to parse date [", strM95633i, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m104583c(String str, int i13, int i14) {
        int i15;
        int i16;
        if (i13 < 0 || i14 > str.length() || i13 > i14) {
            throw new NumberFormatException(str);
        }
        if (i13 < i14) {
            i16 = i13 + 1;
            int iDigit = Character.digit(str.charAt(i13), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = -iDigit;
        } else {
            i15 = 0;
            i16 = i13;
        }
        while (i16 < i14) {
            int i17 = i16 + 1;
            int iDigit2 = Character.digit(str.charAt(i16), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = (i15 * 10) - iDigit2;
            i16 = i17;
        }
        return -i15;
    }
}
