package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        int i13 = super.get(j7);
        return i13 < this.iSkip ? i13 + 1 : i13;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, this.iMinValue, getMaximumValue());
        if (i13 <= this.iSkip) {
            i13--;
        }
        return super.set(j7, i13);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i13) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i13) {
            this.iMinValue = minimumValue + 1;
        } else if (minimumValue == i13 + 1) {
            this.iMinValue = i13;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i13;
    }
}
