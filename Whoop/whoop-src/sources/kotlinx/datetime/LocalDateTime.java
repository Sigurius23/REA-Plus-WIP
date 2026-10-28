package kotlinx.datetime;

import com.mapbox.common.HttpHeaders;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pc3.C29088j;
import pc3.C29093o;
import pc3.EnumC29082d;
import pc3.EnumC29091m;
import vc3.C35891j;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002LMB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000fBE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016BE\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u001a\u00109\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010%R\u0011\u0010\t\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001a\u0010:R\u001a\u0010\u0018\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010%R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0011\u0010@\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010?R\u0011\u0010B\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010%R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, m65681d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDateTime;", "value", "<init>", "(Ljava/time/LocalDateTime;)V", "", "year", "month", "day", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lpc3/m;", "(ILpc3/m;IIIII)V", "Lkotlinx/datetime/LocalDate;", HttpHeaders.DATE, "Lkotlinx/datetime/LocalTime;", "time", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;IIIII)V", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDateTime;)I", "Ljava/io/ObjectInputStream;", "ois", "Ll83/a0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDateTime;", "getYear", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "()Lpc3/m;", "getDayOfMonth", "getDayOfMonth$annotations", "getDay", "Lpc3/d;", "()Lpc3/d;", "dayOfWeek", "getDayOfYear", "dayOfYear", "getHour", "getMinute", "getSecond", "getNanosecond", "getDate", "()Lkotlinx/datetime/LocalDate;", "getTime", "()Lkotlinx/datetime/LocalTime;", "Companion", "pc3/j", "pc3/k", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35891j.class)
public final class LocalDateTime implements Comparable<LocalDateTime>, Serializable {
    public static final C29088j Companion = new C29088j();
    private static final LocalDateTime MAX;
    private static final LocalDateTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDateTime value;

    static {
        java.time.LocalDateTime MIN2 = java.time.LocalDateTime.MIN;
        AbstractC22676k.m65749i(MIN2, "MIN");
        MIN = new LocalDateTime(MIN2);
        java.time.LocalDateTime MAX2 = java.time.LocalDateTime.MAX;
        AbstractC22676k.m65749i(MAX2, "MAX");
        MAX = new LocalDateTime(MAX2);
    }

    public LocalDateTime(java.time.LocalDateTime value) {
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
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new C29093o(4, this);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof LocalDateTime) && AbstractC22676k.m65745e(this.value, ((LocalDateTime) other).value);
        }
        return true;
    }

    public final LocalDate getDate() {
        java.time.LocalDate localDate = this.value.toLocalDate();
        AbstractC22676k.m65749i(localDate, "toLocalDate(...)");
        return new LocalDate(localDate);
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    /* JADX INFO: renamed from: getDayOfWeek, reason: collision with other method in class */
    public final EnumC29082d m134407getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        AbstractC22676k.m65749i(dayOfWeek, "getDayOfWeek(...)");
        return (EnumC29082d) EnumC29082d.f117676x.get(dayOfWeek.getValue() - 1);
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    /* JADX INFO: renamed from: getMonth, reason: collision with other method in class */
    public final EnumC29091m m134408getMonth() {
        Month month = this.value.getMonth();
        AbstractC22676k.m65749i(month, "getMonth(...)");
        return AbstractC22674j.m65710R(month);
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final LocalTime getTime() {
        java.time.LocalTime localTime = this.value.toLocalTime();
        AbstractC22676k.m65749i(localTime, "toLocalTime(...)");
        return new LocalTime(localTime);
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDateTime getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String string = this.value.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalDateTime other) {
        AbstractC22676k.m65750j(other, "other");
        return this.value.compareTo((ChronoLocalDateTime<?>) other.value);
    }

    public final Month getMonth() {
        Month month = this.value.getMonth();
        AbstractC22676k.m65749i(month, "getMonth(...)");
        return month;
    }

    public /* synthetic */ LocalDateTime(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, i16, i17, (i24 & 32) != 0 ? 0 : i18, (i24 & 64) != 0 ? 0 : i19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        try {
            java.time.LocalDateTime localDateTimeOf = java.time.LocalDateTime.of(i13, i14, i15, i16, i17, i18, i19);
            AbstractC22676k.m65747g(localDateTimeOf);
            this(localDateTimeOf);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public final DayOfWeek getDayOfWeek() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        AbstractC22676k.m65749i(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    public /* synthetic */ LocalDateTime(int i13, EnumC29091m enumC29091m, int i14, int i15, int i16, int i17, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, enumC29091m, i14, i15, i16, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalDateTime(LocalDate date, LocalTime time) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(time, "time");
        java.time.LocalDateTime localDateTimeOf = java.time.LocalDateTime.of(date.getValue(), time.getValue());
        AbstractC22676k.m65749i(localDateTimeOf, "of(...)");
        this(localDateTimeOf);
    }

    public /* synthetic */ LocalDateTime(int i13, Month month, int i14, int i15, int i16, int i17, int i18, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, month, i14, i15, i16, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public LocalDateTime(int i13, Month month, int i14, int i15, int i16, int i17, int i18) {
        this(i13, AbstractC22674j.m65710R(month), i14, i15, i16, i17, i18);
        AbstractC22676k.m65750j(month, "month");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDateTime(int i13, EnumC29091m month, int i14, int i15, int i16, int i17, int i18) {
        this(i13, month.ordinal() + 1, i14, i15, i16, i17, i18);
        AbstractC22676k.m65750j(month, "month");
    }
}
