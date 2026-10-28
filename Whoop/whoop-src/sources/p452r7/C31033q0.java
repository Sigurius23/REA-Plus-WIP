package p452r7;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31033q0 implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31023l0 f128016y = new C31023l0();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f128017z;

    /* JADX INFO: renamed from: w */
    public final double f128018w;

    /* JADX INFO: renamed from: x */
    public final EnumC31031p0 f128019x;

    static {
        EnumC31031p0[] enumC31031p0ArrValues = EnumC31031p0.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31031p0ArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31031p0 enumC31031p0 : enumC31031p0ArrValues) {
            linkedHashMap.put(enumC31031p0, new C31033q0(0.0d, enumC31031p0));
        }
        f128017z = linkedHashMap;
    }

    public C31033q0(double d3, EnumC31031p0 enumC31031p0) {
        this.f128018w = d3;
        this.f128019x = enumC31031p0;
    }

    /* JADX INFO: renamed from: a */
    public final double m95561a() {
        return this.f128019x.mo95559a() * this.f128018w;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31033q0 other = (C31033q0) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f128019x == other.f128019x ? Double.compare(this.f128018w, other.f128018w) : Double.compare(m95561a(), other.m95561a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31033q0)) {
            return false;
        }
        C31033q0 c31033q0 = (C31033q0) obj;
        if (this.f128019x == c31033q0.f128019x) {
            return this.f128018w == c31033q0.f128018w;
        }
        return m95561a() == c31033q0.m95561a();
    }

    public final int hashCode() {
        return Double.hashCode(m95561a());
    }

    public final String toString() {
        return this.f128018w + ' ' + this.f128019x.mo95560b();
    }
}
