package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.DateTimeConstants;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i13, char c3) {
        return i13 < str.length() && str.charAt(i13) == c3;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i13) {
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                return i13;
            }
            i13++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb4, int i13, int i14) {
        String string = Integer.toString(i13);
        for (int length = i14 - string.length(); length > 0; length--) {
            sb4.append('0');
        }
        sb4.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00eb A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0180 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4 A[Catch: IllegalArgumentException -> 0x0056, NumberFormatException -> 0x0059, IndexOutOfBoundsException -> 0x005c, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x005c, NumberFormatException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:23:0x0065, B:25:0x0075, B:26:0x0077, B:28:0x0083, B:29:0x0086, B:31:0x008c, B:35:0x0096, B:40:0x00a6, B:42:0x00ae, B:54:0x00e5, B:56:0x00eb, B:58:0x00f1, B:84:0x0182, B:64:0x0102, B:65:0x0118, B:66:0x0119, B:70:0x0129, B:72:0x0136, B:75:0x013f, B:77:0x0151, B:80:0x0160, B:81:0x017d, B:83:0x0180, B:69:0x0125, B:86:0x01b4, B:87:0x01bb, B:47:0x00c8, B:48:0x00cb), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01d4, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String strM95633i;
        String message;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i17 = index + 4;
            int i18 = parseInt(str, index, i17);
            if (checkOffset(str, i17, '-')) {
                i17 = index + 5;
            }
            int i19 = i17 + 2;
            int i24 = parseInt(str, i17, i19);
            if (checkOffset(str, i19, '-')) {
                i19 = i17 + 3;
            }
            int i25 = i19 + 2;
            int i26 = parseInt(str, i19, i25);
            boolean zCheckOffset = checkOffset(str, i25, 'T');
            if (!zCheckOffset && str.length() <= i25) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i18, i24 - 1, i26);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i25);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i27 = i19 + 5;
                int i28 = parseInt(str, i19 + 3, i27);
                if (checkOffset(str, i27, ':')) {
                    i27 = i19 + 6;
                }
                int i29 = i27 + 2;
                int i34 = parseInt(str, i27, i29);
                if (checkOffset(str, i29, ':')) {
                    i29 = i27 + 3;
                }
                if (str.length() <= i29 || (cCharAt2 = str.charAt(i29)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i25 = i29;
                    i13 = i28;
                    i14 = i34;
                } else {
                    int i35 = i29 + 2;
                    i16 = parseInt(str, i29, i35);
                    if (i16 > 59 && i16 < 63) {
                        i16 = 59;
                    }
                    if (checkOffset(str, i35, '.')) {
                        int i36 = i29 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i29 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i29 + 6);
                        int i37 = parseInt(str, i36, iMin);
                        int i38 = iMin - i36;
                        if (i38 == 1) {
                            i37 *= 100;
                        } else if (i38 == 2) {
                            i37 *= 10;
                        }
                        i13 = i28;
                        i25 = iIndexOfNonDigit;
                        i14 = i34;
                        i15 = i37;
                    } else {
                        i13 = i28;
                        i25 = i35;
                        i14 = i34;
                        i15 = 0;
                    }
                }
                if (str.length() > i25) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i25);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i25 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i25);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i25 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String strConcat = "GMT".concat(strSubstring);
                        TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                        String id4 = timeZone2.getID();
                        if (!id4.equals(strConcat) && !id4.replace(":", "").equals(strConcat)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i18);
                gregorianCalendar2.set(2, i24 - 1);
                gregorianCalendar2.set(5, i26);
                gregorianCalendar2.set(11, i13);
                gregorianCalendar2.set(12, i14);
                gregorianCalendar2.set(13, i16);
                gregorianCalendar2.set(14, i15);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            if (str.length() > i25) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i25);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i25 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i25);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i25 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i18);
            gregorianCalendar3.set(2, i24 - 1);
            gregorianCalendar3.set(5, i26);
            gregorianCalendar3.set(11, i13);
            gregorianCalendar3.set(12, i14);
            gregorianCalendar3.set(13, i16);
            gregorianCalendar3.set(14, i15);
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

    private static int parseInt(String str, int i13, int i14) throws NumberFormatException {
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

    public static String format(Date date, boolean z4) {
        return format(date, z4, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z4, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb4 = new StringBuilder(19 + (z4 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb4, gregorianCalendar.get(1), 4);
        sb4.append('-');
        padInt(sb4, gregorianCalendar.get(2) + 1, 2);
        sb4.append('-');
        padInt(sb4, gregorianCalendar.get(5), 2);
        sb4.append('T');
        padInt(sb4, gregorianCalendar.get(11), 2);
        sb4.append(':');
        padInt(sb4, gregorianCalendar.get(12), 2);
        sb4.append(':');
        padInt(sb4, gregorianCalendar.get(13), 2);
        if (z4) {
            sb4.append('.');
            padInt(sb4, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i13 = offset / DateTimeConstants.MILLIS_PER_MINUTE;
            int iAbs = Math.abs(i13 / 60);
            int iAbs2 = Math.abs(i13 % 60);
            sb4.append(offset >= 0 ? '+' : '-');
            padInt(sb4, iAbs, 2);
            sb4.append(':');
            padInt(sb4, iAbs2, 2);
        } else {
            sb4.append('Z');
        }
        return sb4.toString();
    }
}
