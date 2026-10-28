package p452r7;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C31006d implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final LinkedHashMap f127993y;

    /* JADX INFO: renamed from: w */
    public final double f127994w;

    /* JADX INFO: renamed from: x */
    public final EnumC31004c f127995x;

    static {
        EnumC31004c[] enumC31004cArrValues = EnumC31004c.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31004cArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31004c enumC31004c : enumC31004cArrValues) {
            linkedHashMap.put(enumC31004c, new C31006d(0.0d, enumC31004c));
        }
        f127993y = linkedHashMap;
    }

    public C31006d(double d3, EnumC31004c enumC31004c) {
        this.f127994w = d3;
        this.f127995x = enumC31004c;
    }

    /* JADX INFO: renamed from: a */
    public final double m95543a() {
        return this.f127995x.mo95536a() * this.f127994w;
    }

    /* JADX INFO: renamed from: b */
    public final C31006d m95544b() {
        return (C31006d) AbstractC25247g0.m73986U(this.f127995x, f127993y);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31006d other = (C31006d) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f127995x == other.f127995x ? Double.compare(this.f127994w, other.f127994w) : Double.compare(m95543a(), other.m95543a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31006d)) {
            return false;
        }
        C31006d c31006d = (C31006d) obj;
        if (this.f127995x == c31006d.f127995x) {
            return this.f127994w == c31006d.f127994w;
        }
        return m95543a() == c31006d.m95543a();
    }

    public final int hashCode() {
        return Double.hashCode(m95543a());
    }

    public final String toString() {
        return this.f127994w + ' ' + this.f127995x.mo95537b();
    }
}
