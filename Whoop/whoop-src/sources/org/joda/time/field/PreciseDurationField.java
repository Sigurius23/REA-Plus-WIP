package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j7) {
        super(durationFieldType);
        this.iUnitMillis = j7;
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, int i13) {
        return FieldUtils.safeAdd(j7, ((long) i13) * this.iUnitMillis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
            if (getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        return FieldUtils.safeSubtract(j7, j13) / this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        return ((long) i13) * this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        return j7 / this.iUnitMillis;
    }

    public int hashCode() {
        long j7 = this.iUnitMillis;
        return getType().hashCode() + ((int) (j7 ^ (j7 >>> 32)));
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        return FieldUtils.safeMultiply(j7, this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, long j13) {
        return FieldUtils.safeAdd(j7, FieldUtils.safeMultiply(j13, this.iUnitMillis));
    }
}
