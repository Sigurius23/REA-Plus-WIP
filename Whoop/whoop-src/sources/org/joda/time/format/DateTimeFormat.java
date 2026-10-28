package org.joda.time.format;

import com.mapbox.common.logger.LogPriority;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import nh3.AbstractC26725a;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeFormat {
    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    /* JADX INFO: loaded from: classes3.dex */
    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i13, int i14, int i15, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i13 + (i14 << 4) + (i15 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            if (locale == null) {
                if (styleFormatterCacheKey.locale != null) {
                    return false;
                }
            } else if (!locale.equals(styleFormatterCacheKey.locale)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i13 = (this.combinedTypeAndStyle + 31) * 31;
            Locale locale = this.locale;
            return i13 + (locale == null ? 0 : locale.hashCode());
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i13, int i14) {
        int i15;
        if (i13 == 4) {
            i15 = 1;
        } else {
            i15 = i14 == 4 ? 0 : 2;
        }
        StyleFormatter styleFormatter = new StyleFormatter(i13, i14, i15);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter dateTimeFormatterPutIfAbsent;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification: Pattern is null or empty");
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter formatter = concurrentHashMap.get(str);
        if (formatter == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            parsePatternTo(dateTimeFormatterBuilder, str);
            formatter = dateTimeFormatterBuilder.toFormatter();
            if (concurrentHashMap.size() < PATTERN_CACHE_SIZE && (dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(str, formatter)) != null) {
                return dateTimeFormatterPutIfAbsent;
            }
        }
        return formatter;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Invalid style specification: ", str));
        }
        int iSelectStyle = selectStyle(str.charAt(0));
        int iSelectStyle2 = selectStyle(str.charAt(1));
        if (iSelectStyle == 4 && iSelectStyle2 == 4) {
            throw new IllegalArgumentException("Style '--' is invalid");
        }
        return createFormatterForStyleIndex(iSelectStyle, iSelectStyle2);
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i13, int i14) {
        int i15 = (i13 << 2) + i13 + i14;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i15 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i13, i14);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i15);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterCreateDateTimeFormatter = createDateTimeFormatter(i13, i14);
        return !AbstractC26725a.m79517u(atomicReferenceArray, i15, dateTimeFormatterCreateDateTimeFormatter) ? atomicReferenceArray.get(i15) : dateTimeFormatterCreateDateTimeFormatter;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                case 'S':
                case 'W':
                case 'Y':
                case LogPriority.NONE /* 99 */:
                case AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB /* 100 */:
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0107  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Switch 'out' block B:57:0x00c2 for B:37:0x005d already processed. Defaulting to fallback option. */
    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int i13;
        boolean z4;
        int length = str.length();
        int[] iArr = new int[1];
        int i14 = 0;
        while (i14 < length) {
            iArr[0] = i14;
            String token = parseToken(str, iArr);
            int i15 = iArr[0];
            int length2 = token.length();
            if (length2 == 0) {
                return;
            }
            char cCharAt = token.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = token.substring(1);
                if (strSubstring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(strSubstring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (cCharAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (cCharAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (cCharAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (cCharAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (cCharAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (cCharAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (cCharAt == 'H') {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                } else if (cCharAt == 'Y') {
                    if (length2 != 2) {
                        if (i15 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z4 = !isNumericToken(parseToken(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z4 = true;
                        }
                        if (cCharAt == 'x') {
                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z4);
                        } else {
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z4);
                        }
                    } else {
                        i13 = 9;
                        if (i15 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            i13 = isNumericToken(parseToken(str, iArr)) ? length2 : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i13);
                        } else if (cCharAt != 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i13);
                        } else if (cCharAt != 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i13);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                continue;
                            case 'D':
                                dateTimeFormatterBuilder.appendDayOfYear(length2);
                                continue;
                            case 'E':
                                if (length2 < 4) {
                                    dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                } else {
                                    dateTimeFormatterBuilder.appendDayOfWeekText();
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length2 != 2) {
                                            i13 = 9;
                                            if (i15 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                if (isNumericToken(parseToken(str, iArr))) {
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                dateTimeFormatterBuilder.appendYearOfEra(length2, i13);
                                            } else if (cCharAt != 'x') {
                                                dateTimeFormatterBuilder.appendWeekyear(length2, i13);
                                            } else if (cCharAt != 'y') {
                                                dateTimeFormatterBuilder.appendYear(length2, i13);
                                            }
                                        } else {
                                            if (i15 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                z4 = !isNumericToken(parseToken(str, iArr));
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z4 = true;
                                            }
                                            if (cCharAt == 'x') {
                                                dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z4);
                                            } else {
                                                dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z4);
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length2 < 4) {
                                            dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                        } else {
                                            dateTimeFormatterBuilder.appendTimeZoneName();
                                            continue;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Illegal pattern component: ".concat(token));
                                }
                                break;
                        }
                    } else {
                        dateTimeFormatterBuilder.appendDayOfWeek(length2);
                    }
                } else if (length2 == 1) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                } else if (length2 == 2) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                } else {
                    dateTimeFormatterBuilder.appendTimeZoneId();
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i14 = i15 + 1;
        }
    }

    private static String parseToken(String str, int[] iArr) {
        StringBuilder sb4 = new StringBuilder();
        int i13 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i13);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb4.append('\'');
            boolean z4 = false;
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 != '\'') {
                    if (!z4 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i13--;
                        break;
                    }
                    sb4.append(cCharAt2);
                } else {
                    int i14 = i13 + 1;
                    if (i14 >= length || str.charAt(i14) != '\'') {
                        z4 = !z4;
                    } else {
                        sb4.append(cCharAt2);
                        i13 = i14;
                    }
                }
                i13++;
            }
        } else {
            sb4.append(cCharAt);
            while (true) {
                int i15 = i13 + 1;
                if (i15 >= length || str.charAt(i15) != cCharAt) {
                    break;
                }
                sb4.append(cCharAt);
                i13 = i15;
            }
        }
        iArr[0] = i13;
        return sb4.toString();
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter dateTimeFormatterCreateFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) dateTimeFormatterCreateFormatterForStyle.getPrinter0()).getPattern(locale);
    }

    private static int selectStyle(char c3) {
        if (c3 == '-') {
            return 4;
        }
        if (c3 == 'F') {
            return 0;
        }
        if (c3 == 'S') {
            return 3;
        }
        if (c3 == 'L') {
            return 1;
        }
        if (c3 == 'M') {
            return 2;
        }
        throw new IllegalArgumentException("Invalid style character: " + c3);
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        public StyleFormatter(int i13, int i14, int i15) {
            this.iDateStyle = i13;
            this.iTimeStyle = i14;
            this.iType = i15;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(getPattern(locale));
            DateTimeFormatter dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, dateTimeFormatterForPattern);
            return dateTimeFormatterPutIfAbsent != null ? dateTimeFormatterPutIfAbsent : dateTimeFormatterForPattern;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        public String getPattern(Locale locale) {
            DateFormat dateInstance;
            int i13 = this.iType;
            if (i13 == 0) {
                dateInstance = DateFormat.getDateInstance(this.iDateStyle, locale);
            } else if (i13 != 1) {
                dateInstance = i13 != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
            } else {
                dateInstance = DateFormat.getTimeInstance(this.iTimeStyle, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i13);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, j7, chronology, i13, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }
}
