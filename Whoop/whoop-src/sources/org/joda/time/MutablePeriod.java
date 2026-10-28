package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public class MutablePeriod extends BasePeriod implements ReadWritablePeriod, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod() {
        super(0L, (PeriodType) null, (Chronology) null);
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, ISOPeriodFormat.standard());
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(DurationFieldType durationFieldType, int i13) {
        super.addField(durationFieldType, i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addDays(int i13) {
        super.addField(DurationFieldType.days(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addHours(int i13) {
        super.addField(DurationFieldType.hours(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMillis(int i13) {
        super.addField(DurationFieldType.millis(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMinutes(int i13) {
        super.addField(DurationFieldType.minutes(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addMonths(int i13) {
        super.addField(DurationFieldType.months(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addSeconds(int i13) {
        super.addField(DurationFieldType.seconds(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addWeeks(int i13) {
        super.addField(DurationFieldType.weeks(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void addYears(int i13) {
        super.addField(DurationFieldType.years(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    @Override // org.joda.time.base.BasePeriod
    public void mergePeriod(ReadablePeriod readablePeriod) {
        super.mergePeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void set(DurationFieldType durationFieldType, int i13) {
        super.setField(durationFieldType, i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setDays(int i13) {
        super.setField(DurationFieldType.days(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setHours(int i13) {
        super.setField(DurationFieldType.hours(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMillis(int i13) {
        super.setField(DurationFieldType.millis(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMinutes(int i13) {
        super.setField(DurationFieldType.minutes(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setMonths(int i13) {
        super.setField(DurationFieldType.months(), i13);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadablePeriod readablePeriod) {
        super.setPeriod(readablePeriod);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setSeconds(int i13) {
        super.setField(DurationFieldType.seconds(), i13);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setValue(int i13, int i14) {
        super.setValue(i13, i14);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setWeeks(int i13) {
        super.setField(DurationFieldType.weeks(), i13);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setYears(int i13) {
        super.setField(DurationFieldType.years(), i13);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (Chronology) null);
    }

    public static MutablePeriod parse(String str, PeriodFormatter periodFormatter) {
        return periodFormatter.parsePeriod(str).toMutablePeriod();
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadablePeriod readablePeriod) {
        super.addPeriod(readablePeriod);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.ReadWritablePeriod
    public void setPeriod(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        super.setPeriod(i13, i14, i15, i16, i17, i18, i19, i24);
    }

    public MutablePeriod(int i13, int i14, int i15, int i16) {
        super(0, 0, 0, 0, i13, i14, i15, i16, PeriodType.standard());
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        setPeriod(FieldUtils.safeAdd(getYears(), i13), FieldUtils.safeAdd(getMonths(), i14), FieldUtils.safeAdd(getWeeks(), i15), FieldUtils.safeAdd(getDays(), i16), FieldUtils.safeAdd(getHours(), i17), FieldUtils.safeAdd(getMinutes(), i18), FieldUtils.safeAdd(getSeconds(), i19), FieldUtils.safeAdd(getMillis(), i24));
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void setPeriod(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            setPeriod(0L);
        } else {
            setPeriod(readableInterval.getStartMillis(), readableInterval.getEndMillis(), DateTimeUtils.getChronology(readableInterval.getChronology()));
        }
    }

    public MutablePeriod(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        super(i13, i14, i15, i16, i17, i18, i19, i24, PeriodType.standard());
    }

    public MutablePeriod(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, PeriodType periodType) {
        super(i13, i14, i15, i16, i17, i18, i19, i24, periodType);
    }

    public MutablePeriod(long j7) {
        super(j7);
    }

    public void setPeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == readableInstant2) {
            setPeriod(0L);
        } else {
            setPeriod(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2));
        }
    }

    public MutablePeriod(long j7, PeriodType periodType) {
        super(j7, periodType, (Chronology) null);
    }

    public MutablePeriod(long j7, Chronology chronology) {
        super(j7, (PeriodType) null, chronology);
    }

    public MutablePeriod(long j7, PeriodType periodType, Chronology chronology) {
        super(j7, periodType, chronology);
    }

    public MutablePeriod(long j7, long j13) {
        super(j7, j13, null, null);
    }

    public MutablePeriod(long j7, long j13, PeriodType periodType) {
        super(j7, j13, periodType, null);
    }

    public void setPeriod(long j7, long j13) {
        setPeriod(j7, j13, null);
    }

    public MutablePeriod(long j7, long j13, Chronology chronology) {
        super(j7, j13, null, chronology);
    }

    @Override // org.joda.time.ReadWritablePeriod
    public void add(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            add(readableInterval.toPeriod(getPeriodType()));
        }
    }

    public void setPeriod(long j7, long j13, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j7, j13));
    }

    public MutablePeriod(long j7, long j13, PeriodType periodType, Chronology chronology) {
        super(j7, j13, periodType, chronology);
    }

    public void add(ReadableDuration readableDuration) {
        if (readableDuration != null) {
            add(new Period(readableDuration.getMillis(), getPeriodType()));
        }
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2, (PeriodType) null);
    }

    public void add(long j7) {
        add(new Period(j7, getPeriodType()));
    }

    public void setPeriod(ReadableDuration readableDuration) {
        setPeriod(readableDuration, (Chronology) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        super(readableInstant, readableInstant2, periodType);
    }

    public void add(long j7, Chronology chronology) {
        add(new Period(j7, getPeriodType(), chronology));
    }

    public void setPeriod(ReadableDuration readableDuration, Chronology chronology) {
        setPeriod(DateTimeUtils.getDurationMillis(readableDuration), chronology);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration, (PeriodType) null);
    }

    public MutablePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        super(readableInstant, readableDuration, periodType);
    }

    public void setPeriod(long j7) {
        setPeriod(j7, (Chronology) null);
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant, (PeriodType) null);
    }

    public void setPeriod(long j7, Chronology chronology) {
        setValues(DateTimeUtils.getChronology(chronology).get(this, j7));
    }

    public MutablePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        super(readableDuration, readableInstant, periodType);
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (Chronology) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (Chronology) null);
    }

    public MutablePeriod(Object obj, Chronology chronology) {
        super(obj, (PeriodType) null, chronology);
    }

    public MutablePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        super(obj, periodType, chronology);
    }
}
