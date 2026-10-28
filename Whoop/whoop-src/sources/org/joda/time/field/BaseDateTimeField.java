package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j7, int i13) {
        return getDurationField().add(j7, i13);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j7, int i13) {
        return set(j7, FieldUtils.getWrappedValue(get(j7), i13, getMinimumValue(j7), getMaximumValue(j7)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        if (i14 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i14 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            int i15 = iArr[i13];
            long j7 = i15 + i14;
            if (j7 <= maximumValue) {
                iArr[i13] = (int) j7;
                break;
            }
            if (field == null) {
                if (i13 == 0) {
                    i14 -= (maximumValue + 1) - i15;
                    iArr[i13] = getMinimumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i13 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i14 -= (maximumValue + 1) - iArr[i13];
            iArr = field.addWrapPartial(readablePartial, i13 - 1, iArr, 1);
            iArr[i13] = getMinimumValue(readablePartial, iArr);
        }
        while (i14 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            int i16 = iArr[i13];
            long j13 = i16 + i14;
            if (j13 >= minimumValue) {
                iArr[i13] = (int) j13;
                break;
            }
            if (field == null) {
                if (i13 == 0) {
                    i14 -= (minimumValue - 1) - i16;
                    iArr[i13] = getMaximumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i13 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i14 -= (minimumValue - 1) - iArr[i13];
            iArr = field.addWrapPartial(readablePartial, i13 - 1, iArr, -1);
            iArr[i13] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i13, iArr, iArr[i13]);
    }

    public int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j7);

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j7, Locale locale) {
        return getAsShortText(get(j7), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j7, Locale locale) {
        return getAsText(get(j7), locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j7, long j13) {
        return getDurationField().getDifference(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j7, long j13) {
        return getDurationField().getDifferenceAsLong(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j7) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j7) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j7) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j7) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j7) {
        return j7 - roundFloor(j7);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j7) {
        long jRoundFloor = roundFloor(j7);
        return jRoundFloor != j7 ? add(jRoundFloor, 1) : j7;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j7);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j7) {
        long jRoundFloor = roundFloor(j7);
        long jRoundCeiling = roundCeiling(j7);
        return jRoundCeiling - j7 <= j7 - jRoundFloor ? jRoundCeiling : jRoundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j7) {
        long jRoundFloor = roundFloor(j7);
        long jRoundCeiling = roundCeiling(j7);
        long j13 = j7 - jRoundFloor;
        long j14 = jRoundCeiling - j7;
        return (j13 >= j14 && (j14 < j13 || (get(jRoundCeiling) & 1) == 0)) ? jRoundCeiling : jRoundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j7) {
        long jRoundFloor = roundFloor(j7);
        long jRoundCeiling = roundCeiling(j7);
        return j7 - jRoundFloor <= jRoundCeiling - j7 ? jRoundFloor : jRoundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j7, int i13);

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        FieldUtils.verifyValueBounds(this, i14, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i13] = i14;
        while (true) {
            i13++;
            if (i13 >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i13);
            if (iArr[i13] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i13] = field.getMaximumValue(readablePartial, iArr);
            }
            if (iArr[i13] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i13] = field.getMinimumValue(readablePartial, iArr);
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j7, long j13) {
        return getDurationField().add(j7, j13);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j7) {
        return getAsShortText(j7, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j7) {
        return getAsText(j7, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        if (i14 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i14 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j7 = iArr[i13] + i14;
            if (j7 <= maximumValue) {
                iArr[i13] = (int) j7;
                break;
            }
            if (field == null) {
                if (i13 != 0) {
                    field = readablePartial.getField(i13 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i14 -= (maximumValue + 1) - iArr[i13];
            iArr = field.add(readablePartial, i13 - 1, iArr, 1);
            iArr[i13] = getMinimumValue(readablePartial, iArr);
        }
        while (i14 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            long j13 = iArr[i13] + i14;
            if (j13 >= minimumValue) {
                iArr[i13] = (int) j13;
                break;
            }
            if (field == null) {
                if (i13 != 0) {
                    field = readablePartial.getField(i13 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                } else {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
            }
            i14 -= (minimumValue - 1) - iArr[i13];
            iArr = field.add(readablePartial, i13 - 1, iArr, -1);
            iArr[i13] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i13, iArr, iArr[i13]);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i13, Locale locale) {
        return getAsShortText(i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i13, Locale locale) {
        return getAsText(i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
        return set(readablePartial, i13, iArr, FieldUtils.getWrappedValue(iArr[i13], i14, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i13, Locale locale) {
        return getAsText(i13, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i13, Locale locale) {
        return Integer.toString(i13);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j7, String str, Locale locale) {
        return set(j7, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j7, String str) {
        return set(j7, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i13, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i13, iArr, convertText(str, locale));
    }
}
