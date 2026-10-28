package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final DurationField iField;

    public DecoratedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!durationField.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = durationField;
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, int i13) {
        return this.iField.add(j7, i13);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        return this.iField.getDifferenceAsLong(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        return this.iField.getMillis(i13, j7);
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        return this.iField.getValueAsLong(j7, j13);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, long j13) {
        return this.iField.add(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        return this.iField.getMillis(j7, j13);
    }
}
