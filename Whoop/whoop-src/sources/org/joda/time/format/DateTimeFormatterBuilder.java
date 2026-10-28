package org.joda.time.format;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.repositories.LanguageRepositoryKt;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c3) {
            this.iValue = c3;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            char upperCase;
            char upperCase2;
            if (i13 >= charSequence.length()) {
                return ~i13;
            }
            char cCharAt = charSequence.charAt(i13);
            char c3 = this.iValue;
            return (cCharAt == c3 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c3)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i13 + 1 : ~i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i13, boolean z4) {
            super(dateTimeFieldType, i13, z4, i13);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            int i14;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i13);
            if (into < 0 || into == (i14 = this.iMaxParsedDigits + i13)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i13)) == '-' || cCharAt == '+')) {
                i14++;
            }
            if (into > i14) {
                return ~(i14 + 1);
            }
            return into < i14 ? ~into : into;
        }
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i13, int i14) {
            this.iFieldType = dateTimeFieldType;
            i14 = i14 > 18 ? 18 : i14;
            this.iMinDigits = i13;
            this.iMaxDigits = i14;
        }

        private long[] getFractionData(long j7, DateTimeField dateTimeField) {
            long j13;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i13 = this.iMaxDigits;
            while (true) {
                switch (i13) {
                    case 1:
                        j13 = 10;
                        break;
                    case 2:
                        j13 = 100;
                        break;
                    case 3:
                        j13 = 1000;
                        break;
                    case 4:
                        j13 = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
                        break;
                    case 5:
                        j13 = 100000;
                        break;
                    case 6:
                        j13 = 1000000;
                        break;
                    case 7:
                        j13 = 10000000;
                        break;
                    case 8:
                        j13 = 100000000;
                        break;
                    case 9:
                        j13 = 1000000000;
                        break;
                    case 10:
                        j13 = 10000000000L;
                        break;
                    case 11:
                        j13 = 100000000000L;
                        break;
                    case 12:
                        j13 = 1000000000000L;
                        break;
                    case 13:
                        j13 = 10000000000000L;
                        break;
                    case 14:
                        j13 = 100000000000000L;
                        break;
                    case 15:
                        j13 = 1000000000000000L;
                        break;
                    case 16:
                        j13 = 10000000000000000L;
                        break;
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        j13 = 100000000000000000L;
                        break;
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        j13 = 1000000000000000000L;
                        break;
                    default:
                        j13 = 1;
                        break;
                }
                if ((unitMillis * j13) / j13 == unitMillis) {
                    return new long[]{(j7 * j13) / unitMillis, i13};
                }
                i13--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i13);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j7 = 0;
            int i14 = 0;
            while (i14 < iMin) {
                char cCharAt = charSequence.charAt(i13 + i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i14++;
                unitMillis /= 10;
                j7 += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j13 = j7 / 10;
            if (i14 != 0 && j13 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j13);
                return i13 + i14;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j7, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        public void printTo(Appendable appendable, long j7, Chronology chronology) throws IOException {
            String string;
            DateTimeField field = this.iFieldType.getField(chronology);
            int i13 = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j7);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j13 = fractionData[0];
                    int i14 = (int) fractionData[1];
                    if ((2147483647L & j13) == j13) {
                        string = Integer.toString((int) j13);
                    } else {
                        string = Long.toString(j13);
                    }
                    int length = string.length();
                    while (length < i14) {
                        appendable.append('0');
                        i13--;
                        i14--;
                    }
                    if (i13 < i14) {
                        while (i13 < i14 && length > 1 && string.charAt(length - 1) == '0') {
                            i14--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i15 = 0; i15 < length; i15++) {
                                appendable.append(string.charAt(i15));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i13--;
                    if (i13 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i13);
            }
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i13 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i13;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i13) {
                    i13 = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            int i14;
            int i15;
            InternalParser[] internalParserArr = this.iParsers;
            int length = internalParserArr.length;
            Object objSaveState = dateTimeParserBucket.saveState();
            boolean z4 = false;
            Object objSaveState2 = null;
            int i16 = i13;
            int i17 = i16;
            for (int i18 = 0; i18 < length; i18++) {
                InternalParser internalParser = internalParserArr[i18];
                if (internalParser == null) {
                    if (i16 > i13) {
                        z4 = true;
                        break;
                    }
                    return i13;
                }
                int into = internalParser.parseInto(dateTimeParserBucket, charSequence, i13);
                if (into >= i13) {
                    if (into <= i16) {
                        continue;
                    } else {
                        if (into >= charSequence.length() || (i15 = i18 + 1) >= length || internalParserArr[i15] == null) {
                            return into;
                        }
                        objSaveState2 = dateTimeParserBucket.saveState();
                        i16 = into;
                    }
                } else if (into < 0 && (i14 = ~into) > i17) {
                    i17 = i14;
                }
                dateTimeParserBucket.restoreState(objSaveState);
            }
            if (i16 <= i13 && (i16 != i13 || !z4)) {
                return ~i17;
            }
            if (objSaveState2 != null) {
                dateTimeParserBucket.restoreState(objSaveState2);
            }
            return i16;
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i13, boolean z4) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i13;
            this.iSigned = z4;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            int i14;
            int i15;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i13);
            int i16 = 0;
            boolean z4 = false;
            boolean z13 = false;
            while (i16 < iMin) {
                int i17 = i13 + i16;
                char cCharAt2 = charSequence.charAt(i17);
                if (i16 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    boolean z14 = cCharAt2 == '-';
                    boolean z15 = cCharAt2 == '+';
                    int i18 = i16 + 1;
                    if (i18 >= iMin || (cCharAt = charSequence.charAt(i17 + 1)) < '0' || cCharAt > '9') {
                        boolean z16 = z14;
                        z13 = z15;
                        z4 = z16;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i13);
                    boolean z17 = z14;
                    z13 = z15;
                    z4 = z17;
                    i16 = i18;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i16++;
                }
            }
            if (i16 == 0) {
                return ~i13;
            }
            if (i16 < 9) {
                int i19 = (z4 || z13) ? i13 + 1 : i13;
                int i24 = i19 + 1;
                try {
                    int iCharAt = charSequence.charAt(i19) - '0';
                    i14 = i13 + i16;
                    while (i24 < i14) {
                        int i25 = (iCharAt << 3) + (iCharAt << 1);
                        int i26 = i24 + 1;
                        int iCharAt2 = (charSequence.charAt(i24) + i25) - 48;
                        i24 = i26;
                        iCharAt = iCharAt2;
                    }
                    i15 = z4 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i13;
                }
            } else if (z13) {
                i14 = i13 + i16;
                i15 = Integer.parseInt(charSequence.subSequence(i13 + 1, i14).toString());
            } else {
                int i27 = i13 + i16;
                i15 = Integer.parseInt(charSequence.subSequence(i13, i27).toString());
                i14 = i27;
            }
            dateTimeParserBucket.saveField(this.iFieldType, i15);
            return i14;
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i13, this.iValue) ? this.iValue.length() + i13 : ~i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i13);
            int i14 = i13;
            while (true) {
                if (i14 >= iMin) {
                    string = "";
                    length = i13;
                    break;
                }
                if (charSequence.charAt(i14) == '/') {
                    int i15 = i14 + 1;
                    string = charSequence.subSequence(i13, i15).toString();
                    length = string.length() + i13;
                    if (i14 < length2 - 1) {
                        StringBuilder sbM53374o = AbstractC18489d0.m53374o(string);
                        sbM53374o.append(charSequence.charAt(i15));
                        string2 = sbM53374o.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list != null) {
                        break;
                    }
                    return ~i13;
                }
                i14++;
            }
            String str = null;
            for (int i16 = 0; i16 < list.size(); i16++) {
                String str2 = list.get(i16);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i13;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(string.concat(str)));
            return str.length() + length;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i13, Map<String, DateTimeZone> map) {
            this.iType = i13;
            this.iParseLookup = map;
        }

        private String print(long j7, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i13 = this.iType;
            if (i13 != 0) {
                return i13 != 1 ? "" : dateTimeZone.getShortName(j7, locale);
            }
            return dateTimeZone.getName(j7, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i13, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i13;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return str.length() + i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j7 - ((long) i13), dateTimeZone, locale));
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z4, int i13, int i14) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z4;
            if (i13 <= 0 || i14 < i13) {
                throw new IllegalArgumentException();
            }
            if (i13 > 4) {
                i13 = 4;
                i14 = 4;
            }
            this.iMinFields = i13;
            this.iMaxFields = i14;
        }

        private int digitCount(CharSequence charSequence, int i13, int i14) {
            int i15 = 0;
            for (int iMin = Math.min(charSequence.length() - i13, i14); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i13 + i15);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15++;
            }
            return i15;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i13 = this.iMinFields;
            int i14 = (i13 + 1) << 1;
            if (this.iShowSeparators) {
                i14 += i13 - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i14) ? i14 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            boolean z4;
            int twoDigits;
            int twoDigits2;
            int twoDigits3;
            char cCharAt;
            boolean z13 = false;
            int length = charSequence.length() - i13;
            String str = this.iZeroOffsetParseText;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i13)) != '-' && cCharAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i13;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i13, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return this.iZeroOffsetParseText.length() + i13;
                }
            }
            if (length <= 1) {
                return ~i13;
            }
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 == '-') {
                z4 = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i13;
                }
                z4 = false;
            }
            int i14 = i13 + 1;
            if (digitCount(charSequence, i14, 2) >= 2 && (twoDigits = FormatUtils.parseTwoDigits(charSequence, i14)) <= 23) {
                int iCharAt = twoDigits * DateTimeConstants.MILLIS_PER_HOUR;
                int i15 = length - 3;
                int i16 = i13 + 3;
                if (i15 > 0) {
                    char cCharAt3 = charSequence.charAt(i16);
                    if (cCharAt3 == ':') {
                        i15 = length - 4;
                        i16 = i13 + 4;
                        z13 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iDigitCount = digitCount(charSequence, i16, 2);
                    if (iDigitCount != 0 || z13) {
                        if (iDigitCount >= 2 && (twoDigits2 = FormatUtils.parseTwoDigits(charSequence, i16)) <= 59) {
                            iCharAt += twoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE;
                            int i17 = i15 - 2;
                            int i18 = i16 + 2;
                            if (i17 > 0) {
                                if (!z13) {
                                    i16 = i18;
                                } else if (charSequence.charAt(i18) != ':') {
                                    i16 = i18;
                                } else {
                                    i17 = i15 - 3;
                                    i16 += 3;
                                }
                                int iDigitCount2 = digitCount(charSequence, i16, 2);
                                if (iDigitCount2 != 0 || z13) {
                                    if (iDigitCount2 >= 2 && (twoDigits3 = FormatUtils.parseTwoDigits(charSequence, i16)) <= 59) {
                                        iCharAt += twoDigits3 * 1000;
                                        int i19 = i16 + 2;
                                        if (i17 - 2 > 0) {
                                            if (!z13) {
                                                i16 = i19;
                                            } else if (charSequence.charAt(i19) == '.' || charSequence.charAt(i19) == ',') {
                                                i16 += 3;
                                            } else {
                                                i16 = i19;
                                            }
                                            int iDigitCount3 = digitCount(charSequence, i16, 3);
                                            if (iDigitCount3 != 0 || z13) {
                                                if (iDigitCount3 < 1) {
                                                    return ~i16;
                                                }
                                                int i24 = i16 + 1;
                                                iCharAt += (charSequence.charAt(i16) - '0') * 100;
                                                if (iDigitCount3 > 1) {
                                                    int i25 = i16 + 2;
                                                    iCharAt += (charSequence.charAt(i24) - '0') * 10;
                                                    if (iDigitCount3 > 2) {
                                                        i16 += 3;
                                                        iCharAt += charSequence.charAt(i25) - '0';
                                                    } else {
                                                        i16 = i25;
                                                    }
                                                } else {
                                                    i16 = i24;
                                                }
                                            }
                                        } else {
                                            i16 = i19;
                                        }
                                    }
                                    return ~i16;
                                }
                            } else {
                                i16 = i18;
                            }
                        }
                        return ~i16;
                    }
                }
                if (z4) {
                    iCharAt = -iCharAt;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(iCharAt));
                return i16;
            }
            return ~i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i13 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i13 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i13 = -i13;
            }
            int i14 = i13 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i14, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i15 = i13 - (i14 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i15 != 0 || this.iMinFields > 1) {
                int i16 = i15 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i16, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i17 = i15 - (i16 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i17 != 0 || this.iMinFields > 2) {
                    int i18 = i17 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i18, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i19 = i17 - (i18 * 1000);
                    if (i19 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i19, 3);
                    }
                }
            }
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i13) throws IOException {
        while (true) {
            i13--;
            if (i13 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i13, String str) {
        int length = str.length();
        if (charSequence.length() - i13 < length) {
            return false;
        }
        for (int i14 = 0; i14 < length; i14++) {
            if (charSequence.charAt(i13 + i14) != str.charAt(i14)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i13, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i13 < length) {
            return false;
        }
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i13 + i14);
            char cCharAt2 = str.charAt(i14);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i13, int i14) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i13, i14);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i13) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i13, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i13) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i13, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i13) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i13, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i13) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i13, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i13) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i13, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i13, int i14) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i14 < i13) {
            i14 = i13;
        }
        if (i13 < 0 || i14 <= 0) {
            throw new IllegalArgumentException();
        }
        return i13 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i14, false)) : append0(new PaddedNumber(dateTimeFieldType, i14, false, i13));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i13) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i13 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i13, false));
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Illegal number of digits: "));
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i13) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i13 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i13, true));
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Illegal number of digits: "));
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i13, int i14) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i14 < i13) {
            i14 = i13;
        }
        if (i13 < 0 || i14 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i13, i14));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i13, int i14) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i13, i14);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i13, int i14) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i13, i14);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i13, int i14) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i13, i14);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i13, int i14) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i13, i14);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i13) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i13, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i13) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i13, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c3) {
        return append0(new CharacterLiteral(c3));
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i13) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i13, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i13) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i13, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i13) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i13, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i13) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i13, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i13) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i13, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.m85493of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i13) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i13, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i13) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i13, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i13, int i14) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i14 < i13) {
            i14 = i13;
        }
        if (i13 < 0 || i14 <= 0) {
            throw new IllegalArgumentException();
        }
        return i13 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i14, true)) : append0(new PaddedNumber(dateTimeFieldType, i14, true, i13));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z4, int i13, int i14) {
        return append0(new TimeZoneOffset(str, str, z4, i13, i14));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i13) {
        return appendTwoDigitWeekyear(i13, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i13) {
        return appendTwoDigitYear(i13, false);
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i13) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i13, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i13, int i14) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i13, i14);
    }

    public DateTimeFormatterBuilder appendYear(int i13, int i14) {
        return appendSignedDecimal(DateTimeFieldType.year(), i13, i14);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i13, int i14) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i13, i14);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i13, int i14) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i13, i14);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.m85495of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.m85496of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z4) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z4;
        }

        private String print(long j7, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j7, locale) : field.getAsText(j7, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            int iIntValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap = cParseCache.get(locale);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap);
            }
            Object[] objArr = concurrentHashMap.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i13;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(asShortText, bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if (LanguageRepositoryKt.DEFAULT_LANGUAGE.equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap.put(this.iFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(iIntValue)});
                map = concurrentHashMap2;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i13); iMin > i13; iMin--) {
                String string = charSequence.subSequence(i13, iMin).toString();
                if (map.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j7, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
                if (this.iShort) {
                    return field.getAsShortText(readablePartial, locale);
                }
                return field.getAsText(readablePartial, locale);
            }
            return "�";
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i13, boolean z4) {
            this.iType = dateTimeFieldType;
            this.iPivot = i13;
            this.iLenientParse = z4;
        }

        private int getTwoDigitYear(long j7, Chronology chronology) {
            try {
                int i13 = this.iType.getField(chronology).get(j7);
                if (i13 < 0) {
                    i13 = -i13;
                }
                return i13 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            int i14;
            int i15;
            int length = charSequence.length() - i13;
            if (this.iLenientParse) {
                int i16 = 0;
                boolean z4 = false;
                boolean z13 = false;
                while (i16 < length) {
                    char cCharAt = charSequence.charAt(i13 + i16);
                    if (i16 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z13 = cCharAt == '-';
                        if (z13) {
                            i16++;
                        } else {
                            i13++;
                            length--;
                        }
                        z4 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i16++;
                    }
                }
                if (i16 == 0) {
                    return ~i13;
                }
                if (z4 || i16 != 2) {
                    if (i16 >= 9) {
                        i14 = i16 + i13;
                        i15 = Integer.parseInt(charSequence.subSequence(i13, i14).toString());
                    } else {
                        int i17 = z13 ? i13 + 1 : i13;
                        int i18 = i17 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i17) - '0';
                            i14 = i16 + i13;
                            while (i18 < i14) {
                                int iCharAt2 = (charSequence.charAt(i18) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i18++;
                                iCharAt = iCharAt2;
                            }
                            i15 = z13 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i13;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i15);
                    return i14;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i13;
            }
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i13;
            }
            int i19 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i13 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i13;
            }
            int i24 = (((i19 << 3) + (i19 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i25 = iIntValue - 50;
            int i26 = i25 >= 0 ? i25 % 100 : ((iIntValue - 49) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, ((i25 + (i24 < i26 ? 100 : 0)) - i26) + i24);
            return i13 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j7, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i13 = readablePartial.get(this.iType);
                if (i13 < 0) {
                    i13 = -i13;
                }
                return i13 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            } else {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            }
        }
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return length != 1 ? append0(new StringLiteral(str)) : append0(new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z4, int i13, int i14) {
        return append0(new TimeZoneOffset(str, str2, z4, i13, i14));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i13, boolean z4) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i13, z4));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i13, boolean z4) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i13, z4));
    }

    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i13, boolean z4, int i14) {
            super(dateTimeFieldType, i13, z4);
            this.iMinPrintedDigits = i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j7), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException unused) {
                    DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                    return;
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i13, boolean z4) {
            super(dateTimeFieldType, i13, z4);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j7));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException unused) {
                    appendable.append((char) 65533);
                    return;
                }
            }
            appendable.append((char) 65533);
        }
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.m85494of(dateTimePrinter), null);
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i13);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i13] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i14);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i14] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13 += 2) {
                Object obj = list.get(i13);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i13 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i13) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            for (int i14 = 0; i14 < length && i13 >= 0; i14++) {
                i13 = internalParserArr[i14].parseInto(dateTimeParserBucket, charSequence, i13);
            }
            return i13;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j7, Chronology chronology, int i13, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j7, chronology, i13, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.m85493of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.m85494of(dateTimePrinter), DateTimeParserInternalParser.m85493of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr != null) {
            int length = dateTimeParserArr.length;
            int i13 = 0;
            if (length == 1) {
                if (dateTimeParserArr[0] != null) {
                    return append0(DateTimePrinterInternalPrinter.m85494of(dateTimePrinter), DateTimeParserInternalParser.m85493of(dateTimeParserArr[0]));
                }
                throw new IllegalArgumentException("No parser supplied");
            }
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i13 < length - 1) {
                InternalParser internalParserM85493of = DateTimeParserInternalParser.m85493of(dateTimeParserArr[i13]);
                internalParserArr[i13] = internalParserM85493of;
                if (internalParserM85493of == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i13++;
            }
            internalParserArr[i13] = DateTimeParserInternalParser.m85493of(dateTimeParserArr[i13]);
            return append0(DateTimePrinterInternalPrinter.m85494of(dateTimePrinter), new MatchingParser(internalParserArr));
        }
        throw new IllegalArgumentException("No parsers supplied");
    }
}
