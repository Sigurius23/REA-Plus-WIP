package kotlinx.datetime;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.AbstractC29099u;
import pc3.C29093o;
import pc3.C29098t;
import pc3.EnumC29091m;
import vc3.C35897p;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001:B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0014\u0010*\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0011\u0010\t\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00104\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m65681d2 = {"Lkotlinx/datetime/YearMonth;", "", "Ljava/io/Serializable;", "Ljava/time/YearMonth;", "value", "<init>", "(Ljava/time/YearMonth;)V", "", "year", "month", "(II)V", "Lpc3/m;", "(ILpc3/m;)V", "Ljava/io/ObjectInputStream;", "ois", "Ll83/a0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "writeReplace", "()Ljava/lang/Object;", "that", "Lkotlinx/datetime/i;", "rangeTo", "(Lkotlinx/datetime/YearMonth;)Lkotlinx/datetime/i;", "rangeUntil", "other", "compareTo", "(Lkotlinx/datetime/YearMonth;)I", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/time/YearMonth;", "getValue$kotlinx_datetime", "()Ljava/time/YearMonth;", "getYear", "getMonthNumber$kotlinx_datetime", "monthNumber", "getMonth", "()Lpc3/m;", "Lkotlinx/datetime/LocalDate;", "getFirstDay", "()Lkotlinx/datetime/LocalDate;", "firstDay", "getLastDay", "lastDay", "getNumberOfDays", "numberOfDays", "Lkotlinx/datetime/g;", "getDays", "()Lkotlinx/datetime/g;", "days", "Companion", "pc3/t", "kotlinx-datetime"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i(with = C35897p.class)
public final class YearMonth implements Comparable<YearMonth>, Serializable {
    public static final C29098t Companion = new C29098t();
    private static final long serialVersionUID = 0;
    private final java.time.YearMonth value;

    public YearMonth(java.time.YearMonth value) {
        AbstractC22676k.m65750j(value, "value");
        this.value = value;
    }

    private final void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new C29093o(11, this);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof YearMonth) && AbstractC22676k.m65745e(this.value, ((YearMonth) other).value);
        }
        return true;
    }

    public final C22726g getDays() {
        return getFirstDay().rangeTo(getLastDay());
    }

    public final LocalDate getFirstDay() {
        java.time.LocalDate localDateAtDay = this.value.atDay(1);
        AbstractC22676k.m65749i(localDateAtDay, "atDay(...)");
        return new LocalDate(localDateAtDay);
    }

    public final LocalDate getLastDay() {
        java.time.LocalDate localDateAtEndOfMonth = this.value.atEndOfMonth();
        AbstractC22676k.m65749i(localDateAtEndOfMonth, "atEndOfMonth(...)");
        return new LocalDate(localDateAtEndOfMonth);
    }

    public final EnumC29091m getMonth() {
        Month month = this.value.getMonth();
        AbstractC22676k.m65749i(month, "getMonth(...)");
        return AbstractC22674j.m65710R(month);
    }

    public final int getMonthNumber$kotlinx_datetime() {
        return this.value.getMonthValue();
    }

    public final int getNumberOfDays() {
        return this.value.lengthOfMonth();
    }

    /* JADX INFO: renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.YearMonth getValue() {
        return this.value;
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final C22728i rangeTo(YearMonth that) {
        AbstractC22676k.m65750j(that, "that");
        return new C22728i(this, that);
    }

    public final C22728i rangeUntil(YearMonth that) {
        AbstractC22676k.m65750j(that, "that");
        C22728i c22728i = C22728i.f89404z;
        AbstractC22676k.m65750j(Companion, "<this>");
        LocalDate.Companion.getClass();
        LocalDate localDate = LocalDate.MIN;
        AbstractC22676k.m65750j(localDate, "<this>");
        if (that.equals(new YearMonth(localDate.getYear(), localDate.m134405getMonth()))) {
            return C22728i.f89404z;
        }
        DateTimeUnit.Companion.getClass();
        DateTimeUnit.MonthBased unit = DateTimeUnit.MONTH;
        AbstractC22676k.m65750j(unit, "unit");
        long j7 = 1;
        return new C22728i(this, j7 != Long.MIN_VALUE ? AbstractC22727h.m65803c(that, -j7, unit) : AbstractC22727h.m65803c(AbstractC22727h.m65803c(that, Long.MAX_VALUE, unit), j7, unit));
    }

    public String toString() {
        String str = ((DateTimeFormatter) AbstractC29099u.f117693a.getValue()).format(this.value);
        AbstractC22676k.m65749i(str, "format(...)");
        return str;
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth other) {
        AbstractC22676k.m65750j(other, "other");
        return this.value.compareTo(other.value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public YearMonth(int i13, int i14) {
        try {
            java.time.YearMonth yearMonthOf = java.time.YearMonth.of(i13, i14);
            AbstractC22676k.m65747g(yearMonthOf);
            this(yearMonthOf);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public YearMonth(int i13, EnumC29091m month) {
        AbstractC22676k.m65750j(month, "month");
        try {
            Month monthOf = Month.of(month.ordinal() + 1);
            AbstractC22676k.m65749i(monthOf, "of(...)");
            java.time.YearMonth yearMonthOf = java.time.YearMonth.of(i13, monthOf);
            AbstractC22676k.m65747g(yearMonthOf);
            this(yearMonthOf);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }
}
