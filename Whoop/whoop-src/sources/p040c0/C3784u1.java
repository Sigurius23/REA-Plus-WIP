package p040c0;

import java.util.LinkedHashMap;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3784u1 {

    /* JADX INFO: renamed from: a */
    public final C3742g1 f15430a;

    /* JADX INFO: renamed from: b */
    public final C3778s1 f15431b;

    /* JADX INFO: renamed from: c */
    public final C3753k0 f15432c;

    /* JADX INFO: renamed from: d */
    public final C3757l1 f15433d;

    /* JADX INFO: renamed from: e */
    public final boolean f15434e;

    /* JADX INFO: renamed from: f */
    public final Map f15435f;

    public C3784u1(C3742g1 c3742g1, C3778s1 c3778s1, C3753k0 c3753k0, C3757l1 c3757l1, boolean z4, Map map) {
        this.f15430a = c3742g1;
        this.f15431b = c3778s1;
        this.f15432c = c3753k0;
        this.f15433d = c3757l1;
        this.f15434e = z4;
        this.f15435f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3784u1)) {
            return false;
        }
        C3784u1 c3784u1 = (C3784u1) obj;
        return AbstractC22676k.m65745e(this.f15430a, c3784u1.f15430a) && AbstractC22676k.m65745e(this.f15431b, c3784u1.f15431b) && AbstractC22676k.m65745e(this.f15432c, c3784u1.f15432c) && AbstractC22676k.m65745e(this.f15433d, c3784u1.f15433d) && this.f15434e == c3784u1.f15434e && AbstractC22676k.m65745e(this.f15435f, c3784u1.f15435f);
    }

    public final int hashCode() {
        C3742g1 c3742g1 = this.f15430a;
        int iHashCode = (c3742g1 == null ? 0 : c3742g1.hashCode()) * 31;
        C3778s1 c3778s1 = this.f15431b;
        int iHashCode2 = (iHashCode + (c3778s1 == null ? 0 : c3778s1.hashCode())) * 31;
        C3753k0 c3753k0 = this.f15432c;
        int iHashCode3 = (iHashCode2 + (c3753k0 == null ? 0 : c3753k0.hashCode())) * 31;
        C3757l1 c3757l1 = this.f15433d;
        return this.f15435f.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (c3757l1 != null ? c3757l1.hashCode() : 0)) * 31, 31, this.f15434e);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TransitionData(fade=");
        sb4.append(this.f15430a);
        sb4.append(", slide=");
        sb4.append(this.f15431b);
        sb4.append(", changeSize=");
        sb4.append(this.f15432c);
        sb4.append(", scale=");
        sb4.append(this.f15433d);
        sb4.append(", hold=");
        sb4.append(this.f15434e);
        sb4.append(", effectsMap=");
        return AbstractC30802r.m94764m(sb4, this.f15435f, ')');
    }

    public /* synthetic */ C3784u1(C3742g1 c3742g1, C3778s1 c3778s1, C3753k0 c3753k0, C3757l1 c3757l1, LinkedHashMap linkedHashMap, int i13) {
        this((i13 & 1) != 0 ? null : c3742g1, (i13 & 2) != 0 ? null : c3778s1, (i13 & 4) != 0 ? null : c3753k0, (i13 & 8) != 0 ? null : c3757l1, (i13 & 16) == 0, (i13 & 32) != 0 ? C25272z.f99163w : linkedHashMap);
    }
}
