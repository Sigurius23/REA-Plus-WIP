package p452r7;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31045w0 implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31035r0 f128028y = new C31035r0();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f128029z;

    /* JADX INFO: renamed from: w */
    public final double f128030w;

    /* JADX INFO: renamed from: x */
    public final EnumC31043v0 f128031x;

    static {
        EnumC31043v0[] enumC31043v0ArrValues = EnumC31043v0.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31043v0ArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31043v0 enumC31043v0 : enumC31043v0ArrValues) {
            linkedHashMap.put(enumC31043v0, new C31045w0(0.0d, enumC31043v0));
        }
        f128029z = linkedHashMap;
    }

    public C31045w0(double d3, EnumC31043v0 enumC31043v0) {
        this.f128030w = d3;
        this.f128031x = enumC31043v0;
    }

    /* JADX INFO: renamed from: a */
    public final double m95569a() {
        return this.f128031x.mo95564a() * this.f128030w;
    }

    /* JADX INFO: renamed from: b */
    public final C31045w0 m95570b() {
        return (C31045w0) AbstractC25247g0.m73986U(this.f128031x, f128029z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31045w0 other = (C31045w0) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f128031x == other.f128031x ? Double.compare(this.f128030w, other.f128030w) : Double.compare(m95569a(), other.m95569a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31045w0)) {
            return false;
        }
        C31045w0 c31045w0 = (C31045w0) obj;
        if (this.f128031x == c31045w0.f128031x) {
            return this.f128030w == c31045w0.f128030w;
        }
        return m95569a() == c31045w0.m95569a();
    }

    public final int hashCode() {
        return Double.hashCode(m95569a());
    }

    public final String toString() {
        return this.f128030w + ' ' + this.f128031x.mo95565b();
    }
}
