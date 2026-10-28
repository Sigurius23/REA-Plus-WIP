package p715kotlin.time;

import c93.InterfaceC4351m;
import org.joda.time.DateTimeConstants;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m65681d2 = {"Lkotlin/time/UnboundLocalDateTime;", "", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "<init>", "(IIIIIII)V", "T", "offsetSeconds", "Lkotlin/Function2;", "", "buildInstant", "toInstant", "(ILc93/m;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "I", "getYear", "()I", "getMonth", "getDay", "getHour", "getMinute", "getSecond", "getNanosecond", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class UnboundLocalDateTime {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int day;
    private final int hour;
    private final int minute;
    private final int month;
    private final int nanosecond;
    private final int second;
    private final int year;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0080\u0004¨\u0006\b"}, m65681d2 = {"Lkotlin/time/UnboundLocalDateTime$Companion;", "", "<init>", "()V", "fromInstant", "Lkotlin/time/UnboundLocalDateTime;", "instant", "Lkotlin/time/Instant;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnboundLocalDateTime fromInstant(Instant instant) {
            long j7;
            AbstractC22676k.m65750j(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j13 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j13 * 86400 != epochSeconds) {
                j13--;
            }
            long j14 = epochSeconds % 86400;
            int i13 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
            long j15 = (j13 + ((long) 719528)) - ((long) 60);
            if (j15 < 0) {
                long j16 = 146097;
                long j17 = ((j15 + 1) / j16) - 1;
                j7 = ((long) 400) * j17;
                j15 += (-j17) * j16;
            } else {
                j7 = 0;
            }
            long j18 = 400;
            long j19 = ((j18 * j15) + ((long) 591)) / ((long) 146097);
            long j24 = 365;
            long j25 = 4;
            long j26 = 100;
            long j27 = j15 - ((j19 / j18) + (((j19 / j25) + (j24 * j19)) - (j19 / j26)));
            if (j27 < 0) {
                j19--;
                j27 = j15 - ((j19 / j18) + (((j19 / j25) + (j24 * j19)) - (j19 / j26)));
            }
            long j28 = j19 + j7;
            int i14 = (int) j27;
            int i15 = ((i14 * 5) + 2) / 153;
            int i16 = ((i15 + 2) % 12) + 1;
            int i17 = (i14 - (((i15 * 306) + 5) / 10)) + 1;
            int i18 = (int) (j28 + ((long) (i15 / 10)));
            int i19 = i13 / DateTimeConstants.SECONDS_PER_HOUR;
            int i24 = i13 - (i19 * DateTimeConstants.SECONDS_PER_HOUR);
            int i25 = i24 / 60;
            return new UnboundLocalDateTime(i18, i16, i17, i19, i25, i24 - (i25 * 60), instant.getNanosecondsOfSecond());
        }

        private Companion() {
        }
    }

    public UnboundLocalDateTime(int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.year = i13;
        this.month = i14;
        this.day = i15;
        this.hour = i16;
        this.minute = i17;
        this.second = i18;
        this.nanosecond = i19;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNanosecond() {
        return this.nanosecond;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getYear() {
        return this.year;
    }

    public final <T> T toInstant(int offsetSeconds, InterfaceC4351m buildInstant) {
        long j7;
        AbstractC22676k.m65750j(buildInstant, "buildInstant");
        long year = getYear();
        long j13 = ((long) 365) * year;
        if (year >= 0) {
            j7 = ((year + ((long) 399)) / ((long) 400)) + (((((long) 3) + year) / ((long) 4)) - ((((long) 99) + year) / ((long) 100))) + j13;
        } else {
            j7 = j13 - ((year / ((long) (-400))) + ((year / ((long) (-4))) - (year / ((long) (-100)))));
        }
        long month = j7 + ((long) (((getMonth() * 367) - 362) / 12)) + ((long) (getDay() - 1));
        if (getMonth() > 2) {
            month = !InstantKt.isLeapYear(getYear()) ? month - 2 : (-1) + month;
        }
        return (T) buildInstant.invoke(Long.valueOf((((month - ((long) 719528)) * ((long) DateTimeConstants.SECONDS_PER_DAY)) + ((long) (((getMinute() * 60) + (getHour() * DateTimeConstants.SECONDS_PER_HOUR)) + getSecond()))) - ((long) offsetSeconds)), Integer.valueOf(getNanosecond()));
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("UnboundLocalDateTime(");
        sb4.append(this.year);
        sb4.append('-');
        sb4.append(this.month);
        sb4.append('-');
        sb4.append(this.day);
        sb4.append(' ');
        sb4.append(this.hour);
        sb4.append(':');
        sb4.append(this.minute);
        sb4.append(':');
        sb4.append(this.second);
        sb4.append('.');
        return AbstractC11895b.m31999r(sb4, this.nanosecond, ')');
    }
}
