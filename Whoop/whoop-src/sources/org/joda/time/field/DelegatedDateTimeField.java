package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDateTimeField extends DateTimeField implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final DateTimeField iField;
    private final DurationField iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(DateTimeField dateTimeField) {
        this(dateTimeField, null);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return this.iField.add(j7, i13);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return this.iField.addWrapField(j7, i13);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return this.iField.addWrapPartial(readablePartial, i13, iArr, i14);
    }

    @Override // org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iField.get(j7);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j7, Locale locale) {
        return this.iField.getAsShortText(j7, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j7, Locale locale) {
        return this.iField.getAsText(j7, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return this.iField.getDifference(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return this.iField.getDifferenceAsLong(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iField.getDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        return this.iField.getLeapAmount(j7);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : this.iField.getRangeDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final DateTimeField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return this.iField.isLeap(j7);
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return this.iField.isLenient();
    }

    @Override // org.joda.time.DateTimeField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j7) {
        return this.iField.remainder(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        return this.iField.roundCeiling(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        return this.iField.roundFloor(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j7) {
        return this.iField.roundHalfCeiling(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j7) {
        return this.iField.roundHalfEven(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j7) {
        return this.iField.roundHalfFloor(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        return this.iField.set(j7, i13);
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dateTimeField, null, dateTimeFieldType);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return this.iField.add(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return this.iField.addWrapField(readablePartial, i13, iArr, i14);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j7) {
        return this.iField.getAsShortText(j7);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j7) {
        return this.iField.getAsText(j7);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j7) {
        return this.iField.getMaximumValue(j7);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j7) {
        return this.iField.getMinimumValue(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j7, String str, Locale locale) {
        return this.iField.set(j7, str, locale);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        if (dateTimeField != null) {
            this.iField = dateTimeField;
            this.iRangeDurationField = durationField;
            this.iType = dateTimeFieldType == null ? dateTimeField.getType() : dateTimeFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return this.iField.add(readablePartial, i13, iArr, i14);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i13, Locale locale) {
        return this.iField.getAsShortText(readablePartial, i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i13, Locale locale) {
        return this.iField.getAsText(readablePartial, i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return this.iField.getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return this.iField.getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j7, String str) {
        return this.iField.set(j7, str);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsShortText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMaximumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMinimumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return this.iField.set(readablePartial, i13, iArr, i14);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i13, Locale locale) {
        return this.iField.getAsShortText(i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i13, Locale locale) {
        return this.iField.getAsText(i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i13, int[] iArr, String str, Locale locale) {
        return this.iField.set(readablePartial, i13, iArr, str, locale);
    }
}
