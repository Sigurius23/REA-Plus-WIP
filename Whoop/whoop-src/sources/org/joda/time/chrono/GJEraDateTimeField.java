package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes5.dex */
final class GJEraDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 4240986525305515528L;
    private final BasicChronology iChronology;

    public GJEraDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.era());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.era();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return this.iChronology.getYear(j7) <= 0 ? 0 : 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsText(int i13, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).eraValueToText(i13);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getEraMaxTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        if (get(j7) == 0) {
            return this.iChronology.setYear(0L, 1);
        }
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        if (get(j7) == 1) {
            return this.iChronology.setYear(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j7) {
        return roundFloor(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j7) {
        return roundFloor(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j7) {
        return roundFloor(j7);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, 0, 1);
        if (get(j7) == i13) {
            return j7;
        }
        return this.iChronology.setYear(j7, -this.iChronology.getYear(j7));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, String str, Locale locale) {
        return set(j7, GJLocaleSymbols.forLocale(locale).eraTextToValue(str));
    }
}
