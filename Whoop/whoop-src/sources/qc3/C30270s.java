package qc3;

import d13.AbstractC11478a;
import kotlinx.datetime.AbstractC22725f;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.LocalDate;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.EnumC29082d;
import pc3.EnumC29091m;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C30270s implements InterfaceC30239f1, InterfaceC30240g, InterfaceC34764b {

    /* JADX INFO: renamed from: a */
    public final C30278w f123814a;

    /* JADX INFO: renamed from: b */
    public Integer f123815b;

    /* JADX INFO: renamed from: c */
    public Integer f123816c;

    /* JADX INFO: renamed from: d */
    public Integer f123817d;

    public C30270s(C30278w c30278w, Integer num, Integer num2, Integer num3) {
        this.f123814a = c30278w;
        this.f123815b = num;
        this.f123816c = num2;
        this.f123817d = num3;
    }

    @Override // uc3.InterfaceC34764b
    /* JADX INFO: renamed from: a */
    public final Object mo92535a() {
        C30278w c30278w = this.f123814a;
        return new C30270s(new C30278w(c30278w.f123834a, c30278w.f123835b), this.f123815b, this.f123816c, this.f123817d);
    }

    /* JADX INFO: renamed from: b */
    public final LocalDate m92536b() {
        LocalDate localDate;
        C30278w c30278w = this.f123814a;
        Integer num = c30278w.f123834a;
        AbstractC30257l1.m92518a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.f123817d;
        if (num2 == null) {
            Integer num3 = c30278w.f123835b;
            AbstractC30257l1.m92518a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.f123815b;
            AbstractC30257l1.m92518a(num4, "day");
            localDate = new LocalDate(iIntValue, iIntValue2, num4.intValue());
        } else {
            LocalDate localDate2 = new LocalDate(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            DateTimeUnit.Companion.getClass();
            DateTimeUnit.DayBased unit = DateTimeUnit.DAY;
            AbstractC22676k.m65750j(unit, "unit");
            LocalDate localDateM65800a = AbstractC22725f.m65800a(localDate2, iIntValue3, unit);
            if (localDateM65800a.getYear() != iIntValue) {
                throw new DateTimeFormatException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
            }
            if (c30278w.f123835b != null) {
                EnumC29091m enumC29091mM134405getMonth = localDateM65800a.m134405getMonth();
                AbstractC22676k.m65750j(enumC29091mM134405getMonth, "<this>");
                int iOrdinal = enumC29091mM134405getMonth.ordinal() + 1;
                Integer num5 = c30278w.f123835b;
                if (num5 == null || iOrdinal != num5.intValue()) {
                    StringBuilder sb4 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb4.append(num2);
                    sb4.append(", which is ");
                    sb4.append(localDateM65800a.m134405getMonth());
                    sb4.append(", but ");
                    throw new DateTimeFormatException(AbstractC11478a.m30859k(sb4, c30278w.f123835b, " was specified as the month number"));
                }
            }
            if (this.f123815b != null) {
                int day = localDateM65800a.getDay();
                Integer num6 = this.f123815b;
                if (num6 == null || day != num6.intValue()) {
                    StringBuilder sb5 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                    sb5.append(num2);
                    sb5.append(", which is the day ");
                    sb5.append(localDateM65800a.getDay());
                    sb5.append(" of ");
                    sb5.append(localDateM65800a.m134405getMonth());
                    sb5.append(", but ");
                    throw new DateTimeFormatException(AbstractC11478a.m30859k(sb5, this.f123815b, " was specified as the day of month"));
                }
            }
            localDate = localDateM65800a;
        }
        Integer num7 = this.f123816c;
        if (num7 != null) {
            int iIntValue4 = num7.intValue();
            EnumC29082d enumC29082dM134404getDayOfWeek = localDate.m134404getDayOfWeek();
            AbstractC22676k.m65750j(enumC29082dM134404getDayOfWeek, "<this>");
            if (iIntValue4 != enumC29082dM134404getDayOfWeek.ordinal() + 1) {
                StringBuilder sb6 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(iIntValue4, "Expected ISO day-of-week number in 1..7, got ").toString());
                }
                sb6.append((EnumC29082d) EnumC29082d.f117676x.get(iIntValue4 - 1));
                sb6.append(" but the date is ");
                sb6.append(localDate);
                sb6.append(", which is a ");
                sb6.append(localDate.m134404getDayOfWeek());
                throw new DateTimeFormatException(sb6.toString());
            }
        }
        return localDate;
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: e */
    public final void mo92513e(Integer num) {
        this.f123815b = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30270s)) {
            return false;
        }
        C30270s c30270s = (C30270s) obj;
        return AbstractC22676k.m65745e(this.f123814a, c30270s.f123814a) && AbstractC22676k.m65745e(this.f123815b, c30270s.f123815b) && AbstractC22676k.m65745e(this.f123816c, c30270s.f123816c) && AbstractC22676k.m65745e(this.f123817d, c30270s.f123817d);
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: f */
    public final void mo92514f(Integer num) {
        this.f123816c = num;
    }

    @Override // qc3.InterfaceC30240g
    public final Integer getDayOfWeek() {
        return this.f123816c;
    }

    @Override // qc3.InterfaceC30240g
    public final Integer getDayOfYear() {
        return this.f123817d;
    }

    @Override // qc3.InterfaceC30239f1
    public final Integer getYear() {
        return this.f123814a.f123834a;
    }

    public final int hashCode() {
        int iHashCode = this.f123814a.hashCode() * 29791;
        Integer num = this.f123815b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.f123816c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.f123817d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: i */
    public final void mo92515i(Integer num) {
        this.f123817d = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: m */
    public final void mo92510m(Integer num) {
        this.f123814a.f123835b = num;
    }

    @Override // qc3.InterfaceC30240g
    /* JADX INFO: renamed from: q */
    public final Integer mo92516q() {
        return this.f123815b;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: r */
    public final void mo92511r(Integer num) {
        this.f123814a.f123834a = num;
    }

    @Override // qc3.InterfaceC30239f1
    /* JADX INFO: renamed from: s */
    public final Integer mo92512s() {
        return this.f123814a.f123835b;
    }

    public final String toString() {
        Integer num = this.f123817d;
        C30278w c30278w = this.f123814a;
        if (num == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(c30278w);
            sb4.append('-');
            Object obj = this.f123815b;
            if (obj == null) {
                obj = "??";
            }
            sb4.append(obj);
            sb4.append(" (day of week is ");
            Integer num2 = this.f123816c;
            return AbstractC11478a.m30860l(sb4, num2 != null ? num2 : "??", ')');
        }
        if (this.f123815b == null && c30278w.f123835b == null) {
            StringBuilder sb5 = new StringBuilder("(");
            Object obj2 = c30278w.f123834a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb5.append(obj2);
            sb5.append(")-");
            sb5.append(this.f123817d);
            sb5.append(" (day of week is ");
            Integer num3 = this.f123816c;
            return AbstractC11478a.m30860l(sb5, num3 != null ? num3 : "??", ')');
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(c30278w);
        sb6.append('-');
        Object obj3 = this.f123815b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb6.append(obj3);
        sb6.append(" (day of week is ");
        Integer num4 = this.f123816c;
        sb6.append(num4 != null ? num4 : "??");
        sb6.append(", day of year is ");
        sb6.append(this.f123817d);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ C30270s() {
        this(new C30278w(null, null), null, null, null);
    }
}
