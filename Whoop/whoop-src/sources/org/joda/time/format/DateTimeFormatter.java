package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import live.hms.video.error.ErrorCodes;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.m85494of(dateTimePrinter), DateTimeParserInternalParser.m85493of(dateTimeParser));
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        return dateTimeZone != null ? chronology2.withZone(dateTimeZone) : chronology2;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.m85495of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.m85496of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    public DateTime parseDateTime(String str) {
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologySelectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologySelectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                chronologySelectChronology = chronologySelectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                chronologySelectChronology = chronologySelectChronology.withZone(dateTimeParserBucket.getZone());
            }
            DateTime dateTime = new DateTime(jComputeMillis, chronologySelectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            return dateTimeZone != null ? dateTime.withZone(dateTimeZone) : dateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public int parseInto(ReadWritableInstant readWritableInstant, String str, int i13) {
        InternalParser internalParserRequireParser = requireParser();
        if (readWritableInstant == null) {
            throw new IllegalArgumentException("Instant must not be null");
        }
        long millis = readWritableInstant.getMillis();
        Chronology chronology = readWritableInstant.getChronology();
        int i14 = DateTimeUtils.getChronology(chronology).year().get(millis);
        long offset = millis + ((long) chronology.getZone().getOffset(millis));
        Chronology chronologySelectChronology = selectChronology(chronology);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(offset, chronologySelectChronology, this.iLocale, this.iPivotYear, i14);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, i13);
        readWritableInstant.setMillis(dateTimeParserBucket.computeMillis(false, str));
        if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
            chronologySelectChronology = chronologySelectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
        } else if (dateTimeParserBucket.getZone() != null) {
            chronologySelectChronology = chronologySelectChronology.withZone(dateTimeParserBucket.getZone());
        }
        readWritableInstant.setChronology(chronologySelectChronology);
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone != null) {
            readWritableInstant.setZone(dateTimeZone);
        }
        return into;
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologyWithUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologyWithUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (dateTimeParserBucket.getOffsetInteger() != null) {
                chronologyWithUTC = chronologyWithUTC.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                chronologyWithUTC = chronologyWithUTC.withZone(dateTimeParserBucket.getZone());
            }
            return new LocalDateTime(jComputeMillis, chronologyWithUTC);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    public MutableDateTime parseMutableDateTime(String str) {
        InternalParser internalParserRequireParser = requireParser();
        Chronology chronologySelectChronology = selectChronology(null);
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, chronologySelectChronology, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int into = internalParserRequireParser.parseInto(dateTimeParserBucket, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jComputeMillis = dateTimeParserBucket.computeMillis(true, str);
            if (this.iOffsetParsed && dateTimeParserBucket.getOffsetInteger() != null) {
                chronologySelectChronology = chronologySelectChronology.withZone(DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue()));
            } else if (dateTimeParserBucket.getZone() != null) {
                chronologySelectChronology = chronologySelectChronology.withZone(dateTimeParserBucket.getZone());
            }
            MutableDateTime mutableDateTime = new MutableDateTime(jComputeMillis, chronologySelectChronology);
            DateTimeZone dateTimeZone = this.iZone;
            if (dateTimeZone != null) {
                mutableDateTime.setZone(dateTimeZone);
            }
            return mutableDateTime;
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, into));
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb4 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb4, readableInstant);
        } catch (IOException unused) {
        }
        return sb4.toString();
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException unused) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return this.iChrono == chronology ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i13) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i13);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withOffsetParsed() {
        return this.iOffsetParsed ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == null ? Long.MIN_VALUE : (long) num2.intValue()) == (num != null ? (long) num.intValue() : Long.MIN_VALUE) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        return this.iZone == dateTimeZone ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = ErrorCodes.InitAPIErrors.cServerErrors;
    }

    public void printTo(StringBuilder sb4, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) sb4, readableInstant);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) throws IOException {
        printTo((Appendable) writer, readableInstant);
    }

    public String print(long j7) {
        StringBuilder sb4 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb4, j7);
        } catch (IOException unused) {
        }
        return sb4.toString();
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) throws IOException {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public DateTimeFormatter withPivotYear(int i13) {
        return withPivotYear(Integer.valueOf(i13));
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb4 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo((Appendable) sb4, readablePartial);
        } catch (IOException unused) {
        }
        return sb4.toString();
    }

    public void printTo(StringBuffer stringBuffer, long j7) {
        try {
            printTo((Appendable) stringBuffer, j7);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb4, long j7) {
        try {
            printTo((Appendable) sb4, j7);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, long j7) throws IOException {
        printTo((Appendable) writer, j7);
    }

    public void printTo(Appendable appendable, long j7) throws IOException {
        printTo(appendable, j7, null);
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z4, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i13) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z4;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i13;
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(StringBuilder sb4, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) sb4, readablePartial);
        } catch (IOException unused) {
        }
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) throws IOException {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) throws IOException {
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        if (readablePartial != null) {
            internalPrinterRequirePrinter.printTo(appendable, readablePartial, this.iLocale);
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    private void printTo(Appendable appendable, long j7, Chronology chronology) throws IOException {
        long j13 = j7;
        InternalPrinter internalPrinterRequirePrinter = requirePrinter();
        Chronology chronologySelectChronology = selectChronology(chronology);
        DateTimeZone zone = chronologySelectChronology.getZone();
        int offset = zone.getOffset(j13);
        long j14 = offset;
        long j15 = j13 + j14;
        if ((j13 ^ j15) >= 0 || (j14 ^ j13) < 0) {
            j13 = j15;
        } else {
            zone = DateTimeZone.UTC;
            offset = 0;
        }
        internalPrinterRequirePrinter.printTo(appendable, j13, chronologySelectChronology.withUTC(), offset, zone, this.iLocale);
    }
}
