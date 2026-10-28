package org.joda.time.p378tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes5.dex */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final Recurrence iEndRecurrence;
        final int iStandardOffset;
        final Recurrence iStartRecurrence;

        public DSTZone(String str, int i13, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i13;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j7) {
            long next;
            int i13 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j7, i13, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                next = j7;
            }
            try {
                j7 = recurrence2.next(j7, i13, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j7 ? recurrence : recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DSTZone) {
                DSTZone dSTZone = (DSTZone) obj;
                if (getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j7) {
            return findMatchingRecurrence(j7).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j7) {
            return this.iStandardOffset + findMatchingRecurrence(j7).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j7) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j7) {
            long next;
            int i13 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                next = recurrence.next(j7, i13, recurrence2.getSaveMillis());
                if (j7 > 0 && next < 0) {
                    next = j7;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long next2 = recurrence2.next(j7, i13, recurrence.getSaveMillis());
                if (j7 <= 0 || next2 >= 0) {
                    j7 = next2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return next > j7 ? j7 : next;
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j7) {
            long jPrevious;
            long j13 = j7 + 1;
            int i13 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                jPrevious = recurrence.previous(j13, i13, recurrence2.getSaveMillis());
                if (j13 < 0 && jPrevious > 0) {
                    jPrevious = j13;
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                long jPrevious2 = recurrence2.previous(j13, i13, recurrence.getSaveMillis());
                if (j13 >= 0 || jPrevious2 <= 0) {
                    j13 = jPrevious2;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (jPrevious <= j13) {
                jPrevious = j13;
            }
            return jPrevious - 1;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    public static final class OfYear {
        final boolean iAdvance;
        final int iDayOfMonth;
        final int iDayOfWeek;
        final int iMillisOfDay;
        final char iMode;
        final int iMonthOfYear;

        public OfYear(char c3, int i13, int i14, int i15, boolean z4, int i16) {
            if (c3 != 'u' && c3 != 'w' && c3 != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c3);
            }
            this.iMode = c3;
            this.iMonthOfYear = i13;
            this.iDayOfMonth = i14;
            this.iDayOfWeek = i15;
            this.iAdvance = z4;
            this.iMillisOfDay = i16;
        }

        public static OfYear readFrom(DataInput dataInput) throws IOException {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j7) {
            if (this.iDayOfMonth >= 0) {
                return chronology.dayOfMonth().set(j7, this.iDayOfMonth);
            }
            return chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j7, 1), 1), this.iDayOfMonth);
        }

        private long setDayOfMonthNext(Chronology chronology, long j7) {
            try {
                return setDayOfMonth(chronology, j7);
            } catch (IllegalArgumentException e5) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e5;
                }
                while (!chronology.year().isLeap(j7)) {
                    j7 = chronology.year().add(j7, 1);
                }
                return setDayOfMonth(chronology, j7);
            }
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j7) {
            try {
                return setDayOfMonth(chronology, j7);
            } catch (IllegalArgumentException e5) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e5;
                }
                while (!chronology.year().isLeap(j7)) {
                    j7 = chronology.year().add(j7, -1);
                }
                return setDayOfMonth(chronology, j7);
            }
        }

        private long setDayOfWeek(Chronology chronology, long j7) {
            int i13 = this.iDayOfWeek - chronology.dayOfWeek().get(j7);
            if (i13 == 0) {
                return j7;
            }
            if (this.iAdvance) {
                if (i13 < 0) {
                    i13 += 7;
                }
            } else if (i13 > 0) {
                i13 -= 7;
            }
            return chronology.dayOfWeek().add(j7, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OfYear) {
                OfYear ofYear = (OfYear) obj;
                if (this.iMode == ofYear.iMode && this.iMonthOfYear == ofYear.iMonthOfYear && this.iDayOfMonth == ofYear.iDayOfMonth && this.iDayOfWeek == ofYear.iDayOfWeek && this.iAdvance == ofYear.iAdvance && this.iMillisOfDay == ofYear.iMillisOfDay) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.iMode), Integer.valueOf(this.iMonthOfYear), Integer.valueOf(this.iDayOfMonth), Integer.valueOf(this.iDayOfWeek), Boolean.valueOf(this.iAdvance), Integer.valueOf(this.iMillisOfDay)});
        }

        public long next(long j7, int i13, int i14) {
            char c3 = this.iMode;
            if (c3 == 'w') {
                i13 += i14;
            } else if (c3 != 's') {
                i13 = 0;
            }
            long j13 = i13;
            long j14 = j7 + j13;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j14, this.iMonthOfYear), 0), Math.min(this.iMillisOfDay, 86399999)));
            if (this.iDayOfWeek != 0) {
                dayOfMonthNext = setDayOfWeek(instanceUTC, dayOfMonthNext);
                if (dayOfMonthNext <= j14) {
                    dayOfMonthNext = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthNext, 1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthNext <= j14) {
                dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthNext, 0), this.iMillisOfDay) - j13;
        }

        public long previous(long j7, int i13, int i14) {
            char c3 = this.iMode;
            if (c3 == 'w') {
                i13 += i14;
            } else if (c3 != 's') {
                i13 = 0;
            }
            long j13 = i13;
            long j14 = j7 + j13;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j14, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonthPrevious = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                if (dayOfMonthPrevious >= j14) {
                    dayOfMonthPrevious = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfMonthPrevious, -1), this.iMonthOfYear)));
                }
            } else if (dayOfMonthPrevious >= j14) {
                dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
            }
            return instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(dayOfMonthPrevious, 0), this.iMillisOfDay) - j13;
        }

        public long setInstant(int i13, int i14, int i15) {
            char c3 = this.iMode;
            if (c3 == 'w') {
                i14 += i15;
            } else if (c3 != 's') {
                i14 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i13), this.iMonthOfYear), this.iMillisOfDay));
            if (this.iDayOfWeek != 0) {
                dayOfMonth = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return dayOfMonth - ((long) i14);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("[OfYear]\nMode: ");
            sb4.append(this.iMode);
            sb4.append("\nMonthOfYear: ");
            sb4.append(this.iMonthOfYear);
            sb4.append("\nDayOfMonth: ");
            sb4.append(this.iDayOfMonth);
            sb4.append("\nDayOfWeek: ");
            sb4.append(this.iDayOfWeek);
            sb4.append("\nAdvanceDayOfWeek: ");
            sb4.append(this.iAdvance);
            sb4.append("\nMillisOfDay: ");
            return AbstractC11895b.m31999r(sb4, this.iMillisOfDay, '\n');
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z4, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            long[] jArr;
            int i13;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr2 = new long[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr = new String[size];
            int i14 = 0;
            Transition transition = null;
            int i15 = 0;
            while (i15 < size) {
                Transition transition2 = arrayList.get(i15);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr2[i15] = transition2.getMillis();
                iArr[i15] = transition2.getWallOffset();
                iArr2[i15] = transition2.getStandardOffset();
                strArr[i15] = transition2.getNameKey();
                i15++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            for (String[] strArr3 : new DateFormatSymbols(Locale.ENGLISH).getZoneStrings()) {
                if (strArr3 != null && strArr3.length == 5 && str.equals(strArr3[0])) {
                    strArr2 = strArr3;
                }
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            while (i14 < size - 1) {
                String str2 = strArr[i14];
                int i16 = i14 + 1;
                String str3 = strArr[i16];
                long j7 = iArr[i14];
                int i17 = size;
                int i18 = i14;
                long j13 = iArr[i16];
                long j14 = iArr2[i18];
                long j15 = iArr2[i16];
                Period period = new Period(jArr2[i18], jArr2[i16], PeriodType.yearMonthDay(), instanceUTC);
                ISOChronology iSOChronology = instanceUTC;
                if (j7 != j13 && j14 == j15 && str2.equals(str3) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str2.equals(strArr2[2]) && str2.equals(strArr2[4])) {
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Fixing duplicate name key - " + str3);
                        PrintStream printStream = System.out;
                        StringBuilder sb4 = new StringBuilder("     - ");
                        jArr = jArr2;
                        sb4.append(new DateTime(jArr[i18], iSOChronology));
                        sb4.append(" - ");
                        sb4.append(new DateTime(jArr[i16], iSOChronology));
                        printStream.println(sb4.toString());
                    } else {
                        jArr = jArr2;
                    }
                    if (j7 > j13) {
                        strArr[i18] = str2.concat("-Summer").intern();
                    } else {
                        strArr[i16] = (str3 + "-Summer").intern();
                        i13 = i16;
                    }
                    i14 = i13 + 1;
                    instanceUTC = iSOChronology;
                    iArr2 = iArr2;
                    jArr2 = jArr;
                    iArr = iArr;
                    size = i17;
                } else {
                    jArr = jArr2;
                    iArr = iArr;
                    iArr2 = iArr2;
                }
                i13 = i18;
                i14 = i13 + 1;
                instanceUTC = iSOChronology;
                iArr2 = iArr2;
                jArr2 = jArr;
                iArr = iArr;
                size = i17;
            }
            long[] jArr3 = jArr2;
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            return new PrecalculatedZone(z4 ? str : "", jArr3, iArr3, iArr4, strArr, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) throws IOException {
            int unsignedByte;
            int unsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[unsignedShort];
            for (int i13 = 0; i13 < unsignedShort; i13++) {
                strArr[i13] = dataInput.readUTF();
            }
            int i14 = dataInput.readInt();
            long[] jArr = new long[i14];
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            String[] strArr2 = new String[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                jArr[i15] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i15] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i15] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (unsignedShort < 256) {
                    try {
                        unsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    unsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i15] = strArr[unsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrecalculatedZone) {
                PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
                if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                    DSTZone dSTZone = this.iTailZone;
                    DSTZone dSTZone2 = precalculatedZone.iTailZone;
                    if (dSTZone != null ? dSTZone.equals(dSTZone2) : dSTZone2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j7) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            if (iBinarySearch >= 0) {
                return this.iNameKeys[iBinarySearch];
            }
            int i13 = ~iBinarySearch;
            if (i13 < jArr.length) {
                return i13 > 0 ? this.iNameKeys[i13 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i13 - 1] : dSTZone.getNameKey(j7);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j7) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            if (iBinarySearch >= 0) {
                return this.iWallOffsets[iBinarySearch];
            }
            int i13 = ~iBinarySearch;
            if (i13 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i13 - 1] : dSTZone.getOffset(j7);
            }
            if (i13 > 0) {
                return this.iWallOffsets[i13 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j7) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            if (iBinarySearch >= 0) {
                return this.iStandardOffsets[iBinarySearch];
            }
            int i13 = ~iBinarySearch;
            if (i13 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i13 - 1] : dSTZone.getStandardOffset(j7);
            }
            if (i13 > 0) {
                return this.iStandardOffsets[i13 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int hashCode() {
            return getID().hashCode();
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d3 = 0.0d;
            int i13 = 0;
            for (int i14 = 1; i14 < jArr.length; i14++) {
                long j7 = jArr[i14] - jArr[i14 - 1];
                if (j7 < 63158400000L) {
                    d3 += j7;
                    i13++;
                }
            }
            return i13 > 0 && (d3 / ((double) i13)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j7) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            int i13 = iBinarySearch >= 0 ? iBinarySearch + 1 : ~iBinarySearch;
            if (i13 < jArr.length) {
                return jArr[i13];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j7;
            }
            long j13 = jArr[jArr.length - 1];
            if (j7 < j13) {
                j7 = j13;
            }
            return dSTZone.nextTransition(j7);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j7) {
            long[] jArr = this.iTransitions;
            int iBinarySearch = Arrays.binarySearch(jArr, j7);
            if (iBinarySearch < 0) {
                int i13 = ~iBinarySearch;
                if (i13 >= jArr.length) {
                    DSTZone dSTZone = this.iTailZone;
                    if (dSTZone != null) {
                        long jPreviousTransition = dSTZone.previousTransition(j7);
                        if (jPreviousTransition < j7) {
                            return jPreviousTransition;
                        }
                    }
                    long j13 = jArr[i13 - 1];
                    if (j13 > Long.MIN_VALUE) {
                        return j13 - 1;
                    }
                } else if (i13 > 0) {
                    long j14 = jArr[i13 - 1];
                    if (j14 > Long.MIN_VALUE) {
                        return j14 - 1;
                    }
                }
            } else if (j7 > Long.MIN_VALUE) {
                return j7 - 1;
            }
            return j7;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < length; i13++) {
                hashSet.add(this.iNameKeys[i13]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                strArr[i14] = (String) it.next();
                i14++;
            }
            dataOutput.writeShort(size);
            for (int i15 = 0; i15 < size; i15++) {
                dataOutput.writeUTF(strArr[i15]);
            }
            dataOutput.writeInt(length);
            for (int i16 = 0; i16 < length; i16++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i16]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i16]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i16]);
                String str = this.iNameKeys[i16];
                for (int i17 = 0; i17 < size; i17++) {
                    if (strArr[i17].equals(str)) {
                        if (size < 256) {
                            dataOutput.writeByte(i17);
                            break;
                        } else {
                            dataOutput.writeShort(i17);
                            break;
                        }
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    public static final class Recurrence {
        final String iNameKey;
        final OfYear iOfYear;
        final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i13) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i13;
        }

        public static Recurrence readFrom(DataInput dataInput) throws IOException {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Recurrence) {
                Recurrence recurrence = (Recurrence) obj;
                if (this.iSaveMillis == recurrence.iSaveMillis && this.iNameKey.equals(recurrence.iNameKey) && this.iOfYear.equals(recurrence.iOfYear)) {
                    return true;
                }
            }
            return false;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iSaveMillis), this.iNameKey, this.iOfYear});
        }

        public long next(long j7, int i13, int i14) {
            return this.iOfYear.next(j7, i13, i14);
        }

        public long previous(long j7, int i13, int i14) {
            return this.iOfYear.previous(j7, i13, i14);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public String toString() {
            return this.iOfYear + " named " + this.iNameKey + " at " + this.iSaveMillis;
        }

        public void writeTo(DataOutput dataOutput) throws IOException {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Rule {
        final int iFromYear;
        final Recurrence iRecurrence;
        final int iToYear;

        public Rule(Recurrence recurrence, int i13, int i14) {
            this.iRecurrence = recurrence;
            this.iFromYear = i13;
            this.iToYear = i14;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j7, int i13, int i14) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i15 = i13 + i14;
            long next = this.iRecurrence.next(((j7 > Long.MIN_VALUE ? 1 : (j7 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i15) + j7)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - ((long) i15)) - 1 : j7, i13, i14);
            return (next <= j7 || instanceUTC.year().get(((long) i15) + next) <= this.iToYear) ? next : j7;
        }

        public String toString() {
            return this.iFromYear + " to " + this.iToYear + " using " + this.iRecurrence;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i13 = size - 1;
        Transition transition2 = arrayList.get(i13);
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (transition.getMillis() + ((long) transition2.getWallOffset()) == transition2.getMillis() + ((long) (size >= 2 ? arrayList.get(size - 2).getWallOffset() : 0))) {
            return addTransition(arrayList, transition.withMillis(arrayList.remove(i13).getMillis()));
        }
        arrayList.add(transition);
        return true;
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i13, int i14) {
        return ("UTC".equals(str) && str.equals(str2) && i13 == 0 && i14 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i13, i14);
    }

    private RuleSet getLastRuleSet() {
        DateTimeZoneBuilder dateTimeZoneBuilder;
        if (this.iRuleSets.size() == 0) {
            dateTimeZoneBuilder = this;
            dateTimeZoneBuilder.addCutover(Integer.MIN_VALUE, 'w', 1, 1, 0, false, 0);
        } else {
            dateTimeZoneBuilder = this;
        }
        return (RuleSet) AbstractC25012a.m73371d(dateTimeZoneBuilder.iRuleSets, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) throws IOException {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) throws IOException {
        long unsignedByte;
        long j7;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i13 = unsignedByte2 >> 6;
        if (i13 == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j7 = 60000;
        } else if (i13 == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j7 = 1000;
        } else {
            if (i13 == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j7 = 1800000;
        }
        return unsignedByte * j7;
    }

    public static void writeMillis(DataOutput dataOutput, long j7) throws IOException {
        if (j7 % 1800000 == 0) {
            long j13 = j7 / 1800000;
            if (((j13 << 58) >> 58) == j13) {
                dataOutput.writeByte((int) (j13 & 63));
                return;
            }
        }
        if (j7 % 60000 == 0) {
            long j14 = j7 / 60000;
            if (((j14 << 34) >> 34) == j14) {
                dataOutput.writeInt(((int) (1073741823 & j14)) | 1073741824);
                return;
            }
        }
        if (j7 % 1000 == 0) {
            long j15 = j7 / 1000;
            if (((j15 << 26) >> 26) == j15) {
                dataOutput.writeByte(((int) ((j15 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) j15);
                return;
            }
        }
        dataOutput.writeByte(j7 < 0 ? 255 : 192);
        dataOutput.writeLong(j7);
    }

    public DateTimeZoneBuilder addCutover(int i13, char c3, int i14, int i15, int i16, boolean z4, int i17) {
        if (this.iRuleSets.size() > 0) {
            ((RuleSet) AbstractC25012a.m73371d(this.iRuleSets, 1)).setUpperLimit(i13, new OfYear(c3, i14, i15, i16, z4, i17));
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i13, int i14, int i15, char c3, int i16, int i17, int i18, boolean z4, int i19) {
        if (i14 <= i15) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c3, i16, i17, i18, z4, i19), str, i13), i14, i15));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i13) {
        getLastRuleSet().setFixedSavings(str, i13);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i13) {
        getLastRuleSet().setStandardOffset(i13);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z4) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        int size = this.iRuleSets.size();
        DSTZone dSTZoneBuildTailZone = null;
        long upperLimit = Long.MIN_VALUE;
        for (int i13 = 0; i13 < size; i13++) {
            RuleSet ruleSet = this.iRuleSets.get(i13);
            Transition transitionFirstTransition = ruleSet.firstTransition(upperLimit);
            if (transitionFirstTransition != null) {
                addTransition(arrayList, transitionFirstTransition);
                long millis = transitionFirstTransition.getMillis();
                int saveMillis = transitionFirstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition transitionNextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (transitionNextTransition == null || (addTransition(arrayList, transitionNextTransition) && dSTZoneBuildTailZone != null)) {
                        break;
                    }
                    long millis2 = transitionNextTransition.getMillis();
                    int saveMillis2 = transitionNextTransition.getSaveMillis();
                    if (dSTZoneBuildTailZone == null && i13 == size - 1) {
                        dSTZoneBuildTailZone = ruleSet2.buildTailZone(str);
                    }
                    saveMillis = saveMillis2;
                    millis = millis2;
                }
                upperLimit = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZoneBuildTailZone != null ? dSTZoneBuildTailZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZoneBuildTailZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone precalculatedZoneCreate = PrecalculatedZone.create(str, z4, arrayList, dSTZoneBuildTailZone);
        return precalculatedZoneCreate.isCachable() ? CachedDateTimeZone.forZone(precalculatedZoneCreate) : precalculatedZoneCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) throws IOException {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
            return;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeTo(str, (DataOutput) dataOutputStream);
        dataOutputStream.flush();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j7) {
            String str = this.iInitialNameKey;
            if (str != null) {
                int i13 = this.iStandardOffset;
                return new Transition(j7, str, i13 + this.iInitialSaveMillis, i13);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long millis = Long.MIN_VALUE;
            int saveMillis = 0;
            Transition transition = null;
            while (true) {
                Transition transitionNextTransition = nextTransition(millis, saveMillis);
                if (transitionNextTransition == null) {
                    break;
                }
                millis = transitionNextTransition.getMillis();
                if (millis == j7) {
                    transition = new Transition(j7, transitionNextTransition);
                    break;
                }
                if (millis > j7) {
                    if (transition == null) {
                        for (Rule rule : arrayList) {
                            if (rule.getSaveMillis() == 0) {
                                transition = new Transition(j7, rule, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    if (transition != null) {
                        break;
                    }
                    String nameKey = transitionNextTransition.getNameKey();
                    int i14 = this.iStandardOffset;
                    transition = new Transition(j7, nameKey, i14, i14);
                    break;
                }
                transition = new Transition(j7, transitionNextTransition);
                saveMillis = transitionNextTransition.getSaveMillis();
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i13) {
            int i14 = this.iUpperYear;
            if (i14 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i14, this.iStandardOffset, i13);
        }

        public Transition nextTransition(long j7, int i13) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j13 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j7, this.iStandardOffset, i13);
                if (next2 <= j7) {
                    it.remove();
                } else if (next2 <= j13) {
                    rule = next;
                    j13 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j13) >= YEAR_LIMIT) {
                return null;
            }
            int i14 = this.iUpperYear;
            if (i14 >= Integer.MAX_VALUE || j13 < this.iUpperOfYear.setInstant(i14, this.iStandardOffset, i13)) {
                return new Transition(j13, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i13) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i13;
        }

        public void setStandardOffset(int i13) {
            this.iStandardOffset = i13;
        }

        public void setUpperLimit(int i13, OfYear ofYear) {
            this.iUpperYear = i13;
            this.iUpperOfYear = ofYear;
        }

        public String toString() {
            return this.iInitialNameKey + " initial: " + this.iInitialSaveMillis + " std: " + this.iStandardOffset + " upper: " + this.iUpperYear + " " + this.iUpperOfYear + " " + this.iRules;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j7, Transition transition) {
            this.iMillis = j7;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis) {
                return (this.iWallOffset == transition.iWallOffset && this.iStandardOffset == transition.iStandardOffset && this.iNameKey.equals(transition.iNameKey)) ? false : true;
            }
            return false;
        }

        public String toString() {
            return new DateTime(this.iMillis, DateTimeZone.UTC) + " " + this.iStandardOffset + " " + this.iWallOffset;
        }

        public Transition withMillis(long j7) {
            return new Transition(j7, this.iNameKey, this.iWallOffset, this.iStandardOffset);
        }

        public Transition(long j7, Rule rule, int i13) {
            this.iMillis = j7;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i13;
            this.iStandardOffset = i13;
        }

        public Transition(long j7, String str, int i13, int i14) {
            this.iMillis = j7;
            this.iNameKey = str;
            this.iWallOffset = i13;
            this.iStandardOffset = i14;
        }
    }

    public void writeTo(String str, DataOutput dataOutput) throws IOException {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }
}
