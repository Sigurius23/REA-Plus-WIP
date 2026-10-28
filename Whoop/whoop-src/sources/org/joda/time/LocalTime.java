package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalTime extends BaseLocal implements ReadablePartial, Serializable {
    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set<DurationFieldType> TIME_DURATION_TYPES;
    private static final long serialVersionUID = -12873158713873L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -325842547277223L;
        private transient DateTimeField iField;
        private transient LocalTime iInstant;

        public Property(LocalTime localTime, DateTimeField dateTimeField) {
            this.iInstant = localTime;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (LocalTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalTime addCopy(int i13) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), i13));
        }

        public LocalTime addNoWrapToCopy(int i13) {
            long jAdd = this.iField.add(this.iInstant.getLocalMillis(), i13);
            if (this.iInstant.getChronology().millisOfDay().get(jAdd) == jAdd) {
                return this.iInstant.withLocalMillis(jAdd);
            }
            throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
        }

        public LocalTime addWrapFieldToCopy(int i13) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.addWrapField(localTime.getLocalMillis(), i13));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalTime getLocalTime() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundFloor(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfCeiling(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfEven(localTime.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy() {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.roundHalfFloor(localTime.getLocalMillis()));
        }

        public LocalTime setCopy(int i13) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), i13));
        }

        public LocalTime withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public LocalTime addCopy(long j7) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.add(localTime.getLocalMillis(), j7));
        }

        public LocalTime setCopy(String str, Locale locale) {
            LocalTime localTime = this.iInstant;
            return localTime.withLocalMillis(this.iField.set(localTime.getLocalMillis(), str, locale));
        }

        public LocalTime setCopy(String str) {
            return setCopy(str, null);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        TIME_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.millis());
        hashSet.add(DurationFieldType.seconds());
        hashSet.add(DurationFieldType.minutes());
        hashSet.add(DurationFieldType.hours());
    }

    public LocalTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public static LocalTime fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static LocalTime fromDateFields(Date date) {
        if (date != null) {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), (((int) (date.getTime() % 1000)) + 1000) % 1000);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static LocalTime fromMillisOfDay(long j7) {
        return fromMillisOfDay(j7, null);
    }

    public static LocalTime now() {
        return new LocalTime();
    }

    @FromString
    public static LocalTime parse(String str) {
        return parse(str, ISODateTimeFormat.localTimeParser());
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        if (chronology == null) {
            return new LocalTime(this.iLocalMillis, ISOChronology.getInstanceUTC());
        }
        return !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalTime(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i13, Chronology chronology) {
        if (i13 == 0) {
            return chronology.hourOfDay();
        }
        if (i13 == 1) {
            return chronology.minuteOfHour();
        }
        if (i13 == 2) {
            return chronology.secondOfMinute();
        }
        if (i13 == 3) {
            return chronology.millisOfSecond();
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Invalid index: "));
    }

    public int getHourOfDay() {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    @Override // org.joda.time.base.BaseLocal
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMillisOfDay() {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond() {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour() {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getSecondOfMinute() {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i13) {
        if (i13 == 0) {
            return getChronology().hourOfDay().get(getLocalMillis());
        }
        if (i13 == 1) {
            return getChronology().minuteOfHour().get(getLocalMillis());
        }
        if (i13 == 2) {
            return getChronology().secondOfMinute().get(getLocalMillis());
        }
        if (i13 == 3) {
            return getChronology().millisOfSecond().get(getLocalMillis());
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Invalid index: "));
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int hashCode() {
        return getChronology().hashCode() + this.iChronology.millisOfSecond().getType().hashCode() + ((this.iChronology.millisOfSecond().get(this.iLocalMillis) + ((this.iChronology.secondOfMinute().getType().hashCode() + ((this.iChronology.secondOfMinute().get(this.iLocalMillis) + ((this.iChronology.minuteOfHour().getType().hashCode() + ((this.iChronology.minuteOfHour().get(this.iLocalMillis) + ((this.iChronology.hourOfDay().getType().hashCode() + ((this.iChronology.hourOfDay().get(this.iLocalMillis) + 3611) * 23)) * 23)) * 23)) * 23)) * 23)) * 23)) * 23);
    }

    public Property hourOfDay() {
        return new Property(this, getChronology().hourOfDay());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !isSupported(dateTimeFieldType.getDurationType())) {
            return false;
        }
        DurationFieldType rangeDurationType = dateTimeFieldType.getRangeDurationType();
        return isSupported(rangeDurationType) || rangeDurationType == DurationFieldType.days();
    }

    public Property millisOfDay() {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond() {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalTime minusHours(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i13));
    }

    public LocalTime minusMillis(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i13));
    }

    public LocalTime minusMinutes(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i13));
    }

    public LocalTime minusSeconds(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i13));
    }

    public Property minuteOfHour() {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalTime plusHours(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().hours().add(getLocalMillis(), i13));
    }

    public LocalTime plusMillis(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().millis().add(getLocalMillis(), i13));
    }

    public LocalTime plusMinutes(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().minutes().add(getLocalMillis(), i13));
    }

    public LocalTime plusSeconds(int i13) {
        return i13 == 0 ? this : withLocalMillis(getChronology().seconds().add(getLocalMillis(), i13));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public Property secondOfMinute() {
        return new Property(this, getChronology().secondOfMinute());
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 4;
    }

    public DateTime toDateTimeToday() {
        return toDateTimeToday(null);
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.time().print(this);
    }

    public LocalTime withField(DateTimeFieldType dateTimeFieldType, int i13) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i13));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public LocalTime withFieldAdded(DurationFieldType durationFieldType, int i13) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(durationFieldType)) {
            return i13 == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i13));
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public LocalTime withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalTime withHourOfDay(int i13) {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i13));
    }

    public LocalTime withLocalMillis(long j7) {
        return j7 == getLocalMillis() ? this : new LocalTime(j7, getChronology());
    }

    public LocalTime withMillisOfDay(int i13) {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i13));
    }

    public LocalTime withMillisOfSecond(int i13) {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i13));
    }

    public LocalTime withMinuteOfHour(int i13) {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i13));
    }

    public LocalTime withPeriodAdded(ReadablePeriod readablePeriod, int i13) {
        return (readablePeriod == null || i13 == 0) ? this : withLocalMillis(getChronology().add(readablePeriod, getLocalMillis(), i13));
    }

    public LocalTime withSecondOfMinute(int i13) {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i13));
    }

    public LocalTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalTime fromMillisOfDay(long j7, Chronology chronology) {
        return new LocalTime(j7, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public static LocalTime now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalTime(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public static LocalTime parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalTime(str);
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalTime) {
            LocalTime localTime = (LocalTime) readablePartial;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j7 = this.iLocalMillis;
                long j13 = localTime.iLocalMillis;
                if (j7 < j13) {
                    return -1;
                }
                return j7 == j13 ? 0 : 1;
            }
        }
        return super.compareTo(readablePartial);
    }

    public DateTime toDateTimeToday(DateTimeZone dateTimeZone) {
        Chronology chronologyWithZone = getChronology().withZone(dateTimeZone);
        return new DateTime(chronologyWithZone.set(this, DateTimeUtils.currentTimeMillis()), chronologyWithZone);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public LocalTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalTime(long j7) {
        this(j7, ISOChronology.getInstance());
    }

    public static LocalTime now(Chronology chronology) {
        if (chronology != null) {
            return new LocalTime(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (TIME_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() < getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public LocalTime(long j7, DateTimeZone dateTimeZone) {
        this(j7, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalTime(long j7, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j7);
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iLocalMillis = chronologyWithUTC.millisOfDay().get(millisKeepLocal);
        this.iChronology = chronologyWithUTC;
    }

    public LocalTime(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalTime(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology chronologyWithUTC = chronology.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology chronologyWithUTC = chronology2.withUTC();
        this.iChronology = chronologyWithUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localTimeParser());
        this.iLocalMillis = chronologyWithUTC.getDateTimeMillis(0L, partialValues[0], partialValues[1], partialValues[2], partialValues[3]);
    }

    public LocalTime(int i13, int i14) {
        this(i13, i14, 0, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i13, int i14, int i15) {
        this(i13, i14, i15, 0, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i13, int i14, int i15, int i16) {
        this(i13, i14, i15, i16, ISOChronology.getInstanceUTC());
    }

    public LocalTime(int i13, int i14, int i15, int i16, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = chronologyWithUTC.getDateTimeMillis(0L, i13, i14, i15, i16);
        this.iChronology = chronologyWithUTC;
        this.iLocalMillis = dateTimeMillis;
    }
}
