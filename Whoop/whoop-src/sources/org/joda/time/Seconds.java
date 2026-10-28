package org.joda.time;

import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class Seconds extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380862L;
    public static final Seconds ZERO = new Seconds(0);
    public static final Seconds ONE = new Seconds(1);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
    public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());

    private Seconds(int i13) {
        super(i13);
    }

    @FromString
    public static Seconds parseSeconds(String str) {
        return str == null ? ZERO : seconds(PARSER.parsePeriod(str).getSeconds());
    }

    private Object readResolve() {
        return seconds(getValue());
    }

    public static Seconds seconds(int i13) {
        if (i13 == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i13 == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        if (i13 == 0) {
            return ZERO;
        }
        if (i13 == 1) {
            return ONE;
        }
        if (i13 != 2) {
            return i13 != 3 ? new Seconds(i13) : THREE;
        }
        return TWO;
    }

    public static Seconds secondsBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return seconds(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.seconds()));
    }

    public static Seconds secondsIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : seconds(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.seconds()));
    }

    public static Seconds standardSecondsIn(ReadablePeriod readablePeriod) {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 1000L));
    }

    public Seconds dividedBy(int i13) {
        return i13 == 1 ? this : seconds(getValue() / i13);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.seconds();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.seconds();
    }

    public int getSeconds() {
        return getValue();
    }

    public boolean isGreaterThan(Seconds seconds) {
        if (seconds == null) {
            return getValue() > 0;
        }
        return getValue() > seconds.getValue();
    }

    public boolean isLessThan(Seconds seconds) {
        if (seconds == null) {
            return getValue() < 0;
        }
        return getValue() < seconds.getValue();
    }

    public Seconds minus(int i13) {
        return plus(FieldUtils.safeNegate(i13));
    }

    public Seconds multipliedBy(int i13) {
        return seconds(FieldUtils.safeMultiply(getValue(), i13));
    }

    public Seconds negated() {
        return seconds(FieldUtils.safeNegate(getValue()));
    }

    public Seconds plus(int i13) {
        return i13 == 0 ? this : seconds(FieldUtils.safeAdd(getValue(), i13));
    }

    public Days toStandardDays() {
        return Days.days(getValue() / DateTimeConstants.SECONDS_PER_DAY);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 1000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / DateTimeConstants.SECONDS_PER_HOUR);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(getValue() / 60);
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.SECONDS_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "S";
    }

    public Seconds minus(Seconds seconds) {
        return seconds == null ? this : minus(seconds.getValue());
    }

    public Seconds plus(Seconds seconds) {
        return seconds == null ? this : plus(seconds.getValue());
    }

    public static Seconds secondsBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        if ((readablePartial instanceof LocalTime) && (readablePartial2 instanceof LocalTime)) {
            return seconds(DateTimeUtils.getChronology(readablePartial.getChronology()).seconds().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()));
        }
        return seconds(BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }
}
