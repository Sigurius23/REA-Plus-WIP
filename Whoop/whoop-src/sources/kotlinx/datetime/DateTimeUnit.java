package kotlinx.datetime;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import r80.AbstractC31061c;
import vc3.C35882a;
import vc3.C35887f;
import vc3.C35888g;
import vc3.C35893l;
import vc3.C35894m;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, m65681d2 = {"Lkotlinx/datetime/DateTimeUnit;", "", "<init>", "()V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit;", "value", "", "unit", "formatToString", "(ILjava/lang/String;)Ljava/lang/String;", "", "(JLjava/lang/String;)Ljava/lang/String;", "Companion", "TimeBased", "DateBased", "DayBased", "MonthBased", "kotlinx/datetime/a", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35887f.class)
public abstract class DateTimeUnit {
    private static final MonthBased CENTURY;
    public static final C22720a Companion = new C22720a();
    private static final DayBased DAY;
    private static final TimeBased HOUR;
    private static final TimeBased MICROSECOND;
    private static final TimeBased MILLISECOND;
    private static final TimeBased MINUTE;
    private static final MonthBased MONTH;
    private static final TimeBased NANOSECOND;
    private static final MonthBased QUARTER;
    private static final TimeBased SECOND;
    private static final DayBased WEEK;
    private static final MonthBased YEAR;

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003Z>\b\u0007\u0010\u000e\"\u00020\u00042\u00020\u0004B0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\f\b\f\u0012\b\b\fJ\u0004\b\b(\rZ>\b\u0007\u0010\u0012\"\u00020\u000f2\u00020\u000fB0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\f\b\f\u0012\b\b\fJ\u0004\b\b(\r\u0082\u0001\u0002\u0004\u000f¨\u0006\u0015"}, m65681d2 = {"Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit;", "<init>", "()V", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "Ll83/c;", "message", "Use DateTimeUnit.DayBased", "replaceWith", "Ll83/l;", "expression", "DateTimeUnit.DayBased", "imports", "kotlinx.datetime.DateTimeUnit", "DayBased", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "Use DateTimeUnit.MonthBased", "DateTimeUnit.MonthBased", "MonthBased", "Companion", "kotlinx/datetime/b", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C35882a.class)
    public static abstract class DateBased extends DateTimeUnit {
        public static final C22721b Companion = new C22721b();

        public /* synthetic */ DateBased(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DateBased() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, m65681d2 = {"Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "days", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$DayBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getDays", "Companion", "kotlinx/datetime/c", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C35888g.class)
    public static final class DayBased extends DateBased {
        public static final C22722c Companion = new C22722c();
        private final int days;

        public DayBased(int i13) {
            super(null);
            this.days = i13;
            if (i13 <= 0) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Unit duration must be positive, but was ", " days.").toString());
            }
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof DayBased) && this.days == ((DayBased) other).days;
            }
            return true;
        }

        public final int getDays() {
            return this.days;
        }

        public int hashCode() {
            return this.days ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }

        public String toString() {
            int i13 = this.days;
            return i13 % 7 == 0 ? formatToString(i13 / 7, "WEEK") : formatToString(i13, "DAY");
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public DayBased times(int scalar) {
            return new DayBased(Math.multiplyExact(this.days, scalar));
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, m65681d2 = {"Lkotlinx/datetime/DateTimeUnit$MonthBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "months", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getMonths", "Companion", "kotlinx/datetime/d", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C35893l.class)
    public static final class MonthBased extends DateBased {
        public static final C22723d Companion = new C22723d();
        private final int months;

        public MonthBased(int i13) {
            super(null);
            this.months = i13;
            if (i13 <= 0) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Unit duration must be positive, but was ", " months.").toString());
            }
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof MonthBased) && this.months == ((MonthBased) other).months;
            }
            return true;
        }

        public final int getMonths() {
            return this.months;
        }

        public int hashCode() {
            return this.months ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        }

        public String toString() {
            int i13 = this.months;
            if (i13 % 1200 == 0) {
                return formatToString(i13 / 1200, "CENTURY");
            }
            if (i13 % 12 == 0) {
                return formatToString(i13 / 12, "YEAR");
            }
            return i13 % 3 == 0 ? formatToString(i13 / 3, "QUARTER") : formatToString(i13, "MONTH");
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public MonthBased times(int scalar) {
            return new MonthBased(Math.multiplyExact(this.months, scalar));
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001f"}, m65681d2 = {"Lkotlinx/datetime/DateTimeUnit$TimeBased;", "Lkotlinx/datetime/DateTimeUnit;", "", "nanoseconds", "<init>", "(J)V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getNanoseconds", "()J", "unitName", "Ljava/lang/String;", "unitScale", "Lkotlin/time/Duration;", "getDuration-UwyO8pc", AttachmentExtensionsKt.EXTRA_DURATION, "Companion", "kotlinx/datetime/e", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i(with = C35894m.class)
    public static final class TimeBased extends DateTimeUnit {
        public static final C22724e Companion = new C22724e();
        private final long nanoseconds;
        private final String unitName;
        private final long unitScale;

        public TimeBased(long j7) {
            super(null);
            this.nanoseconds = j7;
            if (j7 <= 0) {
                throw new IllegalArgumentException(AbstractC31061c.m95636l(j7, "Unit duration must be positive, but was ", " ns.").toString());
            }
            if (j7 % 3600000000000L == 0) {
                this.unitName = "HOUR";
                this.unitScale = j7 / 3600000000000L;
                return;
            }
            if (j7 % 60000000000L == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j7 / 60000000000L;
                return;
            }
            long j13 = 1000000000;
            if (j7 % j13 == 0) {
                this.unitName = "SECOND";
                this.unitScale = j7 / j13;
                return;
            }
            long j14 = DurationKt.NANOS_IN_MILLIS;
            if (j7 % j14 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j7 / j14;
                return;
            }
            long j15 = 1000;
            if (j7 % j15 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j7 / j15;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j7;
            }
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof TimeBased) && this.nanoseconds == ((TimeBased) other).nanoseconds;
            }
            return true;
        }

        /* JADX INFO: renamed from: getDuration-UwyO8pc, reason: not valid java name */
        public final long m134403getDurationUwyO8pc() {
            Duration.Companion companion = Duration.INSTANCE;
            return DurationKt.toDuration(this.nanoseconds, DurationUnit.NANOSECONDS);
        }

        public final long getNanoseconds() {
            return this.nanoseconds;
        }

        public int hashCode() {
            long j7 = this.nanoseconds;
            return ((int) (j7 >> 32)) ^ ((int) j7);
        }

        public String toString() {
            return formatToString(this.unitScale, this.unitName);
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public TimeBased times(int scalar) {
            return new TimeBased(Math.multiplyExact(this.nanoseconds, scalar));
        }
    }

    static {
        TimeBased timeBased = new TimeBased(1L);
        NANOSECOND = timeBased;
        TimeBased timeBasedTimes = timeBased.times(1000);
        MICROSECOND = timeBasedTimes;
        TimeBased timeBasedTimes2 = timeBasedTimes.times(1000);
        MILLISECOND = timeBasedTimes2;
        TimeBased timeBasedTimes3 = timeBasedTimes2.times(1000);
        SECOND = timeBasedTimes3;
        TimeBased timeBasedTimes4 = timeBasedTimes3.times(60);
        MINUTE = timeBasedTimes4;
        HOUR = timeBasedTimes4.times(60);
        DayBased dayBased = new DayBased(1);
        DAY = dayBased;
        WEEK = dayBased.times(7);
        MonthBased monthBased = new MonthBased(1);
        MONTH = monthBased;
        QUARTER = monthBased.times(3);
        MonthBased monthBasedTimes = monthBased.times(12);
        YEAR = monthBasedTimes;
        CENTURY = monthBasedTimes.times(100);
    }

    public /* synthetic */ DateTimeUnit(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String formatToString(int value, String unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (value == 1) {
            return unit;
        }
        return value + '-' + unit;
    }

    public abstract DateTimeUnit times(int scalar);

    private DateTimeUnit() {
    }

    public final String formatToString(long value, String unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (value == 1) {
            return unit;
        }
        return value + '-' + unit;
    }
}
