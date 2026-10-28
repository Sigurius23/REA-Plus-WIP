package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes5.dex */
public final class UnsupportedDurationField extends DurationField implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static synchronized UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        try {
            HashMap<DurationFieldType, UnsupportedDurationField> map = cCache;
            if (map == null) {
                cCache = new HashMap<>(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = map.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                cCache.put(durationFieldType, unsupportedDurationField);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, int i13) {
        throw unsupported();
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() == null) {
            return getName() == null;
        }
        return unsupportedDurationField.getName().equals(getName());
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j7, long j13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j7, long j13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return 0L;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7) {
        throw unsupported();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "UnsupportedDurationField[" + getName() + ']';
    }

    @Override // org.joda.time.DurationField
    public long add(long j7, long j13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j7, long j13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j7, long j13) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i13, long j7) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j7, long j13) {
        throw unsupported();
    }
}
