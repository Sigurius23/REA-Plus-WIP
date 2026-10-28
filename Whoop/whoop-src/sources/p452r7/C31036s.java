package p452r7;

import java.util.LinkedHashMap;
import java.util.Locale;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C31036s implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31022l f128022y = new C31022l();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f128023z;

    /* JADX INFO: renamed from: w */
    public final double f128024w;

    /* JADX INFO: renamed from: x */
    public final EnumC31034r f128025x;

    static {
        EnumC31034r[] enumC31034rArrValues = EnumC31034r.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31034rArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31034r enumC31034r : enumC31034rArrValues) {
            linkedHashMap.put(enumC31034r, new C31036s(0.0d, enumC31034r));
        }
        f128023z = linkedHashMap;
    }

    public C31036s(double d3, EnumC31034r enumC31034r) {
        this.f128024w = d3;
        this.f128025x = enumC31034r;
    }

    /* JADX INFO: renamed from: a */
    public final double m95562a() {
        return this.f128025x.mo95558a() * this.f128024w;
    }

    /* JADX INFO: renamed from: b */
    public final C31036s m95563b() {
        return (C31036s) AbstractC25247g0.m73986U(this.f128025x, f128023z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31036s other = (C31036s) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f128025x == other.f128025x ? Double.compare(this.f128024w, other.f128024w) : Double.compare(m95562a(), other.m95562a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31036s)) {
            return false;
        }
        C31036s c31036s = (C31036s) obj;
        if (this.f128025x == c31036s.f128025x) {
            return this.f128024w == c31036s.f128024w;
        }
        return m95562a() == c31036s.m95562a();
    }

    public final int hashCode() {
        return Double.hashCode(m95562a());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f128024w);
        sb4.append(' ');
        String lowerCase = this.f128025x.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        sb4.append(lowerCase);
        return sb4.toString();
    }
}
