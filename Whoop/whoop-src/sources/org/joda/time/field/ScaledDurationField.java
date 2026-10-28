package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(DurationField durationField, DurationFieldType durationFieldType, int i13) {
        super(durationField, durationFieldType);
        if (i13 == 0 || i13 == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.iScalar = i13;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j7, int i13) {
        return getWrappedField().add(j7, ((long) i13) * ((long) this.iScalar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScaledDurationField) {
            ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
            if (getWrappedField().equals(scaledDurationField.getWrappedField()) && getType() == scaledDurationField.getType() && this.iScalar == scaledDurationField.iScalar) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getDifference(long j7, long j13) {
        return getWrappedField().getDifference(j7, j13) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        return getWrappedField().getDifferenceAsLong(j7, j13) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(int i13) {
        return getWrappedField().getMillis(((long) i13) * ((long) this.iScalar));
    }

    public int getScalar() {
        return this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getUnitMillis() {
        return getWrappedField().getUnitMillis() * ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j7) {
        return getWrappedField().getValue(j7) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j7) {
        return getWrappedField().getValueAsLong(j7) / ((long) this.iScalar);
    }

    public int hashCode() {
        long j7 = this.iScalar;
        return getWrappedField().hashCode() + getType().hashCode() + ((int) (j7 ^ (j7 >>> 32)));
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j7, long j13) {
        return getWrappedField().getValue(j7, j13) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        return getWrappedField().getValueAsLong(j7, j13) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j7, long j13) {
        return getWrappedField().add(j7, FieldUtils.safeMultiply(j13, this.iScalar));
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(long j7) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j7, this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        return getWrappedField().getMillis(((long) i13) * ((long) this.iScalar), j7);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j7, this.iScalar), j13);
    }
}
