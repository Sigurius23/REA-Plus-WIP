package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        final boolean iConvertByWeekyear;
        final long iCutover;
        protected DurationField iDurationField;
        final DateTimeField iGregorianField;
        final DateTimeField iJulianField;
        protected DurationField iRangeDurationField;

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j7) {
            this(gJChronology, dateTimeField, dateTimeField2, j7, false);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, int i13) {
            return this.iGregorianField.add(j7, i13);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j7) {
            return j7 >= this.iCutover ? this.iGregorianField.get(j7) : this.iJulianField.get(j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j7, Locale locale) {
            return j7 >= this.iCutover ? this.iGregorianField.getAsShortText(j7, locale) : this.iJulianField.getAsShortText(j7, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j7, Locale locale) {
            return j7 >= this.iCutover ? this.iGregorianField.getAsText(j7, locale) : this.iJulianField.getAsText(j7, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j7, long j13) {
            return this.iGregorianField.getDifference(j7, j13);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j7, long j13) {
            return this.iGregorianField.getDifferenceAsLong(j7, j13);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j7) {
            return j7 >= this.iCutover ? this.iGregorianField.getLeapAmount(j7) : this.iJulianField.getLeapAmount(j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j7) {
            return this.iConvertByWeekyear ? GJChronology.this.gregorianToJulianByWeekyear(j7) : GJChronology.this.gregorianToJulianByYear(j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j7) {
            return j7 >= this.iCutover ? this.iGregorianField.isLeap(j7) : this.iJulianField.isLeap(j7);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j7) {
            return this.iConvertByWeekyear ? GJChronology.this.julianToGregorianByWeekyear(j7) : GJChronology.this.julianToGregorianByYear(j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j7) {
            if (j7 >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j7);
            }
            long jRoundCeiling = this.iJulianField.roundCeiling(j7);
            return (jRoundCeiling < this.iCutover || jRoundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? jRoundCeiling : julianToGregorian(jRoundCeiling);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j7) {
            if (j7 < this.iCutover) {
                return this.iJulianField.roundFloor(j7);
            }
            long jRoundFloor = this.iGregorianField.roundFloor(j7);
            return (jRoundFloor >= this.iCutover || GJChronology.this.iGapDuration + jRoundFloor >= this.iCutover) ? jRoundFloor : gregorianToJulian(jRoundFloor);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j7, int i13) {
            if (j7 >= this.iCutover) {
                long jGregorianToJulian = this.iGregorianField.set(j7, i13);
                if (jGregorianToJulian >= this.iCutover) {
                    return jGregorianToJulian;
                }
                if (GJChronology.this.iGapDuration + jGregorianToJulian < this.iCutover) {
                    jGregorianToJulian = gregorianToJulian(jGregorianToJulian);
                }
                if (get(jGregorianToJulian) == i13) {
                    return jGregorianToJulian;
                }
                throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i13), (Number) null, (Number) null);
            }
            long jJulianToGregorian = this.iJulianField.set(j7, i13);
            if (jJulianToGregorian < this.iCutover) {
                return jJulianToGregorian;
            }
            if (jJulianToGregorian - GJChronology.this.iGapDuration >= this.iCutover) {
                jJulianToGregorian = julianToGregorian(jJulianToGregorian);
            }
            if (get(jJulianToGregorian) == i13) {
                return jJulianToGregorian;
            }
            throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i13), (Number) null, (Number) null);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j7, boolean z4) {
            this(dateTimeField, dateTimeField2, null, j7, z4);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, long j13) {
            return this.iGregorianField.add(j7, j13);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j7) {
            if (j7 >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j7);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j7);
            long j13 = this.iJulianField.set(j7, maximumValue);
            long j14 = this.iCutover;
            if (j13 < j14) {
                return maximumValue;
            }
            DateTimeField dateTimeField = this.iJulianField;
            return dateTimeField.get(dateTimeField.add(j14, -1));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        public CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j7, boolean z4) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j7;
            this.iConvertByWeekyear = z4;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.iRangeDurationField = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i13, int[] iArr, int i14) {
            if (i14 == 0) {
                return iArr;
            }
            if (DateTimeUtils.isContiguous(readablePartial)) {
                int size = readablePartial.size();
                long j7 = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    j7 = readablePartial.getFieldType(i15).getField(GJChronology.this).set(j7, iArr[i15]);
                }
                return GJChronology.this.get(readablePartial, add(j7, i14));
            }
            return super.add(readablePartial, i13, iArr, i14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i13, Locale locale) {
            return this.iGregorianField.getAsShortText(i13, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i13, Locale locale) {
            return this.iGregorianField.getAsText(i13, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j7) {
            if (j7 < this.iCutover) {
                return this.iJulianField.getMinimumValue(j7);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j7);
            long j13 = this.iGregorianField.set(j7, minimumValue);
            long j14 = this.iCutover;
            return j13 < j14 ? this.iGregorianField.get(j14) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j7 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                DateTimeField field = readablePartial.getFieldType(i13).getField(instanceUTC);
                if (iArr[i13] <= field.getMaximumValue(j7)) {
                    j7 = field.set(j7, iArr[i13]);
                }
            }
            return getMaximumValue(j7);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j7, String str, Locale locale) {
            if (j7 >= this.iCutover) {
                long j13 = this.iGregorianField.set(j7, str, locale);
                return (j13 >= this.iCutover || GJChronology.this.iGapDuration + j13 >= this.iCutover) ? j13 : gregorianToJulian(j13);
            }
            long j14 = this.iJulianField.set(j7, str, locale);
            return (j14 < this.iCutover || j14 - GJChronology.this.iGapDuration < this.iCutover) ? j14 : julianToGregorian(j14);
        }
    }

    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j7) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j7, false);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, int i13) {
            if (j7 < this.iCutover) {
                long jAdd = this.iJulianField.add(j7, i13);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j7, i13);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            if (this.iConvertByWeekyear) {
                if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    jAdd2 = GJChronology.this.iGregorianChronology.weekyear().add(jAdd2, -1);
                }
            } else if (GJChronology.this.iGregorianChronology.year().get(jAdd2) <= 0) {
                jAdd2 = GJChronology.this.iGregorianChronology.year().add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j7, long j13) {
            long j14 = this.iCutover;
            if (j7 >= j14) {
                if (j13 >= j14) {
                    return this.iGregorianField.getDifference(j7, j13);
                }
                return this.iJulianField.getDifference(gregorianToJulian(j7), j13);
            }
            if (j13 < j14) {
                return this.iJulianField.getDifference(j7, j13);
            }
            return this.iGregorianField.getDifference(julianToGregorian(j7), j13);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j7, long j13) {
            long j14 = this.iCutover;
            if (j7 >= j14) {
                if (j13 >= j14) {
                    return this.iGregorianField.getDifferenceAsLong(j7, j13);
                }
                return this.iJulianField.getDifferenceAsLong(gregorianToJulian(j7), j13);
            }
            if (j13 < j14) {
                return this.iJulianField.getDifferenceAsLong(j7, j13);
            }
            return this.iGregorianField.getDifferenceAsLong(julianToGregorian(j7), j13);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j7) {
            return j7 >= this.iCutover ? this.iGregorianField.getMaximumValue(j7) : this.iJulianField.getMaximumValue(j7);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j7) {
            return j7 >= this.iCutover ? this.iGregorianField.getMinimumValue(j7) : this.iJulianField.getMinimumValue(j7);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j7) {
            this(dateTimeField, dateTimeField2, durationField, j7, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j7) {
            this(dateTimeField, dateTimeField2, durationField, j7, false);
            this.iRangeDurationField = durationField2;
        }

        public ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j7, boolean z4) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j7, z4);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j7, long j13) {
            if (j7 >= this.iCutover) {
                long jAdd = this.iGregorianField.add(j7, j13);
                if (jAdd >= this.iCutover || GJChronology.this.iGapDuration + jAdd >= this.iCutover) {
                    return jAdd;
                }
                if (this.iConvertByWeekyear) {
                    if (GJChronology.this.iGregorianChronology.weekyear().get(jAdd) <= 0) {
                        jAdd = GJChronology.this.iGregorianChronology.weekyear().add(jAdd, -1);
                    }
                } else if (GJChronology.this.iGregorianChronology.year().get(jAdd) <= 0) {
                    jAdd = GJChronology.this.iGregorianChronology.year().add(jAdd, -1);
                }
                return gregorianToJulian(jAdd);
            }
            long jAdd2 = this.iJulianField.add(j7, j13);
            return (jAdd2 < this.iCutover || jAdd2 - GJChronology.this.iGapDuration < this.iCutover) ? jAdd2 : julianToGregorian(jAdd2);
        }
    }

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j7, int i13) {
            return this.iField.add(j7, i13);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j7, long j13) {
            return this.iField.getDifference(j7, j13);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j7, long j13) {
            return this.iField.getDifferenceAsLong(j7, j13);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j7, long j13) {
            return this.iField.add(j7, j13);
        }
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j7, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j7)), chronology.weekOfWeekyear().get(j7)), chronology.dayOfWeek().get(j7)), chronology.millisOfDay().get(j7));
    }

    private static long convertByYear(long j7, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j7), chronology.monthOfYear().get(j7), chronology.dayOfMonth().get(j7), chronology.millisOfDay().get(j7));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j7 = this.iCutoverMillis;
        this.iGapDuration = j7 - julianToGregorianByYear(j7);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GJChronology) {
            GJChronology gJChronology = (GJChronology) obj;
            if (this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i13, i14, i15, i16);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i13, i14, i15, i16);
        if (dateTimeMillis >= this.iCutoverMillis) {
            return dateTimeMillis;
        }
        long dateTimeMillis2 = this.iJulianChronology.getDateTimeMillis(i13, i14, i15, i16);
        if (dateTimeMillis2 < this.iCutoverMillis) {
            return dateTimeMillis2;
        }
        throw new IllegalArgumentException("Specified date does not exist");
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j7) {
        return convertByWeekyear(j7, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j7) {
        return convertByYear(j7, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return this.iCutoverInstant.hashCode() + getMinimumDaysInFirstWeek() + getZone().hashCode() + 25025;
    }

    public long julianToGregorianByWeekyear(long j7) {
        return convertByWeekyear(j7, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j7) {
        return convertByYear(j7, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i13) {
        Instant instant;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i13);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology = concurrentHashMap.get(gJCacheKey);
        if (gJChronology == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
            if (zone == dateTimeZone2) {
                gJChronology = new GJChronology(JulianChronology.getInstance(zone, i13), GregorianChronology.getInstance(zone, i13), instant);
            } else {
                GJChronology gJChronology2 = getInstance(dateTimeZone2, instant, i13);
                gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology2, zone), gJChronology2.iJulianChronology, gJChronology2.iGregorianChronology, gJChronology2.iCutoverInstant);
            }
            GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology);
            if (gJChronologyPutIfAbsent != null) {
                return gJChronologyPutIfAbsent;
            }
        }
        return gJChronology;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i13, int i14, int i15, int i16, int i17, int i18, int i19) throws IllegalArgumentException {
        int i24;
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i13, i14, i15, i16, i17, i18, i19);
            i24 = i15;
        } catch (IllegalFieldValueException e5) {
            i24 = i15;
            if (i14 == 2 && i24 == 29) {
                long dateTimeMillis2 = this.iGregorianChronology.getDateTimeMillis(i13, i14, 28, i16, i17, i18, i19);
                if (dateTimeMillis2 >= this.iCutoverMillis) {
                    throw e5;
                }
                dateTimeMillis = dateTimeMillis2;
            } else {
                throw e5;
            }
        }
        if (dateTimeMillis < this.iCutoverMillis) {
            dateTimeMillis = this.iJulianChronology.getDateTimeMillis(i13, i14, i24, i16, i17, i18, i19);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return dateTimeMillis;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j7, int i13) {
        return getInstance(dateTimeZone, j7 == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j7), i13);
    }
}
