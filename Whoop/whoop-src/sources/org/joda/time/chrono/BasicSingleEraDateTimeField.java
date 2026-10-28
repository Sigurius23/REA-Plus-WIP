package org.joda.time.chrono;

import com.whoop.service.network.model.UserSessionDto;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicSingleEraDateTimeField extends BaseDateTimeField {
    private static final int ERA_VALUE = 1;
    private final String iEraText;

    public BasicSingleEraDateTimeField(String str) {
        super(DateTimeFieldType.era());
        this.iEraText = str;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j7) {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsText(int i13, Locale locale) {
        return this.iEraText;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return this.iEraText.length();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
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
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j7) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j7) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j7) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j7) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, int i13) {
        FieldUtils.verifyValueBounds(this, i13, 1, 1);
        return j7;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j7, String str, Locale locale) {
        if (this.iEraText.equals(str) || UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(str)) {
            return j7;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }
}
