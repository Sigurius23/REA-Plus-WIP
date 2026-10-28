package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: io.sentry.vendor.gson.internal.bind.util.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20610a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f77127a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    public static boolean m56732a(String str, int i13, char c3) {
        return i13 < str.length() && str.charAt(i13) == c3;
    }

    /* JADX INFO: renamed from: b */
    public static void m56733b(StringBuilder sb4, int i13, int i14) {
        String string = Integer.toString(i13);
        for (int length = i14 - string.length(); length > 0; length--) {
            sb4.append('0');
        }
        sb4.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01f9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0130, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static Date m56734c(String str, ParsePosition parsePosition) throws ParseException {
        String strM95633i;
        String message;
        int i13;
        int i14;
        int iM56735d;
        int iM56735d2;
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
            int iM56735d3 = m56735d(str, index, i15);
            if (m56732a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int iM56735d4 = m56735d(str, i15, i16);
            if (m56732a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int iM56735d5 = m56735d(str, i16, i17);
            boolean zM56732a = m56732a(str, i17, 'T');
            if (!zM56732a && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM56735d3, iM56735d4 - 1, iM56735d5);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (zM56732a) {
                int i18 = i16 + 5;
                int iM56735d6 = m56735d(str, i16 + 3, i18);
                if (m56732a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int iM56735d7 = m56735d(str, i18, i19);
                if (m56732a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() <= i19 || (cCharAt2 = str.charAt(i19)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i17 = i19;
                    i13 = iM56735d6;
                    i14 = iM56735d7;
                } else {
                    int i24 = i19 + 2;
                    iM56735d2 = m56735d(str, i19, i24);
                    if (iM56735d2 > 59 && iM56735d2 < 63) {
                        iM56735d2 = 59;
                    }
                    if (m56732a(str, i24, '.')) {
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
                        iM56735d = m56735d(str, i25, iMin);
                        int i27 = iMin - i25;
                        if (i27 == 1) {
                            iM56735d *= 100;
                        } else if (i27 == 2) {
                            iM56735d *= 10;
                        }
                        i13 = iM56735d6;
                        i17 = length2;
                        i14 = iM56735d7;
                    } else {
                        i13 = iM56735d6;
                        i17 = i24;
                        i14 = iM56735d7;
                        iM56735d = 0;
                    }
                }
                if (str.length() > i17) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i17);
                timeZone = f77127a;
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
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
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
                gregorianCalendar2.set(1, iM56735d3);
                gregorianCalendar2.set(2, iM56735d4 - 1);
                gregorianCalendar2.set(5, iM56735d5);
                gregorianCalendar2.set(11, i13);
                gregorianCalendar2.set(12, i14);
                gregorianCalendar2.set(13, iM56735d2);
                gregorianCalendar2.set(14, iM56735d);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i13 = 0;
            i14 = 0;
            iM56735d = 0;
            iM56735d2 = 0;
            if (str.length() > i17) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i17);
            timeZone = f77127a;
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
                if (!"+0000".equals(strSubstring)) {
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
            gregorianCalendar3.set(1, iM56735d3);
            gregorianCalendar3.set(2, iM56735d4 - 1);
            gregorianCalendar3.set(5, iM56735d5);
            gregorianCalendar3.set(11, i13);
            gregorianCalendar3.set(12, i14);
            gregorianCalendar3.set(13, iM56735d2);
            gregorianCalendar3.set(14, iM56735d);
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
        } catch (NumberFormatException e14) {
            e = e14;
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
            ParseException parseException3 = new ParseException(AbstractC31061c.m95640p("Failed to parse date [", strM95633i, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m56735d(String str, int i13, int i14) {
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
