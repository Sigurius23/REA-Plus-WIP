package p452r7;

import java.util.LinkedHashMap;
import java.util.Locale;
import m83.AbstractC25247g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31003b0 implements Comparable {

    /* JADX INFO: renamed from: y */
    public static final C31038t f127986y = new C31038t();

    /* JADX INFO: renamed from: z */
    public static final LinkedHashMap f127987z;

    /* JADX INFO: renamed from: w */
    public final double f127988w;

    /* JADX INFO: renamed from: x */
    public final EnumC31001a0 f127989x;

    static {
        EnumC31001a0[] enumC31001a0ArrValues = EnumC31001a0.values();
        int iM73988W = AbstractC25247g0.m73988W(enumC31001a0ArrValues.length);
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (EnumC31001a0 enumC31001a0 : enumC31001a0ArrValues) {
            linkedHashMap.put(enumC31001a0, new C31003b0(0.0d, enumC31001a0));
        }
        f127987z = linkedHashMap;
    }

    public C31003b0(double d3, EnumC31001a0 enumC31001a0) {
        this.f127988w = d3;
        this.f127989x = enumC31001a0;
    }

    /* JADX INFO: renamed from: a */
    public final double m95539a(EnumC31001a0 enumC31001a0) {
        return this.f127989x == enumC31001a0 ? this.f127988w : m95540b() / enumC31001a0.mo95538a();
    }

    /* JADX INFO: renamed from: b */
    public final double m95540b() {
        return this.f127989x.mo95538a() * this.f127988w;
    }

    /* JADX INFO: renamed from: c */
    public final C31003b0 m95541c() {
        return (C31003b0) AbstractC25247g0.m73986U(this.f127989x, f127987z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31003b0 other = (C31003b0) obj;
        AbstractC22676k.m65750j(other, "other");
        return this.f127989x == other.f127989x ? Double.compare(this.f127988w, other.f127988w) : Double.compare(m95540b(), other.m95540b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31003b0)) {
            return false;
        }
        C31003b0 c31003b0 = (C31003b0) obj;
        if (this.f127989x == c31003b0.f127989x) {
            return this.f127988w == c31003b0.f127988w;
        }
        return m95540b() == c31003b0.m95540b();
    }

    public final int hashCode() {
        return Double.hashCode(m95540b());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f127988w);
        sb4.append(' ');
        String lowerCase = this.f127989x.name().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        sb4.append(lowerCase);
        return sb4.toString();
    }
}
