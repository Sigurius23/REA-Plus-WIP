package p316m1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: m1.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C24920r {

    /* JADX INFO: renamed from: a */
    public final int f97599a;

    /* JADX INFO: renamed from: b */
    public final int f97600b;

    /* JADX INFO: renamed from: c */
    public final int f97601c;

    /* JADX INFO: renamed from: d */
    public final int f97602d;

    /* JADX INFO: renamed from: e */
    public final long f97603e;

    public C24920r(int i13, int i14, int i15, long j7, int i16) {
        this.f97599a = i13;
        this.f97600b = i14;
        this.f97601c = i15;
        this.f97602d = i16;
        this.f97603e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24920r)) {
            return false;
        }
        C24920r c24920r = (C24920r) obj;
        return this.f97599a == c24920r.f97599a && this.f97600b == c24920r.f97600b && this.f97601c == c24920r.f97601c && this.f97602d == c24920r.f97602d && this.f97603e == c24920r.f97603e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97603e) + AbstractC11266d.m30448b(this.f97602d, AbstractC11266d.m30448b(this.f97601c, AbstractC11266d.m30448b(this.f97600b, Integer.hashCode(this.f97599a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CalendarMonth(year=");
        sb4.append(this.f97599a);
        sb4.append(", month=");
        sb4.append(this.f97600b);
        sb4.append(", numberOfDays=");
        sb4.append(this.f97601c);
        sb4.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb4.append(this.f97602d);
        sb4.append(", startUtcTimeMillis=");
        return AbstractC2875y.m8302o(sb4, this.f97603e, ')');
    }
}
