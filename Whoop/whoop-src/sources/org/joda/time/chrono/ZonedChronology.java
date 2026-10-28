package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

/* JADX INFO: loaded from: classes5.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long NEAR_ZERO = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    public static final class ZonedDateTimeField extends BaseDateTimeField {
        private static final long serialVersionUID = -3968986277775529794L;
        final DurationField iDurationField;
        final DateTimeField iField;
        final DurationField iLeapDurationField;
        final DurationField iRangeDurationField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDateTimeField(DateTimeField dateTimeField, DateTimeZone dateTimeZone, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField.getType());
            if (!dateTimeField.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.iField = dateTimeField;
            this.iZone = dateTimeZone;
            this.iDurationField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iRangeDurationField = durationField2;
            this.iLeapDurationField = durationField3;
        }

        private int getOffsetToAdd(long j7) {
            int offset = this.iZone.getOffset(j7);
            long j13 = offset;
            if (((j7 + j13) ^ j7) >= 0 || (j7 ^ j13) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, int i13) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j7);
                return this.iField.add(j7 + offsetToAdd, i13) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j7), i13), false, j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j7, int i13) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j7);
                return this.iField.addWrapField(j7 + offsetToAdd, i13) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.addWrapField(this.iZone.convertUTCToLocal(j7), i13), false, j7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDateTimeField) {
                ZonedDateTimeField zonedDateTimeField = (ZonedDateTimeField) obj;
                if (this.iField.equals(zonedDateTimeField.iField) && this.iZone.equals(zonedDateTimeField.iZone) && this.iDurationField.equals(zonedDateTimeField.iDurationField) && this.iRangeDurationField.equals(zonedDateTimeField.iRangeDurationField)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j7) {
            return this.iField.get(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j7, Locale locale) {
            return this.iField.getAsShortText(this.iZone.convertUTCToLocal(j7), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j7, Locale locale) {
            return this.iField.getAsText(this.iZone.convertUTCToLocal(j7), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j7, long j13) {
            int offsetToAdd = getOffsetToAdd(j13);
            return this.iField.getDifference(j7 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j7))), j13 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j7, long j13) {
            int offsetToAdd = getOffsetToAdd(j13);
            return this.iField.getDifferenceAsLong(j7 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j7))), j13 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j7) {
            return this.iField.getLeapAmount(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return this.iField.getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return this.iField.getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j7) {
            return this.iField.isLeap(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return this.iField.isLenient();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j7) {
            return this.iField.remainder(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j7) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j7);
                return this.iField.roundCeiling(j7 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundCeiling(this.iZone.convertUTCToLocal(j7)), false, j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j7) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j7);
                return this.iField.roundFloor(j7 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundFloor(this.iZone.convertUTCToLocal(j7)), false, j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j7, int i13) {
            long j13 = this.iField.set(this.iZone.convertUTCToLocal(j7), i13);
            long jConvertLocalToUTC = this.iZone.convertLocalToUTC(j13, false, j7);
            if (get(jConvertLocalToUTC) == i13) {
                return jConvertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j13, this.iZone.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.iField.getType(), Integer.valueOf(i13), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j7) {
            return this.iField.getMaximumValue(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j7) {
            return this.iField.getMinimumValue(this.iZone.convertUTCToLocal(j7));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i13, Locale locale) {
            return this.iField.getAsShortText(i13, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i13, Locale locale) {
            return this.iField.getAsText(i13, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return this.iField.getMaximumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMaximumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, long j13) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j7);
                return this.iField.add(j7 + offsetToAdd, j13) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j7), j13), false, j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j7, String str, Locale locale) {
            return this.iZone.convertLocalToUTC(this.iField.set(this.iZone.convertUTCToLocal(j7), str, locale), false, j7);
        }
    }

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(DurationField durationField, DateTimeZone dateTimeZone) {
            super(durationField.getType());
            if (!durationField.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.iField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iZone = dateTimeZone;
        }

        private long addOffset(long j7) {
            return this.iZone.convertUTCToLocal(j7);
        }

        private int getOffsetFromLocalToSubtract(long j7) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j7);
            long j13 = offsetFromLocal;
            if (((j7 - j13) ^ j7) >= 0 || (j7 ^ j13) >= 0) {
                return offsetFromLocal;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        private int getOffsetToAdd(long j7) {
            int offset = this.iZone.getOffset(j7);
            long j13 = offset;
            if (((j7 + j13) ^ j7) >= 0 || (j7 ^ j13) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.DurationField
        public long add(long j7, int i13) {
            int offsetToAdd = getOffsetToAdd(j7);
            long jAdd = this.iField.add(j7 + ((long) offsetToAdd), i13);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(jAdd);
            }
            return jAdd - ((long) offsetToAdd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDurationField) {
                ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
                if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j7, long j13) {
            int offsetToAdd = getOffsetToAdd(j13);
            return this.iField.getDifference(j7 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j7))), j13 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j7, long j13) {
            int offsetToAdd = getOffsetToAdd(j13);
            return this.iField.getDifferenceAsLong(j7 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j7))), j13 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i13, long j7) {
            return this.iField.getMillis(i13, addOffset(j7));
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j7, long j13) {
            return this.iField.getValue(j7, addOffset(j13));
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j7, long j13) {
            return this.iField.getValueAsLong(j7, addOffset(j13));
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            if (this.iTimeField) {
                return this.iField.isPrecise();
            }
            return this.iField.isPrecise() && this.iZone.isFixed();
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j7, long j13) {
            return this.iField.getMillis(j7, addOffset(j13));
        }

        @Override // org.joda.time.DurationField
        public long add(long j7, long j13) {
            int offsetToAdd = getOffsetToAdd(j7);
            long jAdd = this.iField.add(j7 + ((long) offsetToAdd), j13);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(jAdd);
            }
            return jAdd - ((long) offsetToAdd);
        }
    }

    private ZonedChronology(Chronology chronology, DateTimeZone dateTimeZone) {
        super(chronology, dateTimeZone);
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> map) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (map.containsKey(durationField)) {
            return (DurationField) map.get(durationField);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(durationField, getZone());
        map.put(durationField, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone dateTimeZone) {
        if (chronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        Chronology chronologyWithUTC = chronology.withUTC();
        if (chronologyWithUTC == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(chronologyWithUTC, dateTimeZone);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    private long localToUTC(long j7) {
        if (j7 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j7);
        long j13 = j7 - ((long) offsetFromLocal);
        if (j7 > NEAR_ZERO && j13 < 0) {
            return Long.MAX_VALUE;
        }
        if (j7 < -604800000 && j13 > 0) {
            return Long.MIN_VALUE;
        }
        if (offsetFromLocal == zone.getOffset(j13)) {
            return j13;
        }
        throw new IllegalInstantException(j7, zone.getID());
    }

    public static boolean useTimeArithmetic(DurationField durationField) {
        return durationField != null && durationField.getUnitMillis() < 43200000;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        HashMap<Object, Object> map = new HashMap<>();
        fields.eras = convertField(fields.eras, map);
        fields.centuries = convertField(fields.centuries, map);
        fields.years = convertField(fields.years, map);
        fields.months = convertField(fields.months, map);
        fields.weekyears = convertField(fields.weekyears, map);
        fields.weeks = convertField(fields.weeks, map);
        fields.days = convertField(fields.days, map);
        fields.halfdays = convertField(fields.halfdays, map);
        fields.hours = convertField(fields.hours, map);
        fields.minutes = convertField(fields.minutes, map);
        fields.seconds = convertField(fields.seconds, map);
        fields.millis = convertField(fields.millis, map);
        fields.year = convertField(fields.year, map);
        fields.yearOfEra = convertField(fields.yearOfEra, map);
        fields.yearOfCentury = convertField(fields.yearOfCentury, map);
        fields.centuryOfEra = convertField(fields.centuryOfEra, map);
        fields.era = convertField(fields.era, map);
        fields.dayOfWeek = convertField(fields.dayOfWeek, map);
        fields.dayOfMonth = convertField(fields.dayOfMonth, map);
        fields.dayOfYear = convertField(fields.dayOfYear, map);
        fields.monthOfYear = convertField(fields.monthOfYear, map);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, map);
        fields.weekyear = convertField(fields.weekyear, map);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, map);
        fields.millisOfSecond = convertField(fields.millisOfSecond, map);
        fields.millisOfDay = convertField(fields.millisOfDay, map);
        fields.secondOfMinute = convertField(fields.secondOfMinute, map);
        fields.secondOfDay = convertField(fields.secondOfDay, map);
        fields.minuteOfHour = convertField(fields.minuteOfHour, map);
        fields.minuteOfDay = convertField(fields.minuteOfDay, map);
        fields.hourOfDay = convertField(fields.hourOfDay, map);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, map);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, map);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, map);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return getBase().equals(zonedChronology.getBase()) && getZone().equals(zonedChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i13, i14, i15, i16));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getBase().hashCode() * 7) + (getZone().hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return getBase();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getParam()) {
            return this;
        }
        return dateTimeZone == DateTimeZone.UTC ? getBase() : new ZonedChronology(getBase(), dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19));
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> map) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (map.containsKey(dateTimeField)) {
            return (DateTimeField) map.get(dateTimeField);
        }
        ZonedDateTimeField zonedDateTimeField = new ZonedDateTimeField(dateTimeField, getZone(), convertField(dateTimeField.getDurationField(), map), convertField(dateTimeField.getRangeDurationField(), map), convertField(dateTimeField.getLeapDurationField(), map));
        map.put(dateTimeField, zonedDateTimeField);
        return zonedDateTimeField;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j7, int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        return localToUTC(getBase().getDateTimeMillis(((long) getZone().getOffset(j7)) + j7, i13, i14, i15, i16));
    }
}
