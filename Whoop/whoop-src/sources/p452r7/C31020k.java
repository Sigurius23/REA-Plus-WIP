package p452r7;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C31020k implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31008e f128009y = new C31008e();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f128010z;

    /* JADX INFO: renamed from: w */
    public final double f128011w;

    /* JADX INFO: renamed from: x */
    public final EnumC31018j f128012x;

    static {
        EnumC31018j[] enumC31018jArrValues = EnumC31018j.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31018jArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31018j enumC31018j : enumC31018jArrValues) {
            linkedHashMap.put(enumC31018j, new C31020k(0.0d, enumC31018j));
        }
        f128010z = linkedHashMap;
    }

    public C31020k(double d3, EnumC31018j enumC31018j) {
        this.f128011w = d3;
        this.f128012x = enumC31018j;
    }

    /* JADX INFO: renamed from: a */
    public final double m95553a(EnumC31018j enumC31018j) {
        return this.f128012x == enumC31018j ? this.f128011w : m95554b() / enumC31018j.mo95549a();
    }

    /* JADX INFO: renamed from: b */
    public final double m95554b() {
        return this.f128012x.mo95549a() * this.f128011w;
    }

    /* JADX INFO: renamed from: c */
    public final C31020k m95555c() {
        return (C31020k) AbstractC25247g0.m73986U(this.f128012x, f128010z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31020k other = (C31020k) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f128012x == other.f128012x ? Double.compare(this.f128011w, other.f128011w) : Double.compare(m95554b(), other.m95554b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31020k)) {
            return false;
        }
        C31020k c31020k = (C31020k) obj;
        if (this.f128012x == c31020k.f128012x) {
            return this.f128011w == c31020k.f128011w;
        }
        return m95554b() == c31020k.m95554b();
    }

    public final int hashCode() {
        return Double.hashCode(m95554b());
    }

    public final String toString() {
        return this.f128011w + ' ' + this.f128012x.mo95550b();
    }
}
