package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationFieldType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractPartial implements ReadablePartial, Comparable<ReadablePartial> {
    @Override // org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePartial)) {
            return false;
        }
        ReadablePartial readablePartial = (ReadablePartial) obj;
        if (size() != readablePartial.size()) {
            return false;
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (getValue(i13) != readablePartial.getValue(i13) || getFieldType(i13) != readablePartial.getFieldType(i13)) {
                return false;
            }
        }
        return FieldUtils.equals(getChronology(), readablePartial.getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public DateTimeField getField(int i13) {
        return getField(i13, getChronology());
    }

    public abstract DateTimeField getField(int i13, Chronology chronology);

    @Override // org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i13) {
        return getField(i13, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i13 = 0; i13 < size; i13++) {
            dateTimeFieldTypeArr[i13] = getFieldType(i13);
        }
        return dateTimeFieldTypeArr;
    }

    public DateTimeField[] getFields() {
        int size = size();
        DateTimeField[] dateTimeFieldArr = new DateTimeField[size];
        for (int i13 = 0; i13 < size; i13++) {
            dateTimeFieldArr[i13] = getField(i13);
        }
        return dateTimeFieldArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = getValue(i13);
        }
        return iArr;
    }

    @Override // org.joda.time.ReadablePartial
    public int hashCode() {
        int size = size();
        int iHashCode = 157;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode = getFieldType(i13).hashCode() + ((getValue(i13) + (iHashCode * 23)) * 23);
        }
        return getChronology().hashCode() + iHashCode;
    }

    public int indexOf(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (getFieldType(i13) == dateTimeFieldType) {
                return i13;
            }
        }
        return -1;
    }

    public int indexOfSupported(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public boolean isAfter(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isBefore(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isEqual(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            return compareTo(readablePartial) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    @Override // org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return indexOf(dateTimeFieldType) != -1;
    }

    @Override // org.joda.time.ReadablePartial
    public DateTime toDateTime(ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        return new DateTime(instantChronology.set(this, DateTimeUtils.getInstantMillis(readableInstant)), instantChronology);
    }

    public String toString(DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter == null ? toString() : dateTimeFormatter.print(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (size() != readablePartial.size()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (getFieldType(i13) != readablePartial.getFieldType(i13)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        int size2 = size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (getValue(i14) > readablePartial.getValue(i14)) {
                return 1;
            }
            if (getValue(i14) < readablePartial.getValue(i14)) {
                return -1;
            }
        }
        return 0;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (getFieldType(i13).getDurationType() == durationFieldType) {
                return i13;
            }
        }
        return -1;
    }

    public int indexOfSupported(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }
}
