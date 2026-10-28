package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes5.dex */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {
    private static final long WEEK_53 = 31449600000L;
    private static final long serialVersionUID = 6215066916806820644L;
    private final BasicChronology iChronology;

    public BasicWeekyearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.weekyear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return i13 == 0 ? j7 : set(j7, get(j7) + i13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return add(j7, i13);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getWeekyear(j7);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        if (j7 < j13) {
            return -getDifference(j13, j7);
        }
        int i13 = get(j7);
        int i14 = get(j13);
        long jRemainder = remainder(j7);
        long jRemainder2 = remainder(j13);
        if (jRemainder2 >= WEEK_53 && this.iChronology.getWeeksInYear(i13) <= 52) {
            jRemainder2 -= 604800000;
        }
        int i15 = i13 - i14;
        if (jRemainder < jRemainder2) {
            i15--;
        }
        return i15;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j7)) - 52;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.weeks();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j7)) > 52;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j7) {
        return j7 - roundFloor(j7);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        long jRoundFloor = this.iChronology.weekOfWeekyear().roundFloor(j7);
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(jRoundFloor);
        return weekOfWeekyear > 1 ? jRoundFloor - (((long) (weekOfWeekyear - 1)) * 604800000) : jRoundFloor;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, Math.abs(i13), this.iChronology.getMinYear(), this.iChronology.getMaxYear());
        int i14 = get(j7);
        if (i14 == i13) {
            return j7;
        }
        int dayOfWeek = this.iChronology.getDayOfWeek(j7);
        int weeksInYear = this.iChronology.getWeeksInYear(i14);
        int weeksInYear2 = this.iChronology.getWeeksInYear(i13);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(j7);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.iChronology.setYear(j7, i13);
        int i15 = get(year);
        if (i15 < i13) {
            year += 604800000;
        } else if (i15 > i13) {
            year -= 604800000;
        }
        return this.iChronology.dayOfWeek().set((((long) (weeksInYear - this.iChronology.getWeekOfWeekyear(year))) * 604800000) + year, dayOfWeek);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return add(j7, FieldUtils.safeToInt(j13));
    }
}
