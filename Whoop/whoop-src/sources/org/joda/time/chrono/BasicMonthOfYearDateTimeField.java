package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes5.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i13) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i13;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        if (i13 == 0) {
            return j7;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j7);
        int year = this.iChronology.getYear(j7);
        int monthOfYear = this.iChronology.getMonthOfYear(j7, year);
        int i19 = monthOfYear - 1;
        int i24 = i19 + i13;
        if (monthOfYear <= 0 || i24 >= 0) {
            i14 = year;
        } else {
            if (Math.signum(this.iMax + i13) == Math.signum(i13)) {
                i17 = year - 1;
                i18 = i13 + this.iMax;
            } else {
                i17 = year + 1;
                i18 = i13 - this.iMax;
            }
            int i25 = i17;
            i24 = i18 + i19;
            i14 = i25;
        }
        if (i24 >= 0) {
            int i26 = this.iMax;
            i15 = (i24 / i26) + i14;
            i16 = (i24 % i26) + 1;
        } else {
            i15 = (i24 / this.iMax) + i14;
            int i27 = i15 - 1;
            int iAbs = Math.abs(i24);
            int i28 = this.iMax;
            int i29 = iAbs % i28;
            if (i29 == 0) {
                i29 = i28;
            }
            i16 = (i28 - i29) + 1;
            if (i16 != 1) {
                i15 = i27;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j7, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i15, i16);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i15, i16, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return set(j7, FieldUtils.getWrappedValue(get(j7), i13, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getMonthOfYear(j7);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        if (j7 < j13) {
            return -getDifference(j13, j7);
        }
        int year = this.iChronology.getYear(j7);
        int monthOfYear = this.iChronology.getMonthOfYear(j7, year);
        int year2 = this.iChronology.getYear(j13);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j13, year2);
        long j14 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j7, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j13, year2, monthOfYear2) > dayOfMonth) {
            j13 = this.iChronology.dayOfMonth().set(j13, dayOfMonth);
        }
        return j7 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j13 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j14 - 1 : j14;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        return isLeap(j7) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        int year = this.iChronology.getYear(j7);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j7, year) == this.iLeapMonth;
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
        int year = this.iChronology.getYear(j7);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j7, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, 1, this.iMax);
        int year = this.iChronology.getYear(j7);
        int dayOfMonth = this.iChronology.getDayOfMonth(j7, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i13);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i13, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j7));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        long j14;
        long j15;
        long j16;
        int i13 = (int) j13;
        if (i13 == j13) {
            return add(j7, i13);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j7);
        int year = this.iChronology.getYear(j7);
        int monthOfYear = this.iChronology.getMonthOfYear(j7, year);
        long j17 = ((long) (monthOfYear - 1)) + j13;
        if (j17 >= 0) {
            int i14 = this.iMax;
            j14 = (j17 / ((long) i14)) + ((long) year);
            j16 = (j17 % ((long) i14)) + 1;
            j15 = millisOfDay;
        } else {
            j14 = (j17 / ((long) this.iMax)) + ((long) year);
            long j18 = j14 - 1;
            long jAbs = Math.abs(j17);
            int i15 = this.iMax;
            j15 = millisOfDay;
            int i16 = (int) (jAbs % ((long) i15));
            if (i16 == 0) {
                i16 = i15;
            }
            j16 = (i15 - i16) + 1;
            if (j16 != 1) {
                j14 = j18;
            }
        }
        if (j14 >= this.iChronology.getMinYear() && j14 <= this.iChronology.getMaxYear()) {
            int i17 = (int) j14;
            int i18 = (int) j16;
            int dayOfMonth = this.iChronology.getDayOfMonth(j7, year, monthOfYear);
            int daysInYearMonth = this.iChronology.getDaysInYearMonth(i17, i18);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.iChronology.getYearMonthDayMillis(i17, i18, dayOfMonth) + j15;
        }
        throw new IllegalArgumentException(AbstractC11895b.m31994m(j13, "Magnitude of add amount is too large: "));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        if (i14 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i13 == 0) {
            return set(readablePartial, 0, iArr, ((((i14 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j7 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                j7 = readablePartial.getFieldType(i15).getField(this.iChronology).set(j7, iArr[i15]);
            }
            return this.iChronology.get(readablePartial, add(j7, i14));
        }
        return super.add(readablePartial, i13, iArr, i14);
    }
}
