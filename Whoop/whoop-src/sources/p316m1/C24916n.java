package p316m1;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C24916n implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f97589w;

    /* JADX INFO: renamed from: x */
    public final int f97590x;

    /* JADX INFO: renamed from: y */
    public final int f97591y;

    /* JADX INFO: renamed from: z */
    public final long f97592z;

    public C24916n(int i13, int i14, long j7, int i15) {
        this.f97589w = i13;
        this.f97590x = i14;
        this.f97591y = i15;
        this.f97592z = j7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC22676k.m65752l(this.f97592z, ((C24916n) obj).f97592z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24916n)) {
            return false;
        }
        C24916n c24916n = (C24916n) obj;
        return this.f97589w == c24916n.f97589w && this.f97590x == c24916n.f97590x && this.f97591y == c24916n.f97591y && this.f97592z == c24916n.f97592z;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97592z) + AbstractC11266d.m30448b(this.f97591y, AbstractC11266d.m30448b(this.f97590x, Integer.hashCode(this.f97589w) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CalendarDate(year=");
        sb4.append(this.f97589w);
        sb4.append(", month=");
        sb4.append(this.f97590x);
        sb4.append(", dayOfMonth=");
        sb4.append(this.f97591y);
        sb4.append(", utcTimeMillis=");
        return AbstractC2875y.m8302o(sb4, this.f97592z, ')');
    }
}
