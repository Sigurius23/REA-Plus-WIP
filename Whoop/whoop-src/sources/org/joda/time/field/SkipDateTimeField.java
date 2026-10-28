package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        int i13 = super.get(j7);
        return i13 <= this.iSkip ? i13 - 1 : i13;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iMinValue, getMaximumValue());
        int i14 = this.iSkip;
        if (i13 <= i14) {
            if (i13 == i14) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i13), (Number) null, (Number) null);
            }
            i13++;
        }
        return super.set(j7, i13);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i13) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i13) {
            this.iMinValue = minimumValue - 1;
        } else if (minimumValue == i13) {
            this.iMinValue = i13 + 1;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i13;
    }
}
