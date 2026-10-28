package org.joda.time;

import java.io.Serializable;
import java.math.RoundingMode;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;
import p715kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes5.dex */
public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j7) {
        super(j7);
    }

    public static Duration millis(long j7) {
        return j7 == 0 ? ZERO : new Duration(j7);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j7) {
        return j7 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j7, DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j7) {
        return j7 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j7, DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j7) {
        return j7 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j7, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j7) {
        return j7 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j7, 1000));
    }

    public Duration abs() {
        return getMillis() < 0 ? negated() : this;
    }

    public Duration dividedBy(long j7) {
        return j7 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j7));
    }

    public long getStandardDays() {
        return getMillis() / DurationKt.MILLIS_IN_DAY;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(long j7) {
        return withDurationAdded(j7, -1);
    }

    public Duration multipliedBy(long j7) {
        return j7 == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j7));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(long j7) {
        return withDurationAdded(j7, 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j7, int i13) {
        if (j7 == 0 || i13 == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j7, i13)));
    }

    public Duration withMillis(long j7) {
        return j7 == getMillis() ? this : new Duration(j7);
    }

    public Duration(long j7, long j13) {
        super(j7, j13);
    }

    public Duration dividedBy(long j7, RoundingMode roundingMode) {
        return j7 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j7, roundingMode));
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i13) {
        return (readableDuration == null || i13 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i13);
    }
}
