package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final DurationField iField;
    private final DurationFieldType iType;

    public DelegatedDurationField(DurationField durationField) {
        this(durationField, null);
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, int i13) {
        return this.iField.add(j7, i13);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j7, long j13) {
        return this.iField.getDifference(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        return this.iField.getDifferenceAsLong(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13) {
        return this.iField.getMillis(i13);
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7) {
        return this.iField.getValue(j7);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7) {
        return this.iField.getValueAsLong(j7);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        return "DurationField[" + this.iType + ']';
    }

    public DelegatedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.iField = durationField;
        this.iType = durationFieldType == null ? durationField.getType() : durationFieldType;
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, long j13) {
        return this.iField.add(j7, j13);
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return this.iField.compareTo(durationField);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7) {
        return this.iField.getMillis(j7);
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7, long j13) {
        return this.iField.getValue(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        return this.iField.getValueAsLong(j7, j13);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        return this.iField.getMillis(i13, j7);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        return this.iField.getMillis(j7, j13);
    }
}
