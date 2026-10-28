package p452r7;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31015h0 implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31007d0 f127999y = new C31007d0();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f128000z;

    /* JADX INFO: renamed from: w */
    public final double f128001w;

    /* JADX INFO: renamed from: x */
    public final EnumC31013g0 f128002x;

    static {
        EnumC31013g0[] enumC31013g0ArrValues = EnumC31013g0.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31013g0ArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31013g0 enumC31013g0 : enumC31013g0ArrValues) {
            linkedHashMap.put(enumC31013g0, new C31015h0(0.0d, enumC31013g0));
        }
        f128000z = linkedHashMap;
    }

    public C31015h0(double d3, EnumC31013g0 enumC31013g0) {
        this.f128001w = d3;
        this.f128002x = enumC31013g0;
    }

    /* JADX INFO: renamed from: a */
    public final double m95551a() {
        return this.f128002x.mo95548b() * this.f128001w;
    }

    /* JADX INFO: renamed from: b */
    public final C31015h0 m95552b() {
        return (C31015h0) AbstractC25247g0.m73986U(this.f128002x, f128000z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31015h0 other = (C31015h0) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f128002x == other.f128002x ? Double.compare(this.f128001w, other.f128001w) : Double.compare(m95551a(), other.m95551a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31015h0)) {
            return false;
        }
        C31015h0 c31015h0 = (C31015h0) obj;
        if (this.f128002x == c31015h0.f128002x) {
            return this.f128001w == c31015h0.f128001w;
        }
        return m95551a() == c31015h0.m95551a();
    }

    public final int hashCode() {
        return Double.hashCode(m95551a());
    }

    public final String toString() {
        return this.f128001w + ' ' + this.f128002x.mo95547a();
    }
}
