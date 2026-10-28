package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes5.dex */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int length = Integer.MAX_VALUE;
                String str = null;
                for (String str2 : getAffixes()) {
                    if (str2.length() < length) {
                        length = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > length || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i13, String str, int i14) {
            String str2;
            int i15;
            if (this.iOtherAffixes != null) {
                String[] strArr = this.iOtherAffixes;
                int length = strArr.length;
                int i16 = 0;
                while (i16 < length) {
                    String str3 = strArr[i16];
                    int length2 = str3.length();
                    if (i13 < length2) {
                        str2 = str;
                        i15 = i14;
                        if (str2.regionMatches(true, i15, str3, 0, length2)) {
                            return true;
                        }
                    } else {
                        str2 = str;
                        i15 = i14;
                    }
                    if (i13 == length2 && str2.regionMatches(false, i15, str3, 0, length2)) {
                        return true;
                    }
                    i16++;
                    str = str2;
                    i14 = i15;
                }
            }
            return false;
        }
    }

    public static class Literal implements PeriodPrinter, PeriodParser {
        static final Literal EMPTY = new Literal("");
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i13, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i13, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i13, str2, 0, str2.length()) ? this.iText.length() + i13 : ~i13;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            writer.write(this.iText);
        }
    }

    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i13);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i13);

        void printTo(Writer writer, int i13) throws IOException;

        void printTo(StringBuffer stringBuffer, int i13);

        int scan(String str, int i13);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i13) {
            return (i13 == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i13) {
            String str2;
            String str3;
            int length;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            if (str.regionMatches(true, i13, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i13)) {
                length = str2.length();
            } else {
                if (!str.regionMatches(true, i13, str3, 0, str3.length()) || matchesOtherAffix(str3.length(), str, i13)) {
                    return ~i13;
                }
                length = str3.length();
            }
            return length + i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i13) {
            stringBuffer.append(i13 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i13) {
            String str2;
            String str3;
            String str4 = this.iPluralText;
            String str5 = this.iSingularText;
            if (str4.length() < str5.length()) {
                str3 = str4;
                str2 = str5;
            } else {
                str2 = str4;
                str3 = str5;
            }
            int length = str2.length();
            int length2 = str3.length();
            int length3 = str.length();
            int i14 = i13;
            while (i14 < length3) {
                String str6 = str;
                if (!str6.regionMatches(true, i14, str2, 0, length) || matchesOtherAffix(str2.length(), str6, i14)) {
                    int i15 = length2;
                    if (!str6.regionMatches(true, i14, str3, 0, i15) || matchesOtherAffix(str3.length(), str6, i14)) {
                        i14++;
                        str = str6;
                        length2 = i15;
                    }
                }
                return i14;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i13) throws IOException {
            writer.write(i13 == 1 ? this.iSingularText : this.iPluralText);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i13 = 0; i13 < strArr.length; i13++) {
                Pattern patternCompile = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i13]);
                if (patternCompile == null) {
                    patternCompile = Pattern.compile(strArr[i13]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i13], patternCompile);
                }
                this.iPatterns[i13] = patternCompile;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i13) {
            String strValueOf = String.valueOf(i13);
            int i14 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i14 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i14].matcher(strValueOf).matches()) {
                    return i14;
                }
                i14++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i13) {
            return this.iSuffixes[selectSuffixIndex(i13)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i13) {
            String[] strArr = this.iSuffixesSortedDescByLength;
            int length = strArr.length;
            int i14 = 0;
            while (i14 < length) {
                String str2 = strArr[i14];
                String str3 = str;
                int i15 = i13;
                if (str3.regionMatches(true, i15, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i15)) {
                    return str2.length() + i15;
                }
                i14++;
                str = str3;
                i13 = i15;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i13) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i13)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i13) {
            int length = str.length();
            for (int i14 = i13; i14 < length; i14++) {
                String[] strArr = this.iSuffixesSortedDescByLength;
                int length2 = strArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    String str2 = strArr[i15];
                    String str3 = str;
                    if (str3.regionMatches(true, i14, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str3, i14)) {
                        return i14;
                    }
                    i15++;
                    str = str3;
                }
            }
            return ~i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i13) throws IOException {
            writer.write(this.iSuffixes[selectSuffixIndex(i13)]);
        }
    }

    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i13) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i13) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i13, str2, 0, length) || matchesOtherAffix(length, str, i13)) ? ~i13 : i13 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i13) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i13) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            int i14 = i13;
            while (i14 < length2) {
                String str3 = str;
                if (str3.regionMatches(true, i14, str2, 0, length) && !matchesOtherAffix(length, str3, i14)) {
                    return i14;
                }
                switch (str3.charAt(i14)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i14++;
                        str = str3;
                        break;
                }
                return ~i13;
            }
            return ~i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i13) throws IOException {
            writer.write(this.iText);
        }
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i13) {
        appendField(i13, this.iMinPrintedDigits);
    }

    private void clearPrefix() throws IllegalStateException {
        if (this.iPrefix != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.iPrefix = null;
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i13) {
        this.iMaxParsedDigits = i13;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i13) {
        this.iMinPrintedDigits = i13;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z4) {
        this.iRejectSignedValues = z4;
        return this;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i13) {
            return this.iLeft.calculatePrintedLength(i13) + this.iRight.calculatePrintedLength(i13);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i13) {
            int i14 = this.iLeft.parse(str, i13);
            return (i14 < 0 || (i14 = this.iRight.parse(str, i14)) < 0 || !matchesOtherAffix(parse(str, i14) - i14, str, i13)) ? i14 : ~i13;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i13) {
            this.iLeft.printTo(stringBuffer, i13);
            this.iRight.printTo(stringBuffer, i13);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i13) {
            int iScan;
            int iScan2 = this.iLeft.scan(str, i13);
            if (iScan2 < 0 || ((iScan = this.iRight.scan(str, this.iLeft.parse(str, iScan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, iScan) - iScan2, str, i13))) {
                return ~i13;
            }
            return iScan2 > 0 ? iScan2 : iScan;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i13) throws IOException {
            this.iLeft.printTo(writer, i13);
            this.iRight.printTo(writer, i13);
        }
    }

    private void appendField(int i13, int i14) {
        FieldFormatter fieldFormatter = new FieldFormatter(i14, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i13, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i13] = fieldFormatter;
        this.iPrefix = null;
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
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
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i13 + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCalculatePrintedLength = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return iCalculatePrintedLength;
                }
                iCalculatePrintedLength += periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i13, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int iCountFieldsToPrint = 0;
            while (iCountFieldsToPrint < i13) {
                length--;
                if (length < 0) {
                    break;
                }
                iCountFieldsToPrint += periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return iCountFieldsToPrint;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i13, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = periodParserArr.length;
            for (int i14 = 0; i14 < length && i13 >= 0; i14++) {
                i13 = periodParserArr[i14].parseInto(readWritablePeriod, str, i13, locale);
            }
            return i13;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendPrefix(new PluralAffix(str, str2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str != null && str2 != null) {
            return appendSuffix(new PluralAffix(str, str2));
        }
        throw new IllegalArgumentException();
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z4, boolean z13) {
        Separator separator;
        if (str != null && str2 != null) {
            clearPrefix();
            List<Object> listSubList = this.iElementPairs;
            if (listSubList.size() == 0) {
                if (z13 && !z4) {
                    Literal literal = Literal.EMPTY;
                    Separator separator2 = new Separator(str, str2, strArr, literal, literal, z4, z13);
                    append0(separator2, separator2);
                }
                return this;
            }
            int size = listSubList.size();
            while (true) {
                int i13 = size - 1;
                if (i13 < 0) {
                    separator = null;
                    break;
                }
                if (listSubList.get(i13) instanceof Separator) {
                    separator = (Separator) listSubList.get(i13);
                    listSubList = listSubList.subList(size, listSubList.size());
                    break;
                }
                size -= 2;
            }
            if (separator != null && listSubList.size() == 0) {
                throw new IllegalStateException("Cannot have two adjacent separators");
            }
            Object[] objArrCreateComposite = createComposite(listSubList);
            listSubList.clear();
            Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1], z4, z13);
            listSubList.add(separator3);
            listSubList.add(separator3);
            return this;
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    private static PeriodFormatter toFormatter(List<Object> list, boolean z4, boolean z13) {
        if (z4 && z13) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof Separator)) {
            Separator separator = (Separator) list.get(0);
            if (separator.iAfterParser == null && separator.iAfterPrinter == null) {
                PeriodFormatter formatter = toFormatter(list.subList(2, size), z4, z13);
                Separator separatorFinish = separator.finish(formatter.getPrinter(), formatter.getParser());
                return new PeriodFormatter(separatorFinish, separatorFinish);
            }
        }
        Object[] objArrCreateComposite = createComposite(list);
        if (z4) {
            return new PeriodFormatter(null, (PeriodParser) objArrCreateComposite[1]);
        }
        if (z13) {
            return new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], null);
        }
        return new PeriodFormatter((PeriodPrinter) objArrCreateComposite[0], (PeriodParser) objArrCreateComposite[1]);
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendPrefix(new RegExAffix(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length >= 1 && strArr.length == strArr2.length) {
            return appendSuffix(new RegExAffix(strArr, strArr2));
        }
        throw new IllegalArgumentException();
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix != null) {
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
            }
            this.iPrefix = periodFieldAffix;
            return this;
        }
        throw new IllegalArgumentException();
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object objM30455i;
        Object objM30455i2;
        if (this.iElementPairs.size() > 0) {
            objM30455i = AbstractC11266d.m30455i(2, this.iElementPairs);
            objM30455i2 = AbstractC11266d.m30455i(1, this.iElementPairs);
        } else {
            objM30455i = null;
            objM30455i2 = null;
        }
        if (objM30455i != null && objM30455i2 != null && objM30455i == objM30455i2 && (objM30455i instanceof FieldFormatter)) {
            clearPrefix();
            FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) objM30455i, periodFieldAffix);
            List<Object> list = this.iElementPairs;
            list.set(list.size() - 2, fieldFormatter);
            List<Object> list2 = this.iElementPairs;
            list2.set(list2.size() - 1, fieldFormatter);
            this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
            return this;
        }
        throw new IllegalStateException("No field to apply suffix to");
    }

    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(int i13, int i14, int i15, boolean z4, int i16, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i13;
            this.iPrintZeroSetting = i14;
            this.iMaxParsedDigits = i15;
            this.iRejectSignedValues = z4;
            this.iFieldType = i16;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        private int parseInt(String str, int i13, int i14) {
            if (i14 >= 10) {
                return Integer.parseInt(str.substring(i13, i14 + i13));
            }
            boolean z4 = false;
            if (i14 <= 0) {
                return 0;
            }
            int i15 = i13 + 1;
            char cCharAt = str.charAt(i13);
            int i16 = i14 - 1;
            if (cCharAt == '-') {
                i16 = i14 - 2;
                if (i16 < 0) {
                    return 0;
                }
                cCharAt = str.charAt(i15);
                z4 = true;
                i15 = i13 + 2;
            }
            int i17 = cCharAt - '0';
            while (true) {
                int i18 = i16 - 1;
                if (i16 <= 0) {
                    break;
                }
                int iCharAt = (str.charAt(i15) + ((i17 << 3) + (i17 << 1))) - 48;
                i16 = i18;
                i15++;
                i17 = iCharAt;
            }
            return z4 ? -i17 : i17;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return 0;
            }
            int iMax = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            if (this.iFieldType >= 8) {
                int iMax2 = Math.max(iMax, fieldValue < 0 ? 5 : 4);
                iMax = (this.iFieldType == 9 && Math.abs(fieldValue) % 1000 == 0) ? iMax2 - 3 : iMax2 + 1;
                fieldValue /= 1000;
            }
            int i13 = (int) fieldValue;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                iMax += periodFieldAffix.calculatePrintedLength(i13);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            return periodFieldAffix2 != null ? iMax + periodFieldAffix2.calculatePrintedLength(i13) : iMax;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i13, Locale locale) {
            if (i13 <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != Long.MAX_VALUE) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x008c  */
        /* JADX WARN: Code duplicated, block: B:30:0x008f  */
        /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x0094  */
        /* JADX WARN: Code duplicated, block: B:36:0x009a  */
        /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00be  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:55:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:63:0x00b4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00dd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00cc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        public long getFieldValue(ReadablePeriod readablePeriod) {
            int i13;
            long j7;
            int i14;
            FieldFormatter[] fieldFormatterArr;
            int i15;
            int iMin;
            FieldFormatter[] fieldFormatterArr2;
            int i16;
            int i17;
            PeriodType periodType = this.iPrintZeroSetting == 4 ? null : readablePeriod.getPeriodType();
            if (periodType != null && !isSupported(periodType, this.iFieldType)) {
                return Long.MAX_VALUE;
            }
            switch (this.iFieldType) {
                case 0:
                    i13 = readablePeriod.get(DurationFieldType.years());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin) || this.iFieldFormatters[iMin] == null) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    for (i17 = i16 + 1; i17 <= 9; i17++) {
                                        if (!isSupported(periodType, i17) && this.iFieldFormatters[i17] != null) {
                                            return Long.MAX_VALUE;
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 1:
                    i13 = readablePeriod.get(DurationFieldType.months());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 2:
                    i13 = readablePeriod.get(DurationFieldType.weeks());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 3:
                    i13 = readablePeriod.get(DurationFieldType.days());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 4:
                    i13 = readablePeriod.get(DurationFieldType.hours());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 5:
                    i13 = readablePeriod.get(DurationFieldType.minutes());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 6:
                    i13 = readablePeriod.get(DurationFieldType.seconds());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 7:
                    i13 = readablePeriod.get(DurationFieldType.millis());
                    j7 = i13;
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                case 8:
                case 9:
                    j7 = (((long) readablePeriod.get(DurationFieldType.seconds())) * 1000) + ((long) readablePeriod.get(DurationFieldType.millis()));
                    if (j7 == 0) {
                        i14 = this.iPrintZeroSetting;
                        if (i14 == 1) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr = this.iFieldFormatters;
                                i15 = this.iFieldType;
                                if (fieldFormatterArr[i15] == this) {
                                    iMin = Math.min(i15, 8);
                                    while (true) {
                                        iMin--;
                                        if (iMin >= 0) {
                                            if (isSupported(periodType, iMin)) {
                                            }
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 2) {
                            if (isZero(readablePeriod)) {
                                fieldFormatterArr2 = this.iFieldFormatters;
                                i16 = this.iFieldType;
                                if (fieldFormatterArr2[i16] == this) {
                                    while (i17 <= 9) {
                                        if (!isSupported(periodType, i17)) {
                                        }
                                    }
                                }
                            }
                            return Long.MAX_VALUE;
                        }
                        if (i14 == 5) {
                            return Long.MAX_VALUE;
                        }
                    }
                    return j7;
                default:
                    return Long.MAX_VALUE;
            }
        }

        public boolean isSupported(PeriodType periodType, int i13) {
            switch (i13) {
                case 0:
                    return periodType.isSupported(DurationFieldType.years());
                case 1:
                    return periodType.isSupported(DurationFieldType.months());
                case 2:
                    return periodType.isSupported(DurationFieldType.weeks());
                case 3:
                    return periodType.isSupported(DurationFieldType.days());
                case 4:
                    return periodType.isSupported(DurationFieldType.hours());
                case 5:
                    return periodType.isSupported(DurationFieldType.minutes());
                case 6:
                    return periodType.isSupported(DurationFieldType.seconds());
                case 7:
                    return periodType.isSupported(DurationFieldType.millis());
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (readablePeriod.getValue(i13) != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i13, Locale locale) {
            int iScan;
            int i14;
            PeriodFieldAffix periodFieldAffix;
            int i15;
            char cCharAt;
            int i16 = i13;
            boolean z4 = this.iPrintZeroSetting == 4;
            if (i16 >= str.length()) {
                return z4 ? ~i16 : i16;
            }
            PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
            if (periodFieldAffix2 != null) {
                i16 = periodFieldAffix2.parse(str, i16);
                if (i16 < 0) {
                    return !z4 ? ~i16 : i16;
                }
                z4 = true;
            }
            PeriodFieldAffix periodFieldAffix3 = this.iSuffix;
            int i17 = -1;
            if (periodFieldAffix3 == null || z4) {
                iScan = -1;
            } else {
                iScan = periodFieldAffix3.scan(str, i16);
                if (iScan < 0) {
                    return !z4 ? ~iScan : iScan;
                }
                z4 = true;
            }
            if (!z4 && !isSupported(readWritablePeriod.getPeriodType(), this.iFieldType)) {
                return i16;
            }
            int iMin = iScan > 0 ? Math.min(this.iMaxParsedDigits, iScan - i16) : Math.min(this.iMaxParsedDigits, str.length() - i16);
            int i18 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (true) {
                if (i18 >= iMin) {
                    i14 = 1;
                    break;
                }
                int i19 = i16 + i18;
                char cCharAt2 = str.charAt(i19);
                i14 = 1;
                if (i18 != 0 || (!(cCharAt2 == '-' || cCharAt2 == '+') || this.iRejectSignedValues)) {
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        z13 = true;
                    } else {
                        if ((cCharAt2 != '.' && cCharAt2 != ',') || (((i15 = this.iFieldType) != 8 && i15 != 9) || i17 >= 0)) {
                            break;
                        }
                        iMin = Math.min(iMin + 1, str.length() - i16);
                        i17 = i19 + 1;
                    }
                    i18++;
                } else {
                    z14 = cCharAt2 == '-';
                    int i24 = i18 + 1;
                    if (i24 >= iMin || (cCharAt = str.charAt(i19 + 1)) < '0' || cCharAt > '9') {
                        break;
                    }
                    if (z14) {
                        i18 = i24;
                    } else {
                        i16++;
                    }
                    iMin = Math.min(iMin + 1, str.length() - i16);
                }
            }
            if (!z13) {
                return ~i16;
            }
            if (iScan >= 0 && i16 + i18 != iScan) {
                return i16;
            }
            int i25 = this.iFieldType;
            if (i25 != 8 && i25 != 9) {
                setFieldValue(readWritablePeriod, i25, parseInt(str, i16, i18));
            } else if (i17 < 0) {
                setFieldValue(readWritablePeriod, 6, parseInt(str, i16, i18));
                setFieldValue(readWritablePeriod, 7, 0);
            } else {
                int i26 = 0;
                int i27 = parseInt(str, i16, (i17 - i16) - 1);
                setFieldValue(readWritablePeriod, 6, i27);
                int i28 = (i16 + i18) - i17;
                if (i28 > 0) {
                    if (i28 >= 3) {
                        i26 = parseInt(str, i17, 3);
                    } else {
                        int i29 = parseInt(str, i17, i28);
                        i26 = i28 == i14 ? i29 * 100 : i29 * 10;
                    }
                    if (z14 || i27 < 0) {
                        i26 = -i26;
                    }
                }
                setFieldValue(readWritablePeriod, 7, i26);
            }
            int i34 = i16 + i18;
            return (i34 < 0 || (periodFieldAffix = this.iSuffix) == null) ? i34 : periodFieldAffix.parse(str, i34);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i13 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i13 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i13);
            }
            int length = stringBuffer.length();
            int i14 = this.iMinPrintedDigits;
            if (i14 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i13);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i13, i14);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i13);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i13, int i14) {
            switch (i13) {
                case 0:
                    readWritablePeriod.setYears(i14);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i14);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i14);
                    break;
                case 3:
                    readWritablePeriod.setDays(i14);
                    break;
                case 4:
                    readWritablePeriod.setHours(i14);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i14);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i14);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i14);
                    break;
            }
        }

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i13 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i13 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i13);
            }
            int i14 = this.iMinPrintedDigits;
            if (i14 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i13);
            } else {
                FormatUtils.writePaddedInteger(writer, i13, i14);
            }
            if (this.iFieldType >= 8) {
                int iAbs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || iAbs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, iAbs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i13);
            }
        }
    }

    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z4, boolean z13) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z4;
            this.iUseAfter = z13;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            int length;
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            int iCalculatePrintedLength = periodPrinter2.calculatePrintedLength(readablePeriod, locale) + periodPrinter.calculatePrintedLength(readablePeriod, locale);
            if (!this.iUseBefore) {
                if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    length = this.iText.length();
                    return length + iCalculatePrintedLength;
                }
                return iCalculatePrintedLength;
            }
            if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                if (this.iUseAfter) {
                    int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                    if (iCountFieldsToPrint > 0) {
                        length = (iCountFieldsToPrint > 1 ? this.iText : this.iFinalText).length();
                    }
                } else {
                    length = this.iText.length();
                }
                return length + iCalculatePrintedLength;
            }
            return iCalculatePrintedLength;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i13, Locale locale) {
            int iCountFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i13, locale);
            return iCountFieldsToPrint < i13 ? this.iAfterPrinter.countFieldsToPrint(readablePeriod, i13, locale) + iCountFieldsToPrint : iCountFieldsToPrint;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i13, Locale locale) {
            String str2;
            int i14;
            int into = this.iBeforeParser.parseInto(readWritablePeriod, str, i13, locale);
            if (into < 0) {
                return into;
            }
            int length = 0;
            if (into > i13) {
                String[] strArr = this.iParsedForms;
                int length2 = strArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length2) {
                        str2 = str;
                        i14 = -1;
                    } else {
                        String str3 = strArr[i15];
                        if (str3 == null || str3.length() == 0) {
                            str2 = str;
                        } else {
                            str2 = str;
                            if (!str2.regionMatches(true, into, str3, 0, str3.length())) {
                                i15++;
                                str = str2;
                            }
                        }
                        length = str3 != null ? str3.length() : 0;
                        into += length;
                        int i16 = length;
                        length = 1;
                        i14 = i16;
                    }
                }
            } else {
                str2 = str;
                i14 = -1;
            }
            int into2 = this.iAfterParser.parseInto(readWritablePeriod, str2, into, locale);
            if (into2 < 0) {
                return into2;
            }
            if (length == 0 || into2 != into || i14 <= 0) {
                return (into2 <= into || length != 0 || this.iUseBefore) ? into2 : ~into;
            }
            return ~into;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            stringBuffer.append(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        stringBuffer.append(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                stringBuffer.append(this.iText);
            }
            periodPrinter2.printTo(stringBuffer, readablePeriod, locale);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) throws IOException {
            PeriodPrinter periodPrinter = this.iBeforePrinter;
            PeriodPrinter periodPrinter2 = this.iAfterPrinter;
            periodPrinter.printTo(writer, readablePeriod, locale);
            if (this.iUseBefore) {
                if (periodPrinter.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                    if (this.iUseAfter) {
                        int iCountFieldsToPrint = periodPrinter2.countFieldsToPrint(readablePeriod, 2, locale);
                        if (iCountFieldsToPrint > 0) {
                            writer.write(iCountFieldsToPrint > 1 ? this.iText : this.iFinalText);
                        }
                    } else {
                        writer.write(this.iText);
                    }
                }
            } else if (this.iUseAfter && periodPrinter2.countFieldsToPrint(readablePeriod, 1, locale) > 0) {
                writer.write(this.iText);
            }
            periodPrinter2.printTo(writer, readablePeriod, locale);
        }
    }
}
