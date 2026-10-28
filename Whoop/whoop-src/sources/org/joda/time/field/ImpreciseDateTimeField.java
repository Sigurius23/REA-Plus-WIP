package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.DurationField
        public long add(long j7, int i13) {
            return ImpreciseDateTimeField.this.add(j7, i13);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j7, long j13) {
            return ImpreciseDateTimeField.this.getDifference(j7, j13);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j7, long j13) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j7, j13);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i13, long j7) {
            return ImpreciseDateTimeField.this.add(j7, i13) - j7;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j7, long j13) {
            return ImpreciseDateTimeField.this.getDifference(j7 + j13, j13);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j7, long j13) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j7 + j13, j13);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }

        @Override // org.joda.time.DurationField
        public long add(long j7, long j13) {
            return ImpreciseDateTimeField.this.add(j7, j13);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j7, long j13) {
            return ImpreciseDateTimeField.this.add(j13, j7) - j13;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j7) {
        super(dateTimeFieldType);
        this.iUnitMillis = j7;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j7, int i13);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j7, long j13);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j7);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j7, j13));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        if (j7 < j13) {
            return -getDifferenceAsLong(j13, j7);
        }
        long j14 = (j7 - j13) / this.iUnitMillis;
        if (add(j13, j14) >= j7) {
            if (add(j13, j14) > j7) {
                do {
                    j14--;
                } while (add(j13, j14) > j7);
            }
            return j14;
        }
        while (true) {
            long j15 = j14 + 1;
            if (add(j13, j15) > j7) {
                return j14;
            }
            j14 = j15;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j7);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j7, int i13);
}
