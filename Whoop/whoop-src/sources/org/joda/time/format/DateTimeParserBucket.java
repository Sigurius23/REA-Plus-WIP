package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import live.hms.video.error.ErrorCodes;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        public void init(DateTimeField dateTimeField, int i13) {
            this.iField = dateTimeField;
            this.iValue = i13;
            this.iText = null;
            this.iLocale = null;
        }

        public long set(long j7, boolean z4) {
            String str = this.iText;
            long extended = str == null ? this.iField.setExtended(j7, this.iValue) : this.iField.set(j7, str, this.iLocale);
            return z4 ? this.iField.roundFloor(extended) : extended;
        }

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int iCompareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return iCompareReverse != 0 ? iCompareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }
    }

    public class SavedState {
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        final DateTimeZone iZone;

        public SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j7, Chronology chronology, Locale locale) {
        this(j7, chronology, locale, null, ErrorCodes.InitAPIErrors.cServerErrors);
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i13 = this.iSavedFieldsCount;
        if (i13 == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[i13 == savedFieldArr.length ? i13 * 2 : savedFieldArr.length];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i13);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i13];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i13] = savedField;
        }
        this.iSavedFieldsCount = i13 + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i13) {
        if (i13 > 10) {
            Arrays.sort(savedFieldArr, 0, i13);
            return;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = i14; i15 > 0; i15--) {
                int i16 = i15 - 1;
                if (savedFieldArr[i16].compareTo(savedFieldArr[i15]) <= 0) {
                    break;
                }
                SavedField savedField = savedFieldArr[i15];
                savedFieldArr[i15] = savedFieldArr[i16];
                savedFieldArr[i16] = savedField;
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int into = internalParser.parseInto(this, charSequence, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), into));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.m85493of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i13) {
        obtainSaveField().init(dateTimeField, i13);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i13) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i13);
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }

    @Deprecated
    public DateTimeParserBucket(long j7, Chronology chronology, Locale locale, Integer num) {
        this(j7, chronology, locale, num, ErrorCodes.InitAPIErrors.cServerErrors);
    }

    public long computeMillis(boolean z4) {
        return computeMillis(z4, (CharSequence) null);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i13) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i13);
    }

    public DateTimeParserBucket(long j7, Chronology chronology, Locale locale, Integer num, int i13) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j7;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i13;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public long computeMillis(boolean z4, String str) {
        return computeMillis(z4, (CharSequence) str);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    public long computeMillis(boolean z4, CharSequence charSequence) {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i13 = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i13);
        if (i13 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z4, charSequence);
            }
        }
        long j7 = this.iMillis;
        for (int i14 = 0; i14 < i13; i14++) {
            try {
                j7 = savedFieldArr[i14].set(j7, z4);
            } catch (IllegalFieldValueException e5) {
                if (charSequence != null) {
                    e5.prependMessage("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e5;
            }
        }
        if (z4) {
            int i15 = 0;
            while (i15 < i13) {
                if (!savedFieldArr[i15].iField.isLenient()) {
                    j7 = savedFieldArr[i15].set(j7, i15 == i13 + (-1));
                }
                i15++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            return j7 - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone != null) {
            int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j7);
            j7 -= (long) offsetFromLocal;
            if (offsetFromLocal != this.iZone.getOffset(j7)) {
                String str = "Illegal instant due to time zone offset transition (" + this.iZone + ')';
                if (charSequence != null) {
                    str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
                }
                throw new IllegalInstantException(str);
            }
        }
        return j7;
    }
}
