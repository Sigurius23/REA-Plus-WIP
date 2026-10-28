package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29084f;
import pc3.C29093o;
import pc3.EnumC29082d;
import pc3.EnumC29091m;
import vc3.C35890i;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002DEB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\rB!\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0001¢\u0006\u0004\b/\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010(R\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010(R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u0010(R\u0011\u0010\t\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010<R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010(R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006F"}, m65681d2 = {"Lkotlinx/datetime/LocalDate;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDate;", "value", "<init>", "(Ljava/time/LocalDate;)V", "", "year", "month", "day", "(III)V", "Lpc3/m;", "(ILpc3/m;I)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;I)V", "Ljava/io/ObjectInputStream;", "ois", "Ll83/a0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "that", "Lkotlinx/datetime/g;", "rangeTo", "(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/g;", "rangeUntil", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDate;)I", "", "toEpochDays", "()J", "toEpochDaysJvm", "Ljava/time/LocalDate;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDate;", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "getDayOfMonth", "getDayOfMonth$annotations", "getYear", "()Lpc3/m;", "getDay", "Lpc3/d;", "()Lpc3/d;", "dayOfWeek", "getDayOfYear", "dayOfYear", "Companion", "pc3/f", "pc3/g", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35890i.class)
public final class LocalDate implements Comparable<LocalDate>, Serializable {
    public static final C29084f Companion = new C29084f();
    private static final LocalDate MAX;
    private static final LocalDate MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDate value;

    static {
        java.time.LocalDate MIN2 = java.time.LocalDate.MIN;
        AbstractC22676k.m65749i(MIN2, "MIN");
        MIN = new LocalDate(MIN2);
        java.time.LocalDate MAX2 = java.time.LocalDate.MAX;
        AbstractC22676k.m65749i(MAX2, "MAX");
        MAX = new LocalDate(MAX2);
    }

    public LocalDate(java.time.LocalDate value) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
    }

    @InterfaceC23457c
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new C29093o(2, this);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDate) && AbstractC22676k.m65745e(this.value, ((LocalDate) other).value);
        }
        return true;
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    /* JADX INFO: renamed from: getDayOfWeek, reason: collision with other method in class */
    public final EnumC29082d m134404getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        AbstractC22676k.m65749i(dayOfWeek, "getDayOfWeek(...)");
        return (EnumC29082d) EnumC29082d.f117676x.get(dayOfWeek.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    /* JADX INFO: renamed from: getMonth, reason: collision with other method in class */
    public final EnumC29091m m134405getMonth() {
        Month month = this.value.getMonth();
        AbstractC22676k.m65749i(month, "getMonth(...)");
        return AbstractC22674j.m65710R(month);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDate getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final C22726g rangeTo(LocalDate that) {
        AbstractC22676k.m65750j(that, "that");
        return new C22726g(this, that);
    }

    public final C22726g rangeUntil(LocalDate that) {
        AbstractC22676k.m65750j(that, "that");
        C22726g c22726g = C22726g.f89403z;
        Companion.getClass();
        if (that.equals(MIN)) {
            return C22726g.f89403z;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.DayBased unit = DateTimeUnit.DAY;
        AbstractC22676k.m65750j(unit, "unit");
        return new C22726g(this, AbstractC22725f.m65800a(that, -1, unit));
    }

    /* JADX INFO: renamed from: toEpochDays, reason: collision with other method in class */
    public final long m134406toEpochDays() {
        return this.value.toEpochDay();
    }

    public String toString() {
        String string = this.value.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDate other) {
        AbstractC22676k.m65750j(other, "other");
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public final Month getMonth() {
        Month month = this.value.getMonth();
        AbstractC22676k.m65749i(month, "getMonth(...)");
        return month;
    }

    public final int toEpochDays() {
        long epochDay = this.value.toEpochDay();
        if (epochDay > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (epochDay < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) epochDay;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate(int i13, EnumC29091m month, int i14) {
        this(i13, month.ordinal() + 1, i14);
        AbstractC22676k.m65750j(month, "month");
    }

    public final DayOfWeek getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        AbstractC22676k.m65749i(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDate(int i13, int i14, int i15) {
        try {
            java.time.LocalDate localDateOf = java.time.LocalDate.of(i13, i14, i15);
            AbstractC22676k.m65747g(localDateOf);
            this(localDateOf);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public LocalDate(int i13, Month month, int i14) {
        this(i13, AbstractC22674j.m65710R(month), i14);
        AbstractC22676k.m65750j(month, "month");
    }
}
